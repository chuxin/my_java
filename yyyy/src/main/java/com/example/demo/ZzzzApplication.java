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


        OOPknowledge mtObj = new OOPknowledge();
        mtObj.name = "louis qian";
        mtObj.age = -100;

        mtObj.setAddress(" 无锡市 顾山镇 ");
        mtObj.setSex(999);
        System.out.println("地址是：" + mtObj.getAddress());
        System.out.println("年龄是：" + mtObj.getSex());

        mtObj.getFormerNames("aa", "bb", "xxx", "yyy");
        mtObj.getFormerNames("aa");
        mtObj.getFormerNames();

        mtObj.getFormerAddresses(new String[] {"mm", "nn", "pp"});
        mtObj.getFormerAddresses(new String[] {});
    }

}

