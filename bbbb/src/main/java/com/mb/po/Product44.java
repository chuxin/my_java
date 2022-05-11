package com.mb.po;

import java.util.List;

public class Product44 {
    private int pid;
    private String name;
    private Double price;

    private List<Order44> order44List;

    @Override
    public String toString() {
        return "Product44{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", order44List=" + order44List +
                '}';
    }
}
