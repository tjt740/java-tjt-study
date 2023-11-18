package com.itheima.arithmeticoperator;
import java.util.Scanner;
public class Arithmeticoperator2 {
    public static void main(String[] args) {
        // /
        System.out.println(10/3);
        System.out.println(10.0/3);
        System.out.println(10/2);

        // 取余
        System.out.println(10%3); // 1

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");

        // 3.使用Scanner对象接收数据
        int i = sc.nextInt();

        System.out.println("个位："+  i % 10 );
        System.out.println("十位："+  i/10 % 10 );
        System.out.println("百位："+  i /100 % 10 );
    }
}


class Arithmeticoperator3{
    public static void main(String[] args) {
        int a = 10;
        double b = 12.3;
        double c = a + b;
        System.out.println(c);


        int d = 10;
        double e = 12.0;
        double f = d + e;
        System.out.println(f);

        int a1 = 10;
        long b1 = 12L;
        double c1 = 3.14;
        double d1 = a1 + b1 + c1;

    }
}

class Arithmeticoperator4{
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);
        System.out.println(c); // 正确 30


        byte a2 = 100;
        byte b2 = 100;
        byte c2 = (byte)(a2 + b2);
        System.out.println(c2); // 错误

        char a3 = 'a';
        int b3 = 0;
        int d3 = a3 + b3;
        System.out.println(d3); // 97
    }
}

class Arithmeticoperator5{
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        int c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


class Arithmeticoperator6{
    public static void main(String[] args) {
        short a = 1;
        a += 1;
        System.out.println(a); // 2
        // += -= *= /= %= 都包含强制类型转换
        // 强制类型转换 ↑↓
        //  a = (short)(a + 1);

    }
}