package com.ArrayListStudy;

public class Student {

    private final String name;
    private final int age;
    private final int tall;

    public Student(String name, int age, int tall) {
        this.name = name;
        this.age = age;
        this.tall = tall;
    }

    public String getName() {
        return this.name;
    }
}
