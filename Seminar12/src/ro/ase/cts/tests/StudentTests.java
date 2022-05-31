package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.experimental.categories.Category;
import ro.ase.cts.Student;
import ro.ase.cts.exceptions.NullGradesException;
import ro.ase.cts.suites.SmokeTestCategory;

import java.util.Arrays;
import java.util.Random;

public class StudentTests {

    private Student student;
    private static int[] grades;

    private Random random = new Random();

    @BeforeClass
    public static void initializeGrades() {
        grades = new int[]{};
    }

    @Before
    public void initializeStudent() {
        student = new Student();
    }

    @After
    public void resetGrades() {
        student.setGrades(null);
    }

    @Test
    @Category(SmokeTestCategory.class)
    public void testRight() throws NullGradesException {

        int[] grades = {10, 9, 8, 7};
        student.setGrades(grades);

        double result = student.computeAverage();

        assertEquals("The result is not correct!",
                8.5, result, 0.009);
    }

    @Test
    public void testBoundary() {

        int[] grades = {0, 1, 2};
        student.setGrades(grades);

        double result = 0;
        try {
            result = student.computeAverage();
        } catch (NullGradesException e) {
            fail(e.getMessage());
        }

        assertEquals("The boundary average is not correct!",
                1, result, 0.009);
    }

    @Test
    @Category(SmokeTestCategory.class)
    public void testInverse() throws NullGradesException {

        int[] grades = {1, 2, 3, 4, 5, 6};
        student.setGrades(grades);
        long sum = Arrays.stream(grades).sum();
        double average = student.computeAverage();
        long actual = Math.round(average * grades.length);

        assertEquals("The inverse computation doesn't return the same result!",
                sum, actual);
    }

    @Test
    public void testCrossCheck() throws NullGradesException {

        int[] grades = {5, 6, 7, 8};
        student.setGrades(grades);
        double average = Arrays.stream(grades).average().orElse(0);
        double result = student.computeAverage();

        assertEquals("The average is not correct!",
                average, result, 0.009);
    }

    @Test(expected = NullGradesException.class)
    public void testErrorCondition() throws NullGradesException {

        int[] grades = null;
        student.setGrades(grades);
        student.computeAverage();
    }

    @Test(timeout = 5000)
    public void testPerformance() throws NullGradesException {

        for (int i = 1; i <= 1000; i++) {
            int[] grades = random.ints(1000, 1, 11).toArray();
            student.setGrades(grades);
            student.computeAverage();
        }
    }
}
