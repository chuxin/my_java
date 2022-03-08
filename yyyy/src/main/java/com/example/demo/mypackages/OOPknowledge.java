package com.example.demo.mypackages;

import java.util.Arrays;

public class OOPknowledge {
    public String name;
    public int age;

    private String address;
    private int sex;

    public String[] formerNames;
    public String[] formerAddresses;

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
}
