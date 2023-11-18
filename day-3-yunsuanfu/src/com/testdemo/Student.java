package com.testdemo;

public class Student {
    private int age;
    private String name;
    private int id;

    public Student( int id, String name, int age) {
        this.age = age;
        this.name = name;
        this.id = id;
    }


    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Student{age = " + age + ", name = " + name + ", id = " + id + "}";
    }
}
