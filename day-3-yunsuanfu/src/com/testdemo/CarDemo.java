package com.testdemo;
import java.util.Scanner;
import com.testdemo.Car;
public class CarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 创建长度为3的空数组
        Car[] arr = new Car[3];

        for (int i = 0; i < arr.length; i++) {
            Car car = new Car();
            System.out.println("请输汽车品牌");
            car.setBrand(sc.next());
            System.out.println("请输汽车颜色");
            car.setColor(sc.next());
            System.out.println("请输汽车最高时速");
            car.setMaxSpeed(sc.nextInt());
            arr[i] = car;
        }

        // 打印内容
        for (int i = 0; i < arr.length; i++) {
            System.out.println("汽车品牌："+arr[i].getBrand()+"汽车颜色："+arr[i].getColor()+"汽车最高时速："+arr[i].getMaxSpeed());
        }
    }
}
