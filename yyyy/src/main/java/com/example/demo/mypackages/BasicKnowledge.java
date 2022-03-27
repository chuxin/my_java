package com.example.demo.mypackages;

import java.util.Arrays;

public class BasicKnowledge {
    public void testBasic(String[] args) {
        // 练习
        System.out.println("Hello world!");     // Hello world!

        // 整型
        int x = 1;
        System.out.println("x 第一次的值：" + x);     // x 第一次的值：1
        x = 2;
        System.out.println("x 第二次的值：" + x);     // x 第二次的值：2
        int y = x;
        System.out.println("y 的值：" + y);        // y 的值：2

        long l = 33L;
        System.out.println("l 的值：" + l);        // l 的值：33

        // 浮点类型
        float f1 = 3.1415f;
        float f2 = 3.2e5f;
        System.out.println("f1的值：" + f1 + " f2的值：" + f2);   // f1的值：3.1415  f2的值：320000.0

        double d1 = 4.1e5;
        System.out.println("d1 的值：" + d1);  // d1 的值：410000.0

        // 布尔类型
        boolean b1 = true;
        boolean isGreater = 5 > 4;
        int age = 12;
        boolean isAdult = age < 8;
        System.out.println("b1的值：" + b1);       // b1的值：true
        System.out.println("isGreater的值：" + isGreater); // isGreater的值：true
        System.out.println("isAdult的值：" + isAdult);     // isAdult的值：false

        // 字符类型
        // 注意char类型使用单引号'，且仅有一个字符，要和双引号"的字符串类型区分开。
        char a = 'A';
        char zh = '中';
        System.out.println("字符a的值：" + a);   // 字符a的值：A
        System.out.println("字符zh的值：" + zh); // 字符zh的值：中

        // 引用类型
        String s = "hello";
        String s2 = "中国";
        System.out.println("s的值：" + s);     // s的值：hello
        System.out.println("s2的值：" + s2);   // s2的值：中国

        final double PI = 3.3;
        System.out.println("PI的值：" + PI);   // PI的值：3.3

        // 编译器会根据赋值语句自动推断出变量v1的类型
        var v1 = "你好xxx";
        System.out.println(v1);     // 你好xxx

        // 变量作用域的范围
        if (true) {
            int x1 = 11;
            if (true) {
                int x2 = 22;
                System.out.println(x2);     // 22
            }
//            System.out.println(x2);       // 作用域报错
        }

        int x3 = 12345 / 67;
        int x4 = 12345 % 67;

        // 类型强制转换
        short s3 = 1234;
        int ii = 123456;
        int x5 = s3 + ii;
        System.out.println("x5 的值：" + x5);      // x5 的值：124690
        short y2 = (short) (s3 + ii);  // 超出范围的强制转型会得到错误的结果，原因是转型时，int的两个高位字节直接被扔掉，仅保留了低位的两个字节
        System.out.println("y 的值：" + y2);       // y 的值：-6382

        // 浮点数
        double d3 = 1.0 / 10;
        double d4 = 1 - 9.0 / 10;
        System.out.println("d3的值：" + d3);       // d3的值：0.1
        System.out.println("d4的值：" + d4);       // d4的值：0.09999999999999998
        System.out.println("abs函数：" + Math.abs(1 - 3)); // abs函数：2

        // 多行字符串        从Java 13开始
//        String s4 = """
//                   SELECT * FROM
//                     users
//                   WHERE id > 100
//                   ORDER BY name DESC
//                """;
//        System.out.println(s4);

        // 赋值转变
        String s5 = "hello";
        String t1 = s5;
        s5 = "world";
        System.out.println("s5的值：" + s5);   // s5的值：world
        System.out.println("t1的值：" + t1);   // t1的值：hello

        // null类型
//        String s6;
//        System.out.println("s6的值：" + s6);
        String s7 = null;
        System.out.println("s7的值：" + s7);   // s7的值：null

        // 把 int 转成 String
        int i1 = 3;
        int i2 = 4;
        int i3 = 5;
        String s8  = String.valueOf(i1 + i2 + i3);
        System.out.println(s8);     // 12

        // int 数组
        int[] ns = new int[5];
        ns[0] = 11;
        ns[1] = 12;
        ns[2] = 13;
        ns[3] = 14;
        ns[4] = 15;
        System.out.println("ns的第二个值：" + ns[1]); // ns的第二个值：12
        System.out.println("ns的长度：" + ns.length);   // ns的长度：5

        int[] ns2 = new int[] {1, 2, 3, 4, 5};
        System.out.println("ns2的长度：" + ns2.length); // ns2的长度：5

        int[] ns3 = {1, 3, 5, 7, 9};
        System.out.println("ns3的长度：" + ns3.length); // ns3的长度：5

        // 不换行打印
        System.out.print("A."); // A.

        // 格式化输出
        double d2 = 3.131456;
        System.out.printf("%.2f\n", d2);    // 3.13

        // 输入
//        Scanner scannerObj = new Scanner(System.in);
//        System.out.println("输入你的名字：");
//        String name = scannerObj.nextLine();
//        System.out.println("输入你的年龄：");
//        int age2 = scannerObj.nextInt();
//        System.out.printf("Hi, %s, you are %d years old", name, age2);

        // 浮点数不精确问题
        double x2 = 1 - 9.0 / 10;
        System.out.println("x2的值：" + x2);   // x2的值：0.09999999999999998
        if (x2 == 0.1) {        // 计算出现误差
            System.out.println("x2 == 0.1 为 true");
        } else {
            System.out.println("x2 == 0.1 为 false");    // x2 == 0.1 为 false
        }

        System.out.println("x2的值：" + Math.abs(x2 - 0.1));   // x2的值：2.7755575615628914E-17
        if (Math.abs(x2 - 0.1) < 0.00001) {
            System.out.println("Math.abs(x2 - 0.1) < 0.00001 为 true");  // Math.abs(x2 - 0.1) < 0.00001 为 true
        } else {
            System.out.println("Math.abs(x2 - 0.1) < 0.00001 为 false");
        }

        String ss1 = "hello";
        String ss2 = "Hello".toLowerCase();
        if (ss1 == ss2) {
            System.out.println("ss1 == ss2 为 true");
        } else {
            System.out.println("ss1 == ss2 为 false");   // ss1 == ss2 为 false
        }
        if (ss1.equals(ss2)) {
            System.out.println("ss1.equals(ss2) 为 true");   // ss1.equals(ss2) 为 true
        } else {
            System.out.println("ss1.equals(ss2) 为 false");
        }

        // switch 语句
        String fruit = "apple";
        switch (fruit) {
            case "apple":
                System.out.println("select apple");     // select apple
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
        System.out.println("sum的值：" + sum); // sum的值：5050

        sum = 0;
        n = 1;
        do {
            sum += n;
            n++;
        } while (n <= 100);
        System.out.println("sum的值：" + sum); // sum的值：5050

        // for 循环
        int[] nsArr = {1, 3 ,5 ,7, 0};
        sum = 0;
        for (int i = 0; i < nsArr.length; i++) {
            sum += nsArr[i];
        }
        System.out.println("sum的值：" + sum); // sum的值：16

        for(int j : nsArr) {
            System.out.println("遍历数组的值：" + j);  // 遍历数组的值：1 3 5 7 0
        }
        // break 使用
        for (int i=1; i<4; i++) {
            System.out.println("i的值：" + i); // i的值：1 2 3
            for (int j=1; ;j++) {
                if (j == 10) {
                    System.out.println("j的值:" + j); // j的值:10
                    break;
                }
            }
        }

        // 数组
        char[] ssArr = {'a', 'c', 'e', 'g', 'h'};
        for (char k : ssArr) {
            System.out.println("k的值：" + k);     // k的值：a c e g h
        }
        System.out.println("ssArr数组在JVM中的引用地址：" + ssArr);   // ssArr数组在JVM中的引用地址：[C@7b23ec81
        System.out.println("ssArr数组内容：" + Arrays.toString(ssArr));  // ssArr数组内容：[a, c, e, g, h]
        // 数组排序
        int[] ttArr = {8, 4, 1, 5, 7, 6};
        Arrays.sort(ttArr);
        System.out.println("ttArr数组排序后的内容：" + Arrays.toString(ttArr));  // ttArr数组排序后的内容：[1, 4, 5, 6, 7, 8]
        if (Arrays.toString(ttArr).equals("[1, 4, 5, 6, 7, 8]")) {
            // 判断字符串相等与否, Arrays.toString(ttArr).equals("[1, 4, 5, 6, 7, 8]")
            System.out.println("判断字符串相等与否, Arrays.toString(ttArr).equals(\"[1, 4, 5, 6, 7, 8]\")");
        }
        // 二维数组
        int[][] twoDimenArr = {
                {15, 6, 7, 8},
                {9, 20, 11, 12, 88},
                {1, 3, 7, 0}
        };
        System.out.println("二维数组 twoDimenArr 的长度：" + twoDimenArr.length);   // 二维数组 twoDimenArr 的长度：3
        System.out.println("二维数组 twoDimenArr, 第二维的值：" + Arrays.toString(twoDimenArr[1])); // 二维数组 twoDimenArr, 第二维的值：[9, 20, 11, 12, 88]
        System.out.println("二维数组 twoDimenArr, 第二维的长度：" + twoDimenArr[1].length); // 二维数组 twoDimenArr, 第二维的长度：5
        System.out.println("二维数组 twoDimenArr, 打印某个值：" + twoDimenArr[1][1]); // 二维数组 twoDimenArr, 打印某个值：20
        // 打印二维数组
        for (int[] onePiece : twoDimenArr) {
            System.out.print("二维中的每一维值：");
            for (int oneEle : onePiece) {
                // 二维中的每一维值：15, 6, 7, 8,
                // 二维中的每一维值：9, 20, 11, 12, 88,
                // 二维中的每一维值：1, 3, 7, 0,
                System.out.print(oneEle + ", ");
            }
            System.out.println();
        }
        // 一次性打印二维数组：[[15, 6, 7, 8], [9, 20, 11, 12, 88], [1, 3, 7, 0]]
        System.out.println("一次性打印二维数组：" + Arrays.deepToString(twoDimenArr));
        // 定义三维数组
        int[][][] threeDimenArr = {
                {
                        {1, 3, 7},
                        {4, 2, 9}
                },
                {
                        {11, 31, 7},
                        {41, 21, 9},
                        {42, 22, 91}
                },
                {
                        {21, 311, 7},
                        {31, 111, 9},
                        {12, 212, 91}
                }
        };
        // 一次性打印三维数组：[[[1, 3, 7], [4, 2, 9]], [[11, 31, 7], [41, 21, 9], [42, 22, 91]], [[21, 311, 7], [31, 111, 9], [12, 212, 91]]]
        System.out.println("一次性打印三维数组：" + Arrays.deepToString(threeDimenArr));

        // 命令行参数
        for (String arg : args) {
            System.out.println(arg);  // aaa  bbb
            if (arg.equals("xxxx")) {
                System.out.println("找到了");
            }
        }
    }
}
