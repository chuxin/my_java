package com.demo.ccc;

public class AnimalDog {
    private String name;
    private Integer age;
    private String call;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "AnimalDog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", call='" + call + '\'' +
                '}';
    }
}
