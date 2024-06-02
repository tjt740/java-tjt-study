package com.testdemo;

import java.util.Random;
import java.util.Scanner;

import com.testdemo.Student;

public class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // 创建原始的3个空数组
        Student[] students = new Student[3];
        // 记录数组
        Student[] record = new Student[3];
        for (int i = 0; i < students.length; i++) {
            record[i] = new Student(i + 1, "张三" + rd.nextInt(10), rd.nextInt(4) + 22);
        }

        // 手动创建学生信息
        System.out.println("请输入学生id");
        int newId = sc.nextInt();
        // 进行唯一id校验
        boolean flag = contains(record, newId);
        if (flag) {
            System.out.println("请输入学生姓名");
            String newName = sc.next();
            System.out.println("请输入学生年龄");
            int newAge = sc.nextInt();

            Student newStudent = new Student(newId, newName, newAge);
            students = new Student[students.length + 1];

            // 重新赋值
            System.arraycopy(record, 0, students, 0, record.length);
            students[students.length - 1] = newStudent;

            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].toString());
            }

        }
    }

    public static boolean contains(Student[] arr, int newId) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() == newId) {
                System.out.println("该id已存在,请重新输入");
                return false;
            }
        }
        return true;
    }
}
