package com.mb.po;

import java.util.List;

public class User33 {
    private int id;
    private String name;
    private String pwd;

    private List<Order33> order33List;

    @Override
    public String toString() {
        return "User33{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", order33=" + order33List +
                '}';
    }
}
