package ro.ase.cts.test;

import org.junit.Test;
import ro.ase.cts.Student;

import static org.junit.Assert.*;

public class StudentTests {

    @Test
    public void defaultConstructorTest() {
        // Arrange & Act
        Student student = new Student();

        // Assert
        assertEquals("The name is not correctly initialized", "Anonymous", student.getName());
        assertEquals("The age is not correctly initialized", 18, student.getAge());
    }

    @Test
    public void constructorWithParametersTest() {
        //Arrange
        String name = "Ion Ion";
        int age = 21;

        //Act
        Student student = new Student(name, age);

        // Assert
        assertEquals("The name is not correctly initialized", name, student.getName());
        assertEquals("The age is not correctly initialized", age, student.getAge());
    }

    @Test
    public void testComputeAverageConformance() {
        // Arrange
        int[] grades = {9, 9, 10};
        Student student = new Student();
        student.setGrades(grades);

        // Act
        double result = student.computeAverage();

        // Assert
        assertEquals("The average is not truncated to two decimals!", 9.33, result, 0.001);

    }

    @Test
    public void testComputeAverageOrder() {
        int[] grades1 = {10, 9, 9};
        Student student = new Student();
        student.setGrades(grades1);

        double result1 = student.computeAverage();

        int[] grades2 = {9, 10, 9};
        student.setGrades(grades2);

        double result2 = student.computeAverage();

        assertEquals("The grades order influences the result", result1, result2, 0.001);
    }

    @Test
    public void testComputeAverageRange() {
        int[] grades = {12, 10, 9};
        Student student = new Student();
        student.setGrades(grades);

        double result = student.computeAverage();

        assertEquals("The maximum average is over 10", 10, result, 0.001);
    }


    @Test
    public void testComputeAverageExistence() {
        Student student = new Student();
        double result = student.computeAverage();

        assertEquals("The minimum average is not 1", 1, result, 0.001);
    }

    @Test
    public void testComputeAverageCardinality0() {
        int[] grades = {};
        Student student = new Student();
        student.setGrades(grades);
        double result = student.computeAverage();

        assertEquals("The minimum average is not 1", 1, result, 0.001);
    }

    @Test
    public void testComputeAverageCardinality1() {
        int[] grades = {9};
        Student student = new Student();
        student.setGrades(grades);
        double result = student.computeAverage();

        assertEquals("The average for one grade is not the grade itself", 9, result, 0.001);
    }

    @Test(timeout = 5)
    public void testComputeAverageTimeout() {
        int[] grades = {10,2,5,7,8,6,8,9,10,6,2,3,5,2,7,4};
        Student student = new Student();
        student.setGrades(grades);

        student.computeAverage();
    }
}

