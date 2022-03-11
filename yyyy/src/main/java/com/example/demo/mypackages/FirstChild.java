package com.example.demo.mypackages;

import com.example.demo.mypackages.OOPknowledge;

public class FirstChild extends OOPknowledge {
    private int score;

    private String name = "childName";

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    public void getParentAttributes() {
        System.out.println("获取父类的public属性address：" + this.address);
        System.out.println("获取父类的protected属性nationality：" + this.nationality);
//        System.out.println("获取父类的private属性sex：" + this.sex);
    }

    public void getSelfAttributes() {
        System.out.println("获取当前类的属性name(注意，此name属性父类也有)：" + this.name);
        System.out.println("获取父类的属性name：" + super.name);
    }
}
