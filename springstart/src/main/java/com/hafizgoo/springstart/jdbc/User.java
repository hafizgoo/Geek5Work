package com.hafizgoo.springstart.jdbc;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/2 - MONTH−06 - DAY−02 - TIME−16:15
 * @Description: com.hafizgoo.springstart.jdbc
 * @version: 1.0
 */


public class User {

    public User() {
    }

    public User(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public User(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    private int id;

    private String name;

    private String address;

    private  int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
