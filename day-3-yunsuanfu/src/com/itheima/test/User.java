package com.itheima.test;

public class User {
    private String name;
    private String password;
    private String email;
    private String male;
    private String birthday;
    private int age;

    public User(String name, String password, String email, String male, String birthday, int age) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.male = male;
        this.birthday = birthday;
        this.age = age;
    }

    public User() {
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return male
     */
    public String getMale() {
        return male;
    }

    /**
     * 设置
     * @param male
     */
    public void setMale(String male) {
        this.male = male;
    }

    /**
     * 获取
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置
     * @param birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{name = " + name + ", password = " + password + ", email = " + email + ", male = " + male + ", birthday = " + birthday + ", age = " + age + "}";
    }

//    public void register( String name,String password,String email, String birthday,int age){
//    this.name = name;
//        this.password = password;
//        this.email = email;
//        this.male = male;
//        this.birthday = birthday;
//        this.age = age;
//    }
}
