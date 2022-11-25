package com.it.pojo;

public class Address {
    private String name;
    private Integer num;

    public Address(String name, Integer num) {
        this.name = name;
        this.num = num;
    }

    public Address() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
