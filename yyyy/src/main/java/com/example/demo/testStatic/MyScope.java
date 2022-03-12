package com.example.demo.testStatic;

public class MyScope {

    public void doSomething() {
        MyInner miObj = new MyInner();
        miObj.printSome();
    }

    private static void printFather() {
        System.out.println("类名为：MyScope");
    }

    static class MyInner {
        public void printSome() {
            MyScope.printFather();
        }
    }
}
