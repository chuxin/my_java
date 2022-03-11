package com.example.demo.mypackages;

import com.example.demo.mypackages.OOPknowledge;

public class SecondChid extends OOPknowledge {
    private int score;

    public SecondChid(String val11, int age11, int score) {
        super(val11, age11);
        this.score = score;
    }

    public void printInitValues() {
        System.out.println("打印构造函数里初始化的参数列表：" + this.val11 + " " + this.age11 + " " + this.score);
    }
}
