package org.example._2023_09_06.HomeWork;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alex", 18,Grade.B),
                new Student("Slava", 27,Grade.C),
                new Student("Maria", 24,Grade.A),
                new Student("Viktor",27,Grade.B)
        };
        Teacher[] teachers = {
                new Teacher("Ilon Mask", 35, Grade.D),
                new Teacher("Mark Zuker", 40, Grade.C),
                new Teacher("Anastasia Bersh", 51,Grade.A),
                new Teacher("Maria Bezpalai",36,Grade.B)
        };
        GradeManagementSystem system = new GradeManagementSystem(students, teachers);
        system.processStudents();
        system.processTeachers();
        system.gradeStudents();

        System.out.println("\nНовые оценки студентам ");
        system.processStudents();
    }
}

