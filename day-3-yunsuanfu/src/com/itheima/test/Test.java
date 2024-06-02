package com.itheima.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*

          需求：您和您的约会对象正试图在餐厅获得一张桌子。键盘录入两个整数,表示你和你约会对象衣服的时髦度。
          (手动录入0~10之间的整数,不能录其他)如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出true。否则输出false。
          */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦程度");
        int a = sc.nextInt();
        System.out.println("请输入你约会对象的时髦程度");
        int b = sc.nextInt();

        boolean result = a > b;
        System.out.println(result);
    }
}

class LogicoperatorDemo1 {
    public static void main(String[] args) {
        boolean a = true;
        String b = "你好";
        System.out.println(true);
        System.out.println(false);
        System.out.println(true);
    }

}


class Test2 {
    public static void main(String[] args) {
        /*
        * 需求：
            数字6是一个真正伟大的数字，键盘录入两个整数。
            如果其中一个为6,最终结果输出true。
            如果它们的积为6的倍数。最终结果输出true。
            其他情况都是false。
        */
        int num = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();

        boolean result = num1 == num || num2 == num || (num1 * num2) % 6 == 0;
        System.out.println("结果:" + result);

    }
}

class Test3 {
    public static void main(String[] args) {
        /*需求：动物园里有两只老虎，体重分别为通过键盘录入获得，
        请用程序实现判断两只老虎的体重是否相同。*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个老虎的体重");
        int num1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int num2 = sc.nextInt();

        String result = num1 > num2 ? "第一只老虎体重大" : "第二只老虎体重大";
        System.out.println(result);

    }
}

class Test6{
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
}

class Test7{
    public static void main(String[] args) {
        double num = 0.1;
        int count = 1;
        while (num <= 8848.0){
            num *= 2;
            count +=1;
        }

    System.out.println("需要对折："+count+"次");
    }
}


