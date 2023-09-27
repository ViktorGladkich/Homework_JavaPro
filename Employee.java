package HR_Management;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Setter
@Getter
@ToString
public class Employee {
    private String id;
    private String name;
    private String surName;
    private Grade grade;
    private double salary;
    private double bonusPct;
    private boolean hasPlanBeenCompleted;
    private Department department;

}
