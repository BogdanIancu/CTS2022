package ro.ase.cts;

import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private int[] grades;

    public Student() {
        name = "Anonymous";
        age = 18;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getGrades() {
        return Arrays.copyOf(grades, grades.length);
    }

    public void setGrades(int[] grades) {
        this.grades = Arrays.copyOf(grades, grades.length);;
    }

    public double computeAverage() {
        if( grades == null || grades.length < 1 ) {
            return 1;
        }

        double average = 0;
        for(int grade : grades) {
            average += grade;
        }

        double result = Math.floor((average/grades.length)*100)/100;
        return (result > 10) ? 10 : result;
    }
}
