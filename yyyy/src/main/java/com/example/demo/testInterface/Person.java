package com.example.demo.testInterface;

public interface Person {

    void run();

    String getName();

    default void noNeedInherit() {
        System.out.println(getName() + " noNeedInherit");
    }

    default void noNeedInherit2() {
        System.out.println("我是父类的noNeedInherit2");
    }
}
