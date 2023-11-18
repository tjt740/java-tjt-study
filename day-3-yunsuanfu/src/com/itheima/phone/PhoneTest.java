package com.itheima.phone;
import com.itheima.phone.Test;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
//        phone.brand  = "华为";
        phone.price = 6999.0;

        phone.setBrand("华为");
        String a = phone.getBrand();
        System.out.println(a); // 华为

        phone.call("谭金涛");
        phone.sendMessage("早上吃了什么？");

        // 测试
        Test B = new Test();
        B.getAge();
    }
}
