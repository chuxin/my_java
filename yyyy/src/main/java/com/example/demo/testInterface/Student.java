package com.example.demo.testInterface;

import com.example.demo.testInterface.Person;
import com.example.demo.testInterface.Hello;

public class Student implements Person, Hello {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    // 这个 override 删了也能运行，意义何在
    @Override
    public void run() {
        System.out.println(this.name + " run");
    }

    // 这个 override 删了也能运行，意义何在
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void hello() {
        System.out.println(this.name + " hello");
    }

    @Override
    public void noNeedInherit() {
        System.out.println("我是子类的noNeedInherit");
    }
}
