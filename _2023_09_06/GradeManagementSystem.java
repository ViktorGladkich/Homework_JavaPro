package org.example._2023_09_06.HomeWork;

public class GradeManagementSystem {
    private Student[] students;
    private Teacher[] teachers;

    public GradeManagementSystem(Student[] students, Teacher[] teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public void processStudents() {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student.getDescription());
        }
    }

    public void processTeachers() {
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            System.out.println(teacher.getDescription());
        }

    }


    public void gradeStudents() {
        for (int i = 0; i < teachers.length; i++) {
            for (int j = 0; j < students.length; j++) {
                teachers[i].gradeStudents(students[j]);
            }
        }
    }
}


