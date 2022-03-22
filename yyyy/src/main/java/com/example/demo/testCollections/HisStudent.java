package com.example.demo.testCollections;

public class HisStudent {
    private String name;
    public int age;

    public HisStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "HisStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
