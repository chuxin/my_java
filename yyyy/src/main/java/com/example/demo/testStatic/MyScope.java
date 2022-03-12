package com.example.demo.testStatic;

public class MyScope {

    public void doSomething() {
        MyInner miObj = new MyInner();
        miObj.printSome();
    }

    public void doSomething2() {
        Outer2 outerObj = new Outer2(1);
        Outer2.YouInner yiObj = outerObj.new YouInner();
        yiObj.printYouSome();
    }

    public void doSomething3() {
        Outer3 outerObj = new Outer3("用异步编程测试匿名类");
        outerObj.asyncHello();
    }

    public void doSomething4() {
        Outer4.YouInner yiObj = new Outer4.YouInner();
        yiObj.hello();
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

class Outer2 {
    private int sex = 0;

    public Outer2(int sex) {
        this.sex = sex;
    }

    class YouInner {
        public void printYouSome() {
            System.out.println("printYouSome: " + Outer2.this.sex);
        }
    }
}

class Outer3 {
    private String name;

    Outer3(String name) {
        this.name = name;
    }

    void asyncHello() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello, " + Outer3.this.name);
            }
        };
        new Thread(r).start();
    }
}

class Outer4 {
    private static String yourName = "Louis";
    private String name;

    Outer4(String name) {
        this.name = name;
    }

    static class YouInner {
        void hello() {
            System.out.println("测试内部静态类" + Outer4.yourName);
        }
    }

}