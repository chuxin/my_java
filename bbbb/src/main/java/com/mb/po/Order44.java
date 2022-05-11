package com.mb.po;

import java.util.List;

public class Order44 {
    private int oid;
    private int ordernum;
    private int userId;

    private List<Product44> product44List;

    @Override
    public String toString() {
        return "Order44{" +
                "oid=" + oid +
                ", ordernum=" + ordernum +
                ", userId=" + userId +
                ", product44List=" + product44List +
                '}';
    }
}
