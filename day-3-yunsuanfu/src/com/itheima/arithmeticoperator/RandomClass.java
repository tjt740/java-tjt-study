package com.itheima.arithmeticoperator;
import java.util.Random;
public class RandomClass {
    public static void main(String[] args) {
        // 2. 获取随机数
        Random r = new Random();

        // 3. 0~9的随机数
        int num = r.nextInt(10);

        // 4. 生成任意数 7~15； 【0~8 + 7 = 7~15】
        int num2 = r.nextInt(9) + 7;
    }
}

class ArrayDemo{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr.length); // 5
        // 🔼 === 🔽
        int[] arr2 = new int[]{1,2,3,4,5};
        System.out.println(arr2); // [I@1540e19d

        String[] nameList = {"谭金涛","戚思宁","周俞慧"};
        // 🔼 === 🔽
        String[] nameList2 = new String[]{"谭金涛","戚思宁","周俞慧"};

        arr[0] = 10;
        int num = arr[0];
        System.out.println(num); // 10
    }
}