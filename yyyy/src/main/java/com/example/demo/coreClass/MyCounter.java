package com.example.demo.coreClass;

public class MyCounter {
    private int number = 0;

    public MyCounter add(int number) {
        this.number += number;
        return this;
    }

    public MyCounter incr() {
        this.number++;
        return this;
    }

    public int getNumber() {
        return this.number;
    }
}
