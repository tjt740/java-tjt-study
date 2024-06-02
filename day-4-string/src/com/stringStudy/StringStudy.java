package com.stringStudy;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "hello";
        String str1_1 = "hello";
//        str1_1 == str1; // true;
        String str2 = "hello";

        boolean result = str1.equals(str2); // true (比较的是内容)
        boolean result2 = str1.equalsIgnoreCase(str2); // true (忽略大小写)
        boolean result3 = str1 == str2; // false (比较的是对象)

        char[] ch = {'h','e','l','l','o'};
        String str3 = new String(ch); // hello 数组转字符串

        byte [] by = {97,98,99};
        String str4 = new String(by); // abc 字节数组转字符串
    }
}


class StringStudy2 {
    public static void main(String[] args) {
        String phoneNumber = "15751666937";
        String formatPhone = phoneNumber.substring(0, 3) + "****" + phoneNumber.substring(7); // 从【startIndex,endIndex】
        System.out.println(formatPhone);
    }
}

class StringStudy3 {
    public static void main(String[] args) {
        String str = "hello,你早上吃了什么？";
        String str2 = str.replace("hello", "你好");
        System.out.println(str2);
    }
}

class StringStudy4 {
    public static void main(String[] args) {
        String str = "world";
        System.out.println("hello" + str); // helloworld

        StringBuilder sb2 = new StringBuilder("1234");
        sb2.append(5678).reverse();
        // 转成字符串
        String str2 = sb2.toString();
        System.out.println(str2); // 87654321
    }
}