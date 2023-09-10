package org.example._2023_09_06.HomeWork;

import java.util.Random;

public class Teacher extends Person{
    private Grade teacherGrade;
    private Grade[] possibleGrades = { Grade.A, Grade.B, Grade.C, Grade.D, Grade.F };
    public Teacher(String name, int age, Grade teacherGrade) {
        super(name, age);
        this.teacherGrade = teacherGrade;
    }
    public void gradeStudents(Student student) {
        Random random = new Random();
        Grade randomGrade = possibleGrades[random.nextInt(possibleGrades.length)];
        student.setGrade(randomGrade);
    }
    @Override
    public String getDescription() {
        return "Teacher: Name: " + name + ", Age: " + age + ", Teacher Grade: " + teacherGrade;
    }
}
