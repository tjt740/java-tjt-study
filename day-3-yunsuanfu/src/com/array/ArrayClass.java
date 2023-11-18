package com.array;

public class ArrayClass {
    private int id;
    private String name;
    private int price;
    private int count;

    public ArrayClass(int id, String name, int price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public ArrayClass() {
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     *
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获取
     *
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置
     *
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }

    public String toString() {
        return "ArrayClass{id = " + id + ", name = " + name + ", price = " + price + ", count = " + count + "}";
    }
}
