package com.example.demo;

import com.example.demo.mypackages.OOPknowledge;
import com.example.demo.mypackages.FirstChild;
import com.example.demo.mypackages.SecondChid;
import com.example.demo.mypackages.ThirdChild;

import com.example.demo.polymorphic.Income;
import com.example.demo.polymorphic.Salary;
import com.example.demo.polymorphic.Allowance;
import com.example.demo.polymorphic.TestFinal;

import com.example.demo.testAbstract.Student;

import com.example.demo.testInterface.Student;

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
        FirstChild fcObj = new FirstChild();
        fcObj.setAddress("子类地址,顾山镇，某某村");
        fcObj.setSex(77);
        fcObj.getParentAttributes();
        fcObj.getSelfAttributes();

        SecondChid scObj = new SecondChid("二儿子", 55, 130);
        scObj.printInitValues();

        // 向上转型
        FirstChild fcObj22 = new FirstChild();
        OOPknowledge oopObj22 = fcObj22;
        Object o1 = fcObj22;
        Object o2 = oopObj22;
        Object o3 = null;
        // 向下转型
        OOPknowledge oopObj33 = new OOPknowledge();
//        FirstChild fcObj33 = (FirstChild) oopObj33;       // cannot be cast to
        // instanceof实际上判断一个变量所指向的实例是否是指定类型，或者这个类型的子类
        // 避免转型出错，先判断一个实例究竟是不是某种类型
        if (o3 instanceof OOPknowledge) {
            System.out.println("父类对象 o3 属于 子类 OOPknowledge 的实例");
        }
        if (fcObj22 instanceof OOPknowledge) {
            System.out.println("子类对象 fcObj22 属于 父类 OOPknowledge 的实例");
        }

        Object obj = "hello";
        if (obj instanceof String) {
            String ss = (String) obj;
            System.out.println("从Java 14开始，判断instanceof后，可以直接转型为指定变量 " + ss.toUpperCase());
        }

        // 多态
        // override 方法名相同，参数相同，返回值类型相同
        // overload 方法名相同，返回值类型相同, 但参数不同。
        // Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。这个非常重要的特性在面向对象中称之为多态
        OOPknowledge tcObj = new ThirdChild();
        tcObj.getThirdChildValue();
        OOPknowledge oopObj44 = new OOPknowledge();
        oopObj44.getThirdChildValue();

        Income[] objArr = {
                new Income(100),
                new Salary(20000),
                new Allowance(300)
        };
        System.out.println(taxTotal(objArr));

        // super 关键词
        Salary sObj = new Salary(0);
        System.out.println("super关键词测试：" + sObj.getTestSuper());

        // final 关键词
//        sObj.values = "jjjj";       // 无法为最终变量values分配值
        TestFinal testObj = new TestFinal(99);
        testObj.getQuota();
//        testObj.setClothes(88);
//        testObj.getClothes();     // 无法为最终变量clothes分配值

        // 抽象类
        Student studentObj = new Student();
        studentObj.run();

        // 接口
        // 如果一个抽象类没有字段，所有方法全部都是抽象方法，就可以把该抽象类改写为接口
        // 所谓interface，就是比抽象类还要抽象的纯抽象接口，因为它连字段都不能有。因为接口定义的所有方法默认都是public abstract的，所以这两个修饰符不需要写出来（写不写效果都一样）。
        //
        //              abstract class	        interface
        // 继承	        只能extends一个class	    可以implements多个interface
        // 字段	        可以定义实例字段	        不能定义实例字段
        // 抽象方法	    可以定义抽象方法	        可以定义抽象方法
        // 非抽象方法	    可以定义非抽象方法	        可以定义default方法
        //
        // 合理设计interface和abstract class的继承关系，可以充分复用代码。一般来说，公共逻辑适合放在abstract class中，
        // 具体逻辑放到各个子类，而接口层次代表抽象程度。
        Student stuObj = new Student();

    }

    public static double taxTotal(Income... arr) {
        double total = 0;
        for(Income piece:arr) {
            total += piece.getTax();
        }

        return total;
    }

}

