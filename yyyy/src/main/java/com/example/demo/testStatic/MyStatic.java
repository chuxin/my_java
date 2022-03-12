package com.example.demo.testStatic;

public class MyStatic {
    public String name;
    public static int number;

    public static int age;

    public MyStatic(String name) {
        this.name = name;
    }

    public static void setAge(int param) {
        age = param;
    }
}
