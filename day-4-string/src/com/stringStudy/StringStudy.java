package com.stringStudy;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "hello";
        String str1_1 = "hello";
//        str1_1 == str1; // true;
        String str2 = new String("hello");

        boolean result = str1.equals(str2); // true (比较的是内容)
        boolean result2 = str1.equalsIgnoreCase(str2); // true (忽略大小写)
        boolean result3 = str1 == str2; // false (比较的是对象)

        char[] ch = {'h','e','l','l','o'};
        String str3 = new String(ch); // hello 数组转字符串

        byte [] by = {97,98,99};
        String str4 = new String(by); // abc 字节数组转字符串

    }
}
