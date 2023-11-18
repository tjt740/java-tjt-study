package com.stringStudy;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        //  需求：键盘录入下个字符串，使用程序实现在控制台遍历该字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}

class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        // 大写英文统计
        int bigEngCount = 0;
        // 小写英文统计
        int smallEngCount = 0;
        // 数字统计
        int numberCount = 0;
        // 其他字符统计
        int otherCount = 0;

        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // 根据ascll表进行判断
            // 大写英文判断
            if (ch >= 'A' && ch <= 'Z') {
                bigEngCount++;
            // 小写英文判断
            } else if (ch >= 'a' && ch <= 'z') {
                smallEngCount++;
            // 数字判断
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            // 其他字符统计
            } else {
                otherCount++;
            }
        }

        System.out.println("大写英文：" + bigEngCount);
        System.out.println("小写英文：" + smallEngCount);
        System.out.println("数字：" + numberCount);
        System.out.println("其他字符：" + otherCount);
    }
}


class StringDemo3{
    public static void main(String[] args) {
        String[] arr = {"hello","world","java"};
        String str = generateArray(arr);
        System.out.println(str);
    }
    public static String generateArray(String[] arr){
        if(arr.length == 0){
            return "[]";
        }

        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i== arr.length-1){
                result += arr[i]+"]";
                break;
            }
            result += arr[i]+",";
        }
        return result;
    }
}