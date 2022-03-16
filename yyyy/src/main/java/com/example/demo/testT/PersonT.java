package com.example.demo.testT;

// 泛型接口
public class PersonT implements Comparable<PersonT> {
    String name;
    int age;

    public PersonT(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 让PersonT实现Comparable<T>接口，从而自定义比较逻辑
    public int compareTo(PersonT other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return this.name + "," + this.age;
    }
}
