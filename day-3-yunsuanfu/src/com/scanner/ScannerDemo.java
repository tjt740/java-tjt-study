package com.scanner;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个值");
        String str1 = sc.nextLine();
        System.out.println(str1);
        System.out.println("请输入第二个值");
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
