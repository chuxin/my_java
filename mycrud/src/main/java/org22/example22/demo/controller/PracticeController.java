package org22.example22.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Controller
public class PracticeController {

    @ResponseBody
    @RequestMapping("/Practice/test")
    public String showList() {
        // 参考文档：https://www.shuzhiduo.com/A/LPdo0YoGz3/
        //    https://new.qq.com/rain/a/20220608A01HXN00   没细看

        // reentrantLock + volatile 锁机制 + 线程内共享变量
//        TT tt = new TT();
//        tt.test();

        // Semaphore 信号量
//        Print1234.test22();

        // atomic   使用原子变量
        ABC5.test33();



        return "练习题";
    }
}

class TT extends Thread {
    // ReentrantLock原理：多个线程获取锁，一个线程获取到锁，其他线程排队等待锁，并挂起；当获取到锁这个节点释放锁，就会唤醒队伍的头结点。
    // ReentrantLock类中有三个内部类：Sync、FairSync（公平锁）和NonfairSync（非公平锁），Sync都是AQS的子类，FairSync和NonfairSync是Sync的子类；
    // 非公平锁就是当前线程每次获取锁，获取不到在排队。
    // 公平锁就是都是获取锁的顺序按队伍的顺序来，当前线程不会去获取锁，直接取排队。
    // ReentrantLock是利用AQS实现，AQS就是定义了一个依赖于先进先出队列来实现阻塞锁和同步器的框架。
    // synchronized与Lock的对比
    private static Lock lock = new ReentrantLock(); // 通过JDK5中的锁来保证线程的访问的互斥
    volatile static Integer state = 0;

    static class T1 extends Thread {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {}

                lock.lock();
                if (state % 2 == 0) {
                    System.out.println("T1：" + state);
                    state++;
                }
                lock.unlock();
            }
        }
    }

    static class T2 extends Thread {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {}

                lock.lock();
                if (state % 2 == 1) {
                    System.out.println("T2：" + state);
                    state++;
                }
                lock.unlock();
            }
        }
    }

    public void test() {
        TT.T1 t1 = new TT.T1();
        T2 t2 = new T2();
        t1.start();
        t2.start();
    }
}

class Print1234 {
    public static Semaphore sem1;
    public static Semaphore sem2;
    public static Semaphore sem3;

    static class FirstClass extends Thread {
        private static int num1 = 1;
        public void run() {
            try {
                while (true) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {}

                    sem1.acquire();
                    System.out.println("First " + num1);
                    num1 += 3;
                    sem2.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class SecondClass extends Thread {
        private static int num2 = 2;
        public void run() {
            try {
                while (true) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {}

                    sem2.acquire();
                    System.out.println("Second " + num2);
                    num2 += 3;
                    sem3.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ThirdClass extends Thread {
        private static int num3 = 3;
        public void run() {
            try {
                while (true) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {}

                    sem3.acquire();
                    System.out.println("Third " + num3);
                    num3 += 3;
                    sem1.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void test22() {
        // Semphore 完成对信号量的控制，可以控制某个资源可以被同时访问的个数
        // acquire()获取一个许可，如果没有就等待（除非被中断、或者超时）。
        // release()释放一个许可
        sem1 = new Semaphore(1);
        sem2 = new Semaphore(1);
        sem3 = new Semaphore(1);
        try {
            sem2.acquire();
            sem3.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FirstClass fcObj = new FirstClass();
        SecondClass scObj = new SecondClass();
        ThirdClass tcObj = new ThirdClass();
        fcObj.start();
        scObj.start();
        tcObj.start();
    }
}

class ABC5 {
    private static AtomicInteger number22 = new AtomicInteger(0);


    static class MyNewClass extends Thread {
        private String name;
        private int data;

        public MyNewClass(String name, int data) {
            this.name = name;
            this.data = data;
        }

        @Override
        public void run() {
            while (true) {
//            while (number22.get() < 100) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (number22.get() % 2 == this.data) {
                    System.out.println(this.name + ": " + number22.getAndIncrement());
                }
            }
        }
    }

    public static void test33() {
        MyNewClass mmOjb1 = new MyNewClass("线程1", 0);
        MyNewClass mmObj2 = new MyNewClass("线程2", 1);
        mmOjb1.start();
        mmObj2.start();
    }
}

