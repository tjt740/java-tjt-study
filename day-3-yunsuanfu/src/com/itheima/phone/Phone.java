package com.itheima.phone;

public class Phone {
    // 属性
    private String brand;
    double price;

    // 行为（函数）
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage(String message) {
        System.out.println("发送消息：" + message);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

}

class Test{
    int age = 24;
    private String name;
    public void getAge(){
        System.out.println("年龄");
    }
}