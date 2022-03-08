package com.example.demo;

import com.example.demo.mypackages.BasicKnowledge;
import com.example.demo.mypackages.OOPknowledge;

//@SpringBootApplication
public class ZzzzApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ZzzzApplication.class, args);

        String[] myArgs = {"aaa", "bbb"};
//        BasicKnowledge bkObj = new BasicKnowledge();
//        bkObj.testBasic(myArgs);

        // 构造方法
        OOPknowledge mtObj = new OOPknowledge();
        System.out.println("第一个构造函数传入的值：" + mtObj.val11 + " " + mtObj.age11);
        OOPknowledge mtObj11 = new OOPknowledge("bbb", 33);
        System.out.println("第二个构造函数传入的值：" + mtObj11.val11 + " " + mtObj11.age11);
        OOPknowledge mtObj22 = new OOPknowledge("ccc");
        System.out.println("第三个构造函数传入的值：" + mtObj22.val22 + " " + mtObj22.val11
                + " " + mtObj22.age11);

        // 方法
        mtObj.name = "louis qian";
        mtObj.age = -100;

        mtObj.setAddress(" 无锡市 顾山镇 ");
        mtObj.setSex(999);
        System.out.println("地址是：" + mtObj.getAddress());
        System.out.println("年龄是：" + mtObj.getSex());

        mtObj.getFormerNames("aa", "bb", "xxx", "yyy");
        mtObj.getFormerNames("aa");
        mtObj.getFormerNames();
        mtObj.getFormerNames(null);

        mtObj.getFormerAddresses(new String[] {"mm", "nn", "pp"});
        mtObj.getFormerAddresses(new String[] {});
        mtObj.getFormerAddresses(null);

        // 方法重载
        String s = "Test string";
        int n1 = s.indexOf("t");
        int n2 = s.indexOf("es");
        int n3 = s.indexOf("t", 4);
        System.out.println("indexOf函数，传入不同参数，返回的位置分别是：" + n1 + ", " + n2 + ", " + n3);

        OOPknowledge myObjLoad11 = new OOPknowledge();
        OOPknowledge myObjLoad22 = new OOPknowledge();
        myObjLoad11.setCountry("test overload 11");
        myObjLoad22.setCountry("test overload 22", "test overload 22-22");
        System.out.println("重载方法，调用定义了一个参数的setCountry：" + myObjLoad11.country + ", " + myObjLoad11.secondCountry);
        System.out.println("重载方法，调用定义了两个参数的setCountry：" + myObjLoad22.country + ", " + myObjLoad22.secondCountry);

        // 继承
        
    }

}

