package ro.ase.cts.tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.Main;
import ro.ase.cts.exceptions.NullListException;
import ro.ase.cts.tests.suites.PerformanceCategory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTestsCorrect {

    @Test
    public void testSumConformance() throws NullListException {
        //Arrange
        List<Integer> list = Arrays.asList(1, 2, 6, 9);
        //Act
        long result = Main.sum(list);
        //Assert
        assertEquals("The sum is not correctly computed",
                18, result);
    }

    @Test
    public void testSumOrdering() throws NullListException {
        List<Integer> list1 = Arrays.asList(1, 2, 6, 9);
        List<Integer> list2 = Arrays.asList(2, 9, 6, 1);

        long result1 = Main.sum(list1);
        long result2 = Main.sum(list2);

        assertEquals("The sum is not correctly computed when input is not ordered",
                result1, result2);
    }

    @Test
    public void testSumRange() {
        List<Integer> list = Arrays.asList(50_000, 50_001);
        long result = 0;
        try {
            result = Main.sum(list);
        } catch (NullListException e) {
            fail(e.getMessage());
        }
        assertEquals("The maximum sum is bigger than 100_000",
                100_000, result);
    }

    @Test
    public void testSumExistence() {
        try {
            Main.sum(null);
            fail("The method didn't throw an exception");
        } catch (NullListException e) {
            assertTrue("The method didn't throw an exception",true);
        }
    }

    @Test(timeout = 1000)
    @Category(PerformanceCategory.class)
    public void testSumCardinality() throws NullListException {
       List<Integer> list = new ArrayList<>();
       long result = Main.sum(list);
        assertEquals("The minimum sum is not 0", 0, result);
    }
}
