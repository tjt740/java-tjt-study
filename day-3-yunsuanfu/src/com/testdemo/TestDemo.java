package com.testdemo;

import com.testdemo.Player;

public class TestDemo {
    public static void main(String[] args) {
        Player p1 = new Player("张三", 100);
        Player p2 = new Player("李四", 100);
        int times = 1;
        while (true) {
            p1.attack(p2);
            times += 1;
            if (p2.getHealth() == 0) {
                System.out.println(p1.getName() + "胜利" + "打了：" + times + "次");
                break;
            }

        }
    }

}
