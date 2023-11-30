package com.Demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1;添加学生");
            System.out.println("2;删除学生");
            System.out.println("3;编辑学生");
            System.out.println("4;查询学生");
            System.out.println("5;退出");
            System.out.println("请输入操作模式");

            String num = sc.next();
            switch (num) {
                case "1":
//                    System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
//                    System.out.println("删除学生");
                    removeStudent();
                    break;
                case "3":
//                    System.out.println("编辑学生");
                    editStudent();
                    break;
                case "4":
//                    System.out.println("查询学生");
                    queryStudent();
                    break;
                case "5":
                    System.out.println("退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }

    // 添加学生
    public static void addStudent() {
    }

    // 删除学生
    public static void removeStudent() {
    }

    // 编辑学生
    public static void editStudent() {
    }

    // 查询学生
    public static void queryStudent() {
    }

}

