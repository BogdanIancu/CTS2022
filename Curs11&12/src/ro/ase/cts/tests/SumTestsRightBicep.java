package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.experimental.categories.Category;
import ro.ase.cts.Main;
import ro.ase.cts.exceptions.NullListException;
import ro.ase.cts.tests.suites.PerformanceCategory;

import java.util.*;

public class SumTestsRightBicep {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("X");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Y");
    }

    @Before
    public void beforeEachTest() {
        System.out.println("Message");
    }

    @After
    public void afterEachTest() {
        System.out.println("Done");
    }

    @Test
    public void testSumRight() throws NullListException {
        List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 9);
        long result = Main.sum(list);
        assertEquals("The result is not right",
                39, result);
    }

    @Test
    public void testSumBoundary() throws NullListException {
        List<Integer> list = Arrays.asList(100_000, 1);
        long result = Main.sum(list);
        assertEquals("The result is not right",
                100_000, result);
    }

    @Test
    public void testSumInverse() throws NullListException {
        List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 9);
        long result = Main.sum(list);
        for(int i = list.size() - 1; i >=0; i--) {
            result -= list.get(i);
        }
        assertEquals("The result is not right",
                0, result);
    }

    @Test
    public void testSumCrossCheck() throws NullListException {
        List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 9);
        long result = Main.sum(list);
        long actual = list.stream().mapToInt(x -> x).sum();
        assertEquals("The result is not right",
                actual, result);
    }

    @Test(expected = NullListException.class)
    public void testSumErrorCondition() throws NullListException {
        Main.sum(null);
    }

    @Test(timeout = 5000)
    @Category(PerformanceCategory.class)
    public void testSumPerformance() throws NullListException {
        Random random = new Random();
        int[] values = random.ints(5_000_000).toArray();
        List<Integer> list = new ArrayList<>();
        for(int x : values) {
            list.add(x);
        }
        Main.sum(list);
    }

}
