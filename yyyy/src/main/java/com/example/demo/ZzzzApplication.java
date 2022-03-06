package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

import java.util.Arrays;

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

        Person p = new Person();
        p.getAge();
    }

}

class Person {
    private int age;

    public void getAge() {

        // switch 语句
        String fruit = "apple";
        switch (fruit) {
            case "apple":
                System.out.println("select apple");
                break;
            case "33":
                System.out.println("select 33");
                break;
            default:
                System.out.println("select default");
                break;
        }

        // while 语句
        int sum = 0;
        int n = 0;
        while (n <= 99) {
            n++;
            sum += n;
        }
        System.out.println("sum的值：" + sum);

        sum = 0;
        n = 1;
        do {
            sum += n;
            n++;
        } while (n <= 100);
        System.out.println("sum的值：" + sum);

        // for 循环
        int nsArr[] = {1, 3 ,5 ,7, 0};
        sum = 0;
        for (int i = 0; i < nsArr.length; i++) {
            sum += nsArr[i];
        }
        System.out.println("sum的值：" + sum);

        for(int j : nsArr) {
            System.out.println("遍历数组的值：" + j);
        }
        // break 使用
        for (int i=1; i<4; i++) {
            System.out.println("i的值：" + i);
            for (int j=1; ;j++) {
                if (j == 10) {
                    System.out.println("j的值:" + j);
                    break;
                }
            }
        }

        // 数组
        char ssArr[] = {'a', 'c', 'e', 'g', 'h'};
        for (char k : ssArr) {
            System.out.println("k的值：" + k);
        }
        System.out.println("ssArr数组在JVM中的引用地址：" + ssArr);
        System.out.println("ssArr数组内容：" + Arrays.toString(ssArr));
        // 数组排序
        int ttArr[] = {8, 4, 1, 5, 7, 6};
        Arrays.sort(ttArr);
        System.out.println("ttArr数组排序后的内容：" + Arrays.toString(ttArr));
        if (Arrays.toString(ttArr).equals("[1, 4, 5, 6, 7, 8]")) {
            System.out.println("判断字符串相等与否, Arrays.toString(ttArr).equals(\"[1, 4, 5, 6, 7, 8]\")");
        }
        // 二维数组
        int[][] twoDimenArr = {
                {15, 6, 7, 8},
                {9, 20, 11, 12, 88},
                {1, 3, 7, 0}
        };
        System.out.println("二维数组 twoDimenArr 的长度：" + twoDimenArr.length);
        System.out.println("二维数组 twoDimenArr, 第二维的值：" + Arrays.toString(twoDimenArr[1]));
        System.out.println("二维数组 twoDimenArr, 第二维的长度：" + twoDimenArr[1].length);
        System.out.println("二维数组 twoDimenArr, 打印某个值：" + twoDimenArr[1][1]);

    }
}
