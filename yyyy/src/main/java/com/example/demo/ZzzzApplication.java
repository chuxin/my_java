package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

//@SpringBootApplication
public class ZzzzApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ZzzzApplication.class, args);
        System.out.println("Hello world!");

        // 整型
        int x = 1;
        System.out.println("x 第一次的值：" + x);
        x = 2;
        System.out.println("x 第二次的值：" + x);
        int y = x;
        System.out.println("y 的值：" + y);

        long l = 33L;
        System.out.println("l 的值：" + l);

        // 浮点类型
        float f1 = 3.1415f;
        float f2 = 3.2e5f;
        System.out.println("f1的值：" + f1 + " f2的值：" + f2);

        double d1 = 4.1e5;
        System.out.println("d1 的值：" + d1);

        // 布尔类型
        boolean b1 = true;
        boolean isGreater = 5 > 4;
        int age = 12;
        boolean isAdult = age < 8;
        System.out.println("b1的值：" + b1);
        System.out.println("isGreater的值：" + isGreater);
        System.out.println("isAdult的值：" + isAdult);

        // 字符类型
        // 注意char类型使用单引号'，且仅有一个字符，要和双引号"的字符串类型区分开。
        char a = 'A';
        char zh = '中';
        System.out.println("字符a的值：" + a);
        System.out.println("字符zh的值：" + zh);

        // 引用类型
        String s = "hello";
        String s2 = "中国";
        System.out.println("s的值：" + s);
        System.out.println("s2的值：" + s2);

        final double PI = 3.3;
        System.out.println("PI的值：" + PI);

        // 编译器会根据赋值语句自动推断出变量v1的类型
        var v1 = new String("你好xxx");
        System.out.println(v1);

        // 变量作用域的范围
        if (true) {
            int x1 = 11;
            if (true) {
                int x2 = 22;
                System.out.println(x2);
            }
//            System.out.println(x2);       // 作用域报错
        }

        int x3 = 12345 / 67;
        int x4 = 12345 % 67;

        // 类型强制转换
        short s3 = 1234;
        int ii = 123456;
        int x5 = s3 + ii;
        System.out.println("x5 的值：" + x5);
        short y2 = (short) (s3 + ii); // 超出范围的强制转型会得到错误的结果，原因是转型时，int的两个高位字节直接被扔掉，仅保留了低位的两个字节
        System.out.println("y 的值：" + y2);

        // 浮点数
        double d3 = 1.0 / 10;
        double d4 = 1 - 9.0 / 10;
        System.out.println("d3的值：" + d3);
        System.out.println("d4的值：" + d4);
        System.out.println("abs函数：" + Math.abs(1 - 3));
    }

}
