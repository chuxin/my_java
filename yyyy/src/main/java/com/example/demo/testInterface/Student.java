package com.example.demo.testInterface;

import com.example.demo.testInterface.Person;
import com.example.demo.testInterface.Hello;

public class Student implements Person, Hello {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " run");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void hello() {
        System.out.println(this.name + " hello");
    }
}
