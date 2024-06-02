package com.testdemo;

import java.util.Random;

public class Player {
    private final String name;
    private int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 获取
     * @return health
     */
    public int getHealth() {
        return health;
    }

    /**
     * 设置
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    // 进攻
    public void attack(Player p){
        // 获取玩家血量
        int health = p.getHealth();
        // 随机血量
        Random r = new Random();
        int hurt =  health - r.nextInt(20)+1;
        health =  hurt <0 ? 0: hurt;
        // 设置血量
        p.setHealth(health);
        System.out.println(p.getName()+"被攻击,血量为:"+health);

    }
}
