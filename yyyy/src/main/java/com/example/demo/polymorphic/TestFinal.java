package com.example.demo.polymorphic;

public class TestFinal {
    public final int quota;

//    public final int clothes;

    public TestFinal(int quota) {
        this.quota = quota;
    }

    public void getQuota() {
        System.out.println("quota的值：" + this.quota);
    }

//    public void setClothes(int clothes) {
//        this.clothes = clothes;
//    }

//    public void getClothes() {
//        System.out.println("clothes的值：" + this.clothes);
//    }
}
