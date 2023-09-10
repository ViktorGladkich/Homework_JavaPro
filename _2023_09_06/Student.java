package org.example._2023_09_06.HomeWork;

public class Student extends Person implements Graded {
    private Grade grade;

    public Student(String name, int age, Grade grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                '}';
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public Grade getGrade() {
        return grade;
    }
    @Override
    public String getDescription() {
        return "Student: Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
