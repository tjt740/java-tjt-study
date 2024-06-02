package com.stringStudy;

import java.util.Random;
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


class StringDemo3 {
    public static void main(String[] args) {
        String[] arr = {"hello", "world", "java"};
        String str = generateArray(arr);
        System.out.println(str);
    }

    public static String generateArray(String[] arr) {
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result += arr[i] + "]";
                break;
            }
            result += arr[i] + ",";
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

        System.out.println(sj2);//【谭金涛---戚思宁】
        System.out.println(sj2.length());// 11
    }
}

class StringDemo7 {
    public static void main(String[] args) {
    /*
        键盘录入一个字符串，
        要求1：长度为小于等于9
        要求2：只能是数字，将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系：
        I-1、II-2、IⅢI-3、IⅣ-4、V -5、VI-6、VI-7、VII-8、IⅨ-9
        注意点：
        罗马数字里面是没有0的
        如果键盘录入的数字包含0，可以变成””（长度为0的字符串)
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        String str = sc.next();

        // 进行是否是数字判断
        if (str.matches("[0-9]+") && str.length() <= 9) {
            System.out.println("是数字且长度小于等于9");
            StringBuilder sb = new StringBuilder();
            // 进行格式化（用逗号隔开，开始是【，结束是】）
            StringJoiner sj = new StringJoiner(",", "【", "】");
            for (int i = 0; i < str.length(); i++) {
                // ascll码 0 = 48 ；1=49 ,所以 - 48 = 对应的数字
                // 转数字（1）
                // int number = Integer.parseInt(String.valueOf(str.charAt(i)));
                // 转数字（2）
                int number = str.charAt(i) - 48;
                // StringJoiner塞入数据
                sj.add(changeLuoMa(number));
            }
            // 结果
            System.out.println("结果：" + sj);// 【Ⅴ,Ⅵ,Ⅶ,Ⅶ】
        } else {
            System.out.println("字符应为数字且字符长度应小于等于9");
        }

    }

    public static String changeLuoMa(int number) {
        String[] enumArr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return enumArr[number];
    }
}

class StringDemo8 {
    // 定义全局变量就可以了，并且不能作为方法参数
    private static int count = 0;

    public static void main(String[] args) {
        /*
         调整字符串
            给定两个字符串，A（abcde）和B（cdeba）。
            A的旋转操作就是将A最左边的字符移动到最右边。
            例如，若A='abcde'，在移动一次之后结果就是'bcdea'。
            如果在若干次调整操作之后，A能变成B，那么返回True。
            如果不能匹配成功，则返回false。
        */

        // 1. 定义两个字符串
        String a = "abcde";
        String b = "cdeab";

        boolean result = rotateString(a, b);
        System.out.println("count:" + count);
        System.out.println("调整字符串:" + result);
    }

    public static Boolean rotateString(String A, String B) {
        String str = "";
        for (int i = 0; i < A.length(); i++) {
            // 拼接字符串
            str = A.substring(i) + A.substring(0, i);
            count++;
            if (str.equals(B)) {
                return true;
            }
        }
        // 如果所有情况都不一样，就返回false
        return false;
    }
}

class StringDemo9 {
    public static void main(String[] args) {
        /*
        *生成验证码
            内容：可以是小写字母，也可以是大写字母，还可以是数字。
            规则：
            1.长度为5
            2.内容中是四位字母，1位数字。
            3.其中数字只有1位，但是可以出现在任意的位置。
        * */
        String verificationCode = generateVerificationCode();
        System.out.println("生成的验证码是: " + verificationCode);
    }

    // 生成验证码方法
    public static String generateVerificationCode() {
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        // 生成四位字母（包括大小写）
        for (int i = 0; i < 4; i++) {
            // 随机boolean
            char randomChar;
            if (random.nextBoolean()) {
                randomChar = (char) (random.nextInt(26) + 'a'); // 生成小写字母
            } else {
                randomChar = (char) (random.nextInt(26) + 'A'); // 生成大写字母
            }
            code.append(randomChar);
        }

        // 生成一位数字的位置
        int digitPosition = random.nextInt(5); // 0到4之间的随机数

        // 插入数字到随机位置
        code.insert(digitPosition, random.nextInt(10)); // 插入0到9之间的随机数字

        return code.toString();
    }

}