package com.goods;


import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字");
        String str = sc.next();
//        String str = "112345a";
        checkStr(str);
        if (checkStr(str)) {
            System.out.println("true");
            System.out.println (changeNum(str));
        } else {
            System.out.println("false");
        }


    }

    public static String changeNum(String str) {
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
                      sb.append(arr[num]).append(',');
        }

        return sb.substring(0, sb.length() - 1);
    }

    public static Boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
//            System.out.println("===>>>>" + str.charAt(i));
            char currentStr = str.charAt(i);
            if (currentStr < '0' || currentStr > '9') {
                return false;
            }
        }
        return true;
    }

}

