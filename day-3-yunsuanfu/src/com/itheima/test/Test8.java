package com.itheima.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 30, 4, 5, 2, 14};
        int max = getArray(arr);
        System.out.print(max);
    }

    public static int getArray(int[] arr) {
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
}

class Test9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 30, 4, 5, 2, 14};
        int[] copyArr = getArray(arr, 3, 7); // 4,5,2
    }

    public static int[] getArray(int[] arr, int from, int to) {
        int[] recordArr = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            recordArr[index] = arr[i];
            index++;
        }
        return recordArr;
    }
}

class Test10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 30, 4, 5, 2, 14};
        int[] copyArr = arr;
        arr[0] = 100;
        // copyArr == arr
        System.out.print("copyArr" + copyArr);
        System.out.print("arr" + arr);
    }
}


class Test11 {
    public static void main(String[] args) {
        /*
         需求：
            机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
            按照如下规则计算机票价格：旺季（5-10月)头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入季节：");
        int season = Integer.parseInt(sc.next());
        if (season > 12 || season <= 0) {
            System.out.println("月份输入错误!");
            return;
        }

        System.out.println("请输入舱型：");
        String type = sc.next();

        System.out.println("请输入原价：");
        int price = Integer.parseInt(sc.next());

        double finalPrice = getPrice(season, type, price);
        System.out.println("最终价格￥：" + finalPrice);
    }

    public static double getPrice(int season, String type, int price) {
        // 旺季
        if (season <= 10 && season >= 5) {
            if (type.equals("头等舱")) {
                return price * 0.9;
            } else if (type.equals("经济舱")) {
                return price * 0.85;
            }
        }
        // 淡季
        if (season <= 4 || season >= 11) {
            if (type.equals("头等舱")) {
                return price * 0.7;
            } else if (type.equals("经济舱")) {
                return price * 0.65;
            }
        }
        return price;
    }
}

class Test12 {
    public static void main(String[] args) {
        /*
        需求：
            定义方法实现随机产生一个5位的验证码。
        验证码格式：
            长度为9，前8位是大写字母或者小写字母，最后一位是数字
        */
        String[] EngList = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] engList = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String RandomCode = getRandomCode(EngList, engList);
        System.out.println(RandomCode);
    }

    public static String getRandomCode(String[] EngList, String[] engList) {
        Random rd = new Random();
        StringBuilder code = new StringBuilder();
        int rdNumber = rd.nextInt(10); // 0 ~ 10;
        for (int i = 0; i < 4; i++) {
            int rdEngIndex = rd.nextInt(26); // 0 ~ 26;
            int rdengIndex = rd.nextInt(26); // 0 ~ 26;
            code.append(EngList[rdEngIndex]).append(engList[rdengIndex]);
        }
        code.append(rdNumber);
        return code.toString();
    }
}


class Test13 {
    public static void main(String[] args) {
        /*
          需求：
            把一个数组中的元素复制到另一个新数组中去。
        */

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }
    }
}

class Test14 {
    public static void main(String[] args) {
        /*
        需求：
           在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。选手的最后得分为：
           去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        */
        Random rd = new Random();
        int[] scoreArr = new int[6];
        for (int i = 0; i < 6; i++) {
            int score = rd.nextInt(101);
            scoreArr[i] = score;
        }

        double result = getScore(scoreArr);
        System.out.println(result);
    }

    public static double getScore(int[] arr) {
        int maxScore = 0;
        int minScore = arr[0];
        double evaluationScore = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxScore) {
                maxScore = arr[i];
            }
            if (minScore > arr[i]) {
                minScore = arr[i];
            }
            evaluationScore += arr[i];
        }
        evaluationScore = (evaluationScore - maxScore - minScore) / 4;

        return evaluationScore;
    }
}

class Test15 {
    public static void main(String[] args) {
        /*
            需求：
            一个大v直播抽奖，奖品是现金红包，分别有{2，588，888，1000，10000}五个奖金。
            请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
            打印效果如下：(随机顺序，不一定是下面的顺序)
                888元的奖金被抽出
                588元的奖金被抽出
                10000元的奖金被抽出
                1000元的奖金被抽出
                2元的奖金被抽出
        */

        int[] prizeList = {2, 588, 888, 1000, 10000};
        Random rd = new Random();
        int[] recordList = new int[prizeList.length];
        // 注意：这里没有i++
        for (int i = 0; i < prizeList.length; ) {
            int rdIndex = rd.nextInt(prizeList.length);
            int prize = prizeList[rdIndex];

            //判断当前的奖项是否存在，如果存在则重新抽取，如果不存在，就表示是有效奖项
            boolean flag = contains(recordList, prize);
            if (!flag) {
                recordList[i] = prizeList[rdIndex];
                i++;
            }
        }

        for (int i = 0; i < recordList.length; i++) {
            System.out.println(recordList[i]);
        }

    }

    // 判断奖项是否存在
    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}


class Test16 {
    public static void main(String[] args) {
        /*
            需求：
            一个大v直播抽奖，奖品是现金红包，分别有{2，588，888，1000，10000}五个奖金。
            请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
            打印效果如下：(随机顺序，不一定是下面的顺序)
                888元的奖金被抽出
                588元的奖金被抽出
                10000元的奖金被抽出
                1000元的奖金被抽出
                2元的奖金被抽出
        */

        int[] prizeList = {2, 588, 888, 1000, 10000};
        Random rd = new Random();

        for (int i = 0; i < prizeList.length; i++) {
            int rdIndex = rd.nextInt(i);
            int temp = prizeList[i];
            prizeList[i] = prizeList[rdIndex];
            prizeList[rdIndex] = temp;
        }

        for (int i = 0; i < prizeList.length; i++) {
            System.out.println(prizeList[i]);
        }
    }
}

class Test17 {
    public static void main(String[] args) {
        /*
         * 投注号码由6个红色球号码和1个蓝色
         * 球号码组成。红色球号码从1-33中选
         * 择；蓝色球号码从1-16中选择。
         */
        Random rd = new Random();

        int[] redBall = new int[6];
        int blueBall = rd.nextInt(16) + 1;
        // 最终结果
        int[] finalResult = new int[7];

        for (int i = 0; i < redBall.length; ) {
            // 生成随机数 1~33
            int rdNum = rd.nextInt(33) + 1;
            // 判断数组中是否有该随机数，没有就塞入，有就重新执行
            boolean flag = contains(redBall, rdNum);
            if (!flag) {
                redBall[i] = rdNum;
                finalResult[i] = rdNum;
                i++;
            }
        }
        finalResult[finalResult.length-1] = blueBall;

        System.out.println("最终结果："+Arrays.toString(finalResult));
    }

    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}