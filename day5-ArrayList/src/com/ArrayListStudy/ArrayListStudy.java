package com.ArrayListStudy;

import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args) {
        // 创建集合对象
        // 泛型：限定集合存储类型
        // JDK7以下
//        ArrayList<String> arr = new ArrayList<String>();

        // JDK7以上
        ArrayList<String> arr = new ArrayList<>();
        // 增添元素
        arr.add("tjt");
        arr.add("740");
        arr.add("tjt740");
        arr.add("nmd");
        System.out.println(arr); // [tjt, 740, tjt740, nmd]

        // 删除元素(下标)
        arr.remove(3);
        System.out.println(arr); // [tjt, 740, tjt740]

        // 修改元素(下标)
        arr.set(0, "谭金涛");
        arr.set(1, "戚思宁");
        System.out.println(arr); // [谭金涛, 戚思宁, tjt740]

        // 查找元素(下标)
        System.out.println(arr.get(2)); // tjt740

        // 获取数组长度
        System.out.println(arr.size()); // 3;
    }
}

class ArrayListStudy2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(740);
        arr.add(37);

        ArrayList<Character> arr2 = new ArrayList<>();
        arr2.add('a');
        arr2.add('b');
        arr2.add('c');
    }
}


class ArrayListStudy3 {

    public static void main(String[] args) {
        Student s1 = new Student("tjt", 24, 173);
        Student s2 = new Student("740", 24, 173);

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);

        // 打印数组中下标1的名字
        System.out.println(arr.get(0).getName()); // tjt
        System.out.println(arr.get(1).getName()); // 740
    }

}