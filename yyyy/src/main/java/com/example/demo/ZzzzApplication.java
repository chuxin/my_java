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

import com.example.demo.testStatic.MyStatic;
import com.example.demo.testStatic.StaticInterface;
import com.example.demo.testStatic.MyScope;
import com.example.demo.testStatic.MyTestPackage;

import java.util.HashMap;

//@SpringBootApplication
public class ZzzzApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ZzzzApplication.class, args);

        /*********   java 基础  *********/
        String[] myArgs = {"aaa", "bbb"};
//        BasicKnowledge bkObj = new BasicKnowledge();
//        bkObj.testBasic(myArgs);

        /*********   java 面向对象  *********/
//        testOOP();

        /*********   java 核心类  *********/

    }

    public static double taxTotal(Income... arr) {
        double total = 0;
        for(Income piece:arr) {
            total += piece.getTax();
        }

        return total;
    }

    public static void testOOP() {
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
        com.example.demo.testAbstract.Student studentObj = new com.example.demo.testAbstract.Student();
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
        com.example.demo.testInterface.Student myStuObj = new com.example.demo.testInterface.Student("我的学生");
        myStuObj.run();
        System.out.println("MyStudent->name: " + myStuObj.getName());

        // 接口定义 default 方法（JDK>=1.8），那么子类就不再必须重写此方法，只需要在需要覆写的地方去覆写。
        // default方法和抽象类的普通方法是有所不同的。因为interface没有字段，default方法无法访问字段，而抽象类的普通方法可以访问实例字段。
        myStuObj.noNeedInherit();
        myStuObj.noNeedInherit2();

        // 静态字段
        // 在一个class中定义的字段，我们称之为实例字段
        // 实例字段在每个实例中都有自己的一个独立“空间”，但是静态字段只有一个共享“空间”，所有实例都会共享该字段。
        MyStatic msObj11 = new MyStatic("静态测试11");
        MyStatic msObj22 = new MyStatic("静态测试22");
        System.out.println("实例字段值不相同：" + msObj11.name + ", " + msObj22.name);
        msObj11.number = 88;
        System.out.println("静态字段值共享：" + msObj11.number + ", " + msObj22.number);
        msObj11.number = 99;
        System.out.println("静态字段值共享：" + msObj11.number + ", " + msObj22.number);
        // 静态字段并不属于实例。实例对象并没有静态字段。推荐用类名来访问静态字段
        // 通常情况下，通过实例变量访问静态字段和静态方法，会得到一个编译警告
        System.out.println("静态字段值共享：" + MyStatic.number);

        // 静态方法
        // 调用静态方法通过类名就可以调用
        // 静态方法内部，无法访问this变量，也无法访问实例字段，它只能访问静态字段。
        // 静态方法经常用于工具类。例如：Arrays.sort()     Math.random()
        MyStatic.setAge(77);
        System.out.println("静态方法里对静态字段 age 赋值了： " + MyStatic.age);
        // 接口的静态字段
        System.out.println("接口静态字段： " + StaticInterface.male + ", " + StaticInterface.female);

        // 作用域
        // import.* 表示把这个包下面的所有class都导入进来（但不包括子包的class）
        // 默认自动import当前package的其他class
        // 默认自动import java.lang.*
        // 确定唯一的包名。推荐的做法是使用倒置的域名来确保唯一性。例如：  com.liaoxuefeng.sample

        // 推荐把private方法放到后面，因为public方法定义了类对外提供的功能，阅读代码的时候，应该先关注public方法
        // Java支持嵌套类，如果一个类内部还定义了嵌套类，那么，嵌套类拥有访问private的权限
        MyScope msObj = new MyScope();
        msObj.doSomething();

        // 包作用域是指一个类允许访问同一个package的没有public、private修饰的class，以及没有public、protected、private修饰的字段和方法。
        // 同一个package指：包名必须完全一致，包没有父子关系，com.apache和com.apache.abc是不同的包。
        MyTestPackage mtpObj = new MyTestPackage();
        mtpObj.printFriend();

        // 最佳实践
        // 如果不确定是否需要public，就不声明为public，即尽可能少地暴露对外的字段和方法。
        // 一个.java文件只能包含一个public类，但可以包含多个非public类。如果有public类，文件名必须和public类的名字相同。
        // Java内建的访问权限包括public、protected、private和package权限

        // 三种内部类
        // Inner Class
        msObj.doSomething2();
        // Anonymous Class
        msObj.doSomething3();

        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>(){}; // 匿名类!
        HashMap<String, String> map3 = new HashMap<>(){
            {
                put("A", "你好啊啊啊");
                put("B", "我很好");
            }
        };
        System.out.println("这里用char就有问题，" + map3.get('B'));
        System.out.println("这里用字符串就没问题，" + map3.get("B"));

        // Static Nested Class
        msObj.doSomething4();

        // classpath
        // classpath是JVM用到的一个环境变量，它用来指示JVM如何搜索class
        // 在系统环境变量中设置classpath环境变量，不推荐
        // 在启动JVM时设置classpath变量，推荐

        // jar （没实践）
        // 对散落在各层目录中的.class文件打成一个包
        // Maven，可以非常方便地创建jar包
        // JVM自带的Java标准库，实际上也是以jar文件形式存放的，这个文件叫rt.jar，一共有60多M
        // 学习地址：https://www.liaoxuefeng.com/wiki/1252599548343744/1260466914339296

        // 模块 （没实践）
        // 如果a.jar必须依赖另一个b.jar才能运行，那我们应该给a.jar加点说明啥的，让程序在编译和运行的时候能自动定位到b.jar，这种自带“依赖关系”的class容器就是模块
        // 模块的重要作用就是声明依赖关系
        // 学习地址：https://www.liaoxuefeng.com/wiki/1252599548343744/1281795926523938
    }
}

