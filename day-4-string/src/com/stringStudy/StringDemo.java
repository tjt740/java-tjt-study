package com.stringStudy;

import java.util.Scanner;
import java.util.StringJoiner;

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


class StringDemo4 {
    public static void main(String[] args) {
        /*需求：
            键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是？
            对称字符串：123321、111
            非对称字符串：123123
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        // 进行字符串倒序
        String reverseStr = new StringBuilder().append(str).reverse().toString();
        if (str.equals(reverseStr)) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
    }
}

class StringDemo5 {
    public static void main(String[] args) {
        /*
        * 需求：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回。
            调用该方法，并在控制台输出结果。
            例如：数组为int[]arr={1,2,3}；
            执行方法后的输出结果为：[1，2，3]
        * */

        int[] arr = {1, 2, 3};
        String str = generateArray(arr);
        System.out.println(str);
    }

    public static String generateArray(int[] arr) {
        StringBuilder dataArr = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                dataArr.append(arr[i]).append("]");
                break;
            }
            dataArr.append(arr[i]).append(",");
        }
        return dataArr.toString();
    }
}

class StringDemo6 {
    public static void main(String[] args) {
        // 创建一个对象，并指定间隔符号
        StringJoiner sj = new StringJoiner(",");
        // 通过add添加数据
        sj.add("hello").add("world");
        System.out.println(sj);// hello,world;

        StringJoiner sj2 = new StringJoiner("---", "【", "】");
        sj2.add("谭金涛").add("戚思宁");
        System.out.println(sj2);//【谭金涛---戚思宁】

        System.out.println(sj2.toString());//【谭金涛---戚思宁】
        System.out.println(sj2.length());// 11
    }
}