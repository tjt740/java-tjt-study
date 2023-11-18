package com.array;

import com.array.ArrayClass;

public class TestDemo {
    public static void main(String[] args) {
        // 1. 创建一个长度内存为3的数组
        ArrayClass[] arr = new ArrayClass[3];

        // 2. 创建对象
        ArrayClass a = new ArrayClass(1, "手机", 4999, 10
        );
        ArrayClass b = new ArrayClass(2, "西瓜", 99, 22
        );
        ArrayClass c = new ArrayClass(3, "扑克", 12, 60
        );

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        for (int i = 0; i < arr.length; i++) {
            ArrayClass goods = arr[i];
            System.out.println(goods.getId() + ";" + goods.getName() + ";" + goods.getPrice() + ";" + goods.getCount());
        }
    }
}
