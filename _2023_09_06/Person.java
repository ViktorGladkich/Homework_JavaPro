package org.example._2023_09_06.HomeWork;

public abstract class Person {
protected String name;
protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract String getDescription();
}
