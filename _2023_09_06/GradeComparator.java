package org.example._2023_09_06.HomeWork;

import java.util.Comparator;

public class GradeComparator implements Comparator <Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getGrade().compareTo(student2.getGrade());
    }
}
