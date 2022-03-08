package com.example.demo.mypackages;

import java.util.Arrays;

public class OOPknowledge {
    public String val11;
    public int age11;

    public String val22;

    public String name;
    public int age;

    private String address;
    private int sex;

    public String[] formerNames;
    public String[] formerAddresses;

    public String country;
    public String secondCountry;

    // 第一个构造函数
    public OOPknowledge() {
        // 什么都没有
    }

    // 第二个构造函数
    public OOPknowledge(String val11, int age11) {
        this.val11 = val11;
        this.age11 = age11;
    }

    // 第三个构造函数
    public OOPknowledge(String val22) {
        // 这里第三个构造函数 去 调用第二个构造方法
        this("ccc22", 44);
        this.val22 = val22;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        // 判断非 null，非空
        if (this.address == null || this.address.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        // 去掉收尾空格
        return this.address.strip();
    }

    public void setSex(int sex) {
        if (this.sex > 100) {
            throw new IllegalArgumentException("invalid sex value");
        }
        this.sex = sex;
    }

    public int getSex() {
        return sex;  // 如果没有命名冲突，可以省略this
    }

    // 可变参数
    public void getFormerNames(String... formerNames) {
        this.formerNames = formerNames;
        System.out.println("曾用名：" + Arrays.toString(this.formerNames));
    }

    public void getFormerAddresses(String[] formerAddresses) {
        this.formerAddresses = formerAddresses;
        System.out.println("曾用地址：" + Arrays.toString(this.formerAddresses));
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCountry(String country, String secondCountry) {
        this.country = country;
        this.secondCountry = secondCountry;
    }
}
