package com.example.demo.testStatic;

public class MyTestPackage {

    public void printFriend() {
        MyStatic.setAge(66);
        System.out.println("我的隔壁文件里有个静态age，值为；" + MyStatic.age);
    }

}
