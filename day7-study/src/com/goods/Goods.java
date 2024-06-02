package com.goods;

public class Goods {
    private String name;
    private Integer  price;

    private Integer count;

    public Goods(String name, Integer price, Integer count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 获取
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    public String toString() {
        return "Goods{name = " + name + ", price = " + price + ", count = " + count + "}";
    }
}
