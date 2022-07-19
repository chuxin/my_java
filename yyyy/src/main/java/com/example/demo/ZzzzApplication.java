package com.example.demo;

import com.example.demo.bean.Book;
import com.example.demo.bean.Book22;
import com.example.demo.myQueue.KafkaConsumerTest;
import com.example.demo.myQueue.KafkaProducerTest;
import com.example.demo.myQueue.RabbitConsumerTest;
import com.example.demo.myQueue.RabbitProducerTest;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sun.tools.javac.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.mypackages.OOPknowledge;
import com.example.demo.mypackages.FirstChild;
import com.example.demo.mypackages.SecondChid;
import com.example.demo.mypackages.ThirdChild;

import com.example.demo.polymorphic.Income;
import com.example.demo.polymorphic.Salary;
import com.example.demo.polymorphic.Allowance;
import com.example.demo.polymorphic.TestFinal;

import com.example.demo.testStatic.MyStatic;
import com.example.demo.testStatic.StaticInterface;
import com.example.demo.testStatic.MyScope;
import com.example.demo.testStatic.MyTestPackage;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

import com.example.demo.coreClass.MyCounter;
import com.example.demo.coreClass.MyJavaBean;
import com.example.demo.coreClass.Weekday;

import java.math.BigDecimal;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.*;

import com.example.demo.testT.PersonT;
import com.example.demo.testT.Pair;

import com.example.demo.testCollections.MyStudent;
import com.example.demo.testCollections.Students;
import com.example.demo.testCollections.HisStudent;
import com.example.demo.testCollections.User;

import com.example.demo.testFunctionalProgramming.Person;
import org.springframework.cglib.core.Converter;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.example.demo.mypackages.MyHandler;

// 方法①  @ImportResource 导入 Spring 配置文件  不推荐
//@ImportResource(locations = {"classpath:/beans.xml"})
@SpringBootApplication
public class ZzzzApplication {
    final static String salutation = "that's the truth";
    static Random random18 = new Random(0);

    public static void main(String[] args) {
        SpringApplication.run(ZzzzApplication.class, args);


        /*********   java 基础  *********/
//        String[] myArgs = {"aaa", "bbb"};
//        BasicKnowledge bkObj = new BasicKnowledge();
//        bkObj.testBasic(myArgs);

        /*********   java 面向对象  *********/
//        testOOP();

        /*********   java 核心类  *********/
//        testCoreClass();

        /*********   注解  *********/
//        testAnnotationHaHa();

        /*********   泛型  *********/
//        testGenericity();

        /*********   集合  *********/
//        testCollection();

        /*********   反射 Reflection   有点复杂，先不看  *********/
        // Java的反射是指程序在运行期可以拿到一个对象的所有信息

        /*********   Functional Programming   *********/
//        testFunctionalProgramming();

        /*********   make a summary (basic)   *********/
        // done

        /*********   开始看框架 spring boot  *********/
        // 1. spring boot 文档粗略看一下。看什么？ 目录结构分别干什么用，配置文件分别干什么用
        // 2、教程基本要看完，涉及纯理论的，原理性的东西，可以先忽略

        /*********   make a summary (spring boot)   *********/
        // done

        /*********   开始看框架 spring  *********/
        // done

        /*********   make a summary (spring)   *********/
        // done

        /*********   开始看框架 mybatis *********/
        // done

        /*********   make a summary (mybatis)   *********/
        // done

        /*********   开始看框架 springMVC *********/
        // done

        /*********   make a summary (springMVC)   *********/
        // done

        /*********   穿插一件事   *********/
        // back up the files in recent one year
        // done

        /*********   开始看框架 spring cloud （粗略看，做到心中有数即可）   *********/
        // done

        /*********   make a brief summary (spring cloud)   *********/
        // done

        /*********   make a summary at second time (basic)   *********/
        // 回过头看最初的教程，基础最重要。     把之前没看的，没学的，都看一遍
        //
        // 复习 basic_summary.txt
        // xml 与 json
        // 日期与时间
        // 函数式编程
        // IO
        // 正则表达式
        // Maven基础
        // 单元测试
        //
        // 反射     粗略看   xx
        // EJB 概念整理  https://blog.csdn.net/soulofball/article/details/110206188
        // lambda 表达式   https://www.runoob.com/java/java8-lambda-expressions.html
        // 多线程   粗略看   线程同步
        //
        // kafka
        //    https://juejin.cn/post/6844903919328428040  简单教程，已看完
        //    https://juejin.cn/post/6844903495670169607#heading-4  详细教程，还没全部看完
        //
        // 泛型学习扩展
        //      https://blog.csdn.net/m0_49508485/article/details/123070574
        //      https://www.cnblogs.com/zwcmt/p/15018421.html
        // rabbitMQ
        //
        // 把目前的 summary 复习一遍
        // 抽空背背 java 面试题
        //
        // 看完以上，消化后，看项目代码，先从简单的项目着手 ！！！
        //     什么是简单的项目？本地能跑起来的，能进行调试的项目
        // 集合里先把 List 和 map 练熟再说，最最常用
        //     看看其它 java 教程，会有新的感悟
        //

//        testBasicSecond();
//        testBasicThird();
//        testTopicKafka();
        testRabbitMQ();


        /*********   springboot => practice       *********/
        // 0、crud  postman实现
        // 1、登录 + curd + 页面展示
        // 2、github上找个完整的项目看看  （不一定做，后面再说）
        //      https://blog.csdn.net/qq_41288095/article/details/89743041

        //
        //  其它
        //    mybatis-plus
        //    tkmybatis
        //    springDataJpa
        //  中间件：https://blog.csdn.net/qq_15038189/article/details/120209333
        //  高并发
        //  数据库
        //  消息队列
    }

    public static void testRabbitMQ() {
        RabbitProducerTest rpt = new RabbitProducerTest();
        try {
            rpt.sendMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }

        RabbitConsumerTest rct = new RabbitConsumerTest();
        try {
            rct.receiveMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testTopicKafka() {
        // java 操作 kafka
        // topic: 消息队列的名称，可以先行在kafka服务中进行创建。如果kafka中并未创建该topic，那么便会自动创建！
        KafkaProducerTest kpt = new KafkaProducerTest("louisTest55");
        Thread thread21 = new Thread(kpt);
        thread21.start();
        KafkaConsumerTest kct = new KafkaConsumerTest("louisTest55");
        Thread thread22 = new Thread(kct);
        thread22.start();
    }

    public static double taxTotal(Income... arr) {
        double total = 0;
        for(Income piece:arr) {
            total += piece.getTax();
        }

        return total;
    }

    public static void testFunctionalProgramming() {
        // Lambda表达式简化了Java的函数式编程
        String[] arr = new String[]{"Apple", "Orange", "Banana", "Lemon"};
//        Arrays.sort(arr, (s1, s2) -> {
//            return s1.compareTo(s2);
//        });
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 把一个List<String>转换为List<Person>
        // 方法①
        List<String> names = List.of("ee", "ff", "gg");
        List<Person> persons = new ArrayList<>();
        for (String name: names) {
            persons.add(new Person(name));
        }
        System.out.println(persons);
        // 方法②  看不懂， map, Person::new
        List<Person> persons2 = names.stream().map(Person::new).collect(Collectors.toList());
        System.out.println(persons2);
    }

    public static void testCollection() {
        // 数组有如下限制:
        //      数组初始化后大小不可变；
        //      数组只能按索引顺序存取。
        // 集合:
        //      可变大小的顺序链表
        //      保证无重复元素的集合

        // 使用 list      优先使用ArrayList
        //                  ArrayList	    LinkedList
        // 获取指定元素	    速度很快	        需要从头开始查找元素
        // 添加元素到末尾	    速度很快	        速度很快
        // 在指定位置添加/删除	需要移动元素	    不需要移动元素
        // 内存占用	        少	            较大

        // ① 创建 list
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add(null);
        list.add("banana");
        System.out.println(list.size());    // 4
        String second = list.get(1);
        System.out.println(second + ", " + list.get(2));    // pear, null
        // ② 创建 list
        List<Integer> list2 = List.of(1, 4, 8);  // 不接受null值

        // 遍历 list
        List<String> list3 = List.of("aa", "bb", "cc");
        // ① 繁琐，不常用
        for (int i = 0; i < list3.size(); i++) {
            String s = list3.get(i);
            System.out.println(s);  // aa bb cc
        }
        // ② 写法复杂
        for (Iterator<String> it = list3.iterator(); it.hasNext();) {
            String s = it.next();
            System.out.println(s);  // aa bb cc
        }
        // ③ 自动把for each循环变成Iterator的调用
        for (String s: list3) {
            System.out.println(s);  // aa bb cc
        }

        // list 和 array 转换
        // ① list -> array
        List<String> list4 = List.of("xx", "yy", "zz");
        Object[] arr4 = list4.toArray();
        for (Object s: arr4) {
            System.out.println(s);  // xx yy zz
        }
        // ② list -> array
        String[] arr5 = list4.toArray(new String[3]);
        for (String s: arr5) {
            System.out.println(s);  // xx yy zz
        }
        // ③ list -> array      传入一个“恰好”大小的数组    常用
//        String[] arr6 = list4.toArray(new String[list4.size()]);
        String[] arr6 = list4.toArray(String[]::new);
        for (String s: arr6) {
            System.out.println(s);  // xx yy zz
        }

        // array -> list
        Integer[] arr7 = {1, 3, 5};
        List<Integer> list5 = List.of(arr7);
//        list5.add(99);    // 返回的是一个只读List,不能添加元素，否则报错：UnsupportedOperationException

        // list 常用函数
        List<String> list6 = List.of("A", "B", "C");
        System.out.println(list6.contains("C"));    // true
        System.out.println(list6.contains("c"));    // false
        System.out.println(list6.indexOf("C"));     // 2
        System.out.println(list6.indexOf("c"));     // -1

        // 使用 map
        // 定义：键值（key-value）映射表的数据结构，作用就是能高效通过key快速查找value（元素）
        // map存整型
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 11);
        map.put("pear", 22);
        map.put("banana", 44);
        System.out.println(map.get("apple"));   // 11
        map.put("apple", 33);
        System.out.println(map.get("apple"));   // 33
        // map存对象
        MyStudent msObj = new MyStudent("louis", 999);
        Map<String, MyStudent> map2 = new HashMap<>();
        map2.put("louisXX", msObj);
        MyStudent msObj2 = map2.get("louisXX");
        System.out.println(msObj2);             // com.example.demo.testCollections.MyStudent@87aac27
        System.out.println(msObj2 == msObj);    // true, 同一个实例
        System.out.println(msObj2.score);       // 999
        MyStudent msObj3 = map2.get("louisYY");
        System.out.println(msObj3);             // null
        // 遍历 map  键值对输出顺序随机
        // 方法①
        for (String key: map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " - " + value);
            // banana - 44
            // apple - 33
            // pear - 22
        }
        // 方法②
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " - " + value);
            // banana - 44
            // apple - 33
            // pear - 22
        }
        // map 练习
        Integer ii22 = new Integer(88);
        System.out.println(ii22.intValue());    // 88
        List<MyStudent> list7 = List.of(
                new MyStudent("aaa", 91),
                new MyStudent("bbb", 92),
                new MyStudent("ccc", 93)
        );
        var holder = new Students(list7);
        System.out.println(holder.getScore("aaa") == 91 ? "测试成功" : "测试失败"); // 测试成功
        System.out.println(holder.getScore("bbb") == 92 ? "测试成功" : "测试失败"); // 测试成功
        System.out.println(holder.getScore("ccc") == 94 ? "测试成功" : "测试失败"); // 测试失败
        // 编写自己的equals和hashCode
        // 在Map的内部，对key做比较是通过equals()实现的，这一点和List查找元素需要正确覆写equals()是一样的
        // 下面的就没有再去研究了
        //      当自定义一个类并放入HashMap时，要正确使用HashMap，作为key的类必须正确覆写equals()和hashCode()方法。覆写规则是：
        //          如果equals()返回true，则hashCode()返回值必须相等；
        //          如果equals()返回false，则hashCode()返回值尽量不要相等
        Map<String, Integer> map3 = new HashMap<>();
        String key1 = "a";
        String key2 = new String("a");
        map3.put(key1, 123);
        System.out.println(map3.get(key2));     // 123
        System.out.println(key1 == key2);       // false
        System.out.println(key1.equals(key2));  // true

        // 使用EnumMap
        // EnumMap 在内部以一个非常紧凑的数组存储value，并且根据enum类型的key直接定位到内部数组的索引，并不需要计算hashCode()，效率最高，没有空间浪费
        // HashMap是一种通过对key计算hashCode()，通过空间换时间的方式，直接定位到value所在的内部数组的索引，因此，查找效率非常高
        Map<DayOfWeek, String> map4 = new EnumMap<>(DayOfWeek.class);
        map4.put(DayOfWeek.MONDAY, "星期一拉拉");
        map4.put(DayOfWeek.TUESDAY, "星期二拉拉");
        map4.put(DayOfWeek.WEDNESDAY, "星期三拉拉");
        map4.put(DayOfWeek.THURSDAY, "星期四拉拉");
        map4.put(DayOfWeek.FRIDAY, "星期五拉拉");
        map4.put(DayOfWeek.SATURDAY, "星期六拉拉");
        map4.put(DayOfWeek.SUNDAY, "星期七拉拉");
        System.out.println(map4);   // 输出格式记一下，貌似 map 特有的
        // {MONDAY=星期一拉拉, TUESDAY=星期二拉拉, WEDNESDAY=星期三拉拉, THURSDAY=星期四拉拉, FRIDAY=星期五拉拉, SATURDAY=星期六拉拉, SUNDAY=星期七拉拉}
        System.out.println(map4.get(DayOfWeek.MONDAY)); // 星期一拉拉

        // 使用 TreeMap
        // SortedMap是接口，它的实现类是TreeMap，TreeMap在内部会对Key进行排序
        // Java编程基本规则：出现问题，不要怀疑Java标准库，要从自身代码找原因。
        // TreeMap不使用equals()和hashCode()，所以无需覆写 equals()和hashCode()
        Map<String, Integer> map5 = new TreeMap<>();
        map5.put("orange", 11);
        map5.put("apple", 2);
        map5.put("pear", 3);
        for (String key:map5.keySet()) {
            System.out.println(key);    // apple orange pear
        }
        // 使用TreeMap时，放入的Key必须实现Comparable接口。String、Integer这些类已经实现了Comparable接口，因此可以直接作为Key使用。作为Value的对象则没有任何要求。
        // 如果作为Key的class没有实现Comparable接口，那么，必须在创建TreeMap时同时指定一个自定义排序算法
        // TreeMap不需要覆盖 equals()和hashCode()
        Map<HisStudent, Integer> map6 = new TreeMap<>(new Comparator<HisStudent>() {
            public int compare(HisStudent hs1, HisStudent hs2) {
                // 如果等于的情况注释， 下面循环之后输出的那句话，就是 null
                if (hs1.age == hs2.age) {
                    return 0;
                }
                return hs1.age > hs2.age ? -1 : 1;
            }
        });
        map6.put(new HisStudent("Tom", 2), 2);
        map6.put(new HisStudent("Bob", 3), 3);
        map6.put(new HisStudent("louis", 1), 1);
        for (HisStudent key: map6.keySet()) {
            System.out.println(key);
            // HisStudent{name='Bob', age=3}
            // HisStudent{name='Tom', age=2}
            // HisStudent{name='louis', age=1}
        }
        System.out.println(map6.get(new HisStudent("louis", 1)));  // 1  ,  没有上面的 == 判断，这里就是 null

        // 使用Properties
        // 读取配置文件
        // ① 创建Properties实例；
        // ② 调用load()读取文件；
        // ③ 调用getProperty()获取配置。
        try {
            Properties props = new Properties();
            // load(InputStream)方法接收一个InputStream实例，表示一个字节流，它不一定读的文件流  ①
            // 下面两个地址都行
//            String f = "src/main/java/com/example/demo/testCollections/test.properties";
            String f = "/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/src/main/java/com/example/demo/testCollections/test.properties";
            // java.io.FileInputStream 以ASCII编码读取字节流
            // java.io.FileReader 支持中文，第二个参数指定编码
            props.load(new FileReader(f, StandardCharsets.UTF_8));
            String distributionUrl = props.getProperty("distributionUrl");
            String xxx = props.getProperty("xxx");
            System.out.println(distributionUrl + " " + xxx);    // ddddddd 111
        } catch (java.io.FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
        // ② 从jar包中读取的资源流：  没试验成功 ？？？
        ZzzzApplication zzzz = new ZzzzApplication();
        System.out.println(zzzz.getClass().getClassLoader().getResourceAsStream("/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/src/11.properties"));
        // ③ 从内存读取一个字节流
        try {
            String settings = "# test\n" + "course=Java\n" + "last_date=2019-08-07T12:35:01";
            ByteArrayInputStream input = new ByteArrayInputStream(settings.getBytes("UTF-8"));
            Properties props2 = new Properties();
            props2.load(input);
            System.out.println("course:" + props2.getProperty("course"));           // course:Java
            System.out.println("last_date:" + props2.getProperty("last_date"));     // last_date:2019-08-07T12:35:01
            System.out.println("last_file:" + props2.getProperty("last_file"));     // last_file:null
            System.out.println("auto_save:" + props2.getProperty("auto_save", "66")); // auto_save:66
        } catch (java.io.UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }

        // 写入配置文件
        try {
            Properties props3 = new Properties();
            props3.setProperty("url", "www.baidu.com");
            props3.setProperty("name", "百度");
            props3.store(new FileOutputStream("/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/src/writeIn.properties"), "这是写入的注释");
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }

        // 使用Set
        Set<String> set = new HashSet<>();
        // 将元素添加进Set<E>
        System.out.println(set.add("abc"));     // true
        System.out.println(set.add("xyz"));     // true
        System.out.println(set.add("yyy"));     // true
        // 将元素从Set<E>删除
        System.out.println(set.contains("abc"));    // true
        System.out.println(set.contains("xxx"));    // false
        // 判断是否包含元素
        System.out.println(set.remove("hello")); // false
        System.out.println(set.remove("xyz"));   // true
        System.out.println(set.size());             // 2

        // set 是接口，它的实现类是HashSet，HashSet是无序的，没有实现SortedSet接口
        // set 是接口，它的实现类是TreeSet，TreeSet是有序的，实现了SortedSet接口
        // TreeSet,输出是有序的
        Set<String> set2 = new TreeSet<>();
        set2.add("apple");
        set2.add("orange");
        set2.add("pear");
        set2.add("banana");
        for (String s: set2) {
            System.out.println(s);  // apple banana orange pear
        }

        // 使用Queue
        // Queue和List的区别在于，List可以在任意位置添加和删除元素，而Queue只有两个操作：把元素添加到队列末尾；从队列头部取出元素。
        // 注意：要避免把null添加到队列
        //
        // size() 获取队列长度
        //                  throw Exception	    返回false或null
        // 添加元素到队尾	    add(E e)	        boolean offer(E e)
        // 取队首元素并删除	E remove()	        E poll()
        // 取队首元素但不删除	E element()	        E peek()
        Queue<String> q = new LinkedList<>();
        // 添加
        try {
            q.add("apple");
            System.out.println("添加成功");     // 添加成功
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            System.out.println("添加失败");
        }
        if (q.offer("apple2")) {
            System.out.println("添加成功");     // 添加成功
        } else {
            System.out.println("添加失败");
        }
        // 取队首元素但不删除
        try {
            String s = q.element();
            System.out.println(s);              // apple
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            System.out.println("取元素，但不删除，操作失败");
        }
        String s2 = q.peek();
        if (s2 != null) {
            System.out.println(s2);             // apple
            System.out.println("取元素，但不删除，操作成功");    // 取元素，但不删除，操作成功
        } else {
            System.out.println("取元素，但不删除，操作失败");
        }
        // 取队首元素并删除
        try {
            String s3 = q.remove();
            System.out.println("取元素，并删除，操作成功"); // 取元素，并删除，操作成功
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            System.out.println("取元素，并删除，操作失败");
        }
        String s4 = q.poll();
        if (s4 != null) {
            System.out.println("取元素，并删除，操作成功");  // 取元素，并删除，操作成功
            System.out.println(s4);                     // apple2
        } else {
            System.out.println("取元素，并删除，操作失败");
        }

        // peek & poll 的区别
        Queue<String> q2 = new LinkedList<>();
        q2.offer("aaa");
        q2.offer("bbb");
        System.out.println(q2.poll());  // aaa
        System.out.println(q2.poll());  // bbb
        System.out.println(q2.poll());  // null  ,   因为队列是空的

        Queue<Integer> q3 = new LinkedList<>();
        q3.offer(11);
        q3.offer(22);
        q3.offer(33);
        System.out.println(q3.peek());  // 11
        System.out.println(q3.peek());  // 11

        // LinkedList即实现了List接口，又实现了Queue接口
        List<String> list8 = new LinkedList<>();
        Queue<String> q4 = new LinkedList<>();

        // 使用PriorityQueue
        // PriorityQueue和Queue的区别在于，它的出队顺序与元素的优先级有关，对PriorityQueue调用remove()或poll()方法，返回的总是优先级最高的元素
        Queue<String> q5 = new PriorityQueue<>();
        q5.offer("mmm");
        q5.offer("xxx");
        q5.offer("nnn");
        System.out.println(q5.poll() + " " + q5.poll() + " " + q5.poll() + " " + q5.poll());    // mmm nnn xxx null
        // 实现Comparable接口，决定元素排序顺序，出队优先级
        Queue<User> q6 = new PriorityQueue<>();
        q6.offer(new User("Bob", "A1"));
        q6.offer(new User("Alice", "A2"));
        q6.offer(new User("Alice", "A12"));
        q6.offer(new User("Boss", "V1"));
        System.out.println(q6.poll());  // Boss/V1
        System.out.println(q6.poll());  // Bob/A1
        System.out.println(q6.poll());  // Alice/A2
        System.out.println(q6.poll());  // Alice/A12
        System.out.println(q6.poll());  // null,因为队列为空

        // 使用 deque
        // 允许两头都进，两头都出，这种队列叫双端队列（Double Ended Queue），学名Deque
        //                  Queue	                Deque
        // 添加元素到队尾	    add(E e) / offer(E e)	addLast(E e) / offerLast(E e)
        // 取队首元素并删除	E remove() / E poll()	E removeFirst() / E pollFirst()
        // 取队首元素但不删除	E element() / E peek()	E getFirst() / E peekFirst()
        // 添加元素到队首	    无	                    addFirst(E e) / offerFirst(E e)
        // 取队尾元素并删除	无	                    E removeLast() / E pollLast()
        // 取队尾元素但不删除	无	                    E getLast() / E peekLast()
        //
        // Deque是一个接口，它的实现类有ArrayDeque和LinkedList
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("A"); // A
        deque.offerLast("B"); // A <- B
        deque.offerFirst("C"); // C <- A <- B
        System.out.println(deque.pollFirst());  // C   ,  A <- B
        System.out.println(deque.pollLast());   // B   ,  A
        System.out.println(deque.pollFirst());  // A   ,  null
        // LinkedList真是一个全能选手，它即是List，又是Queue，还是Deque。但是我们在使用的时候，总是用特定的接口来引用它，
        // 这是因为持有接口说明代码的抽象层次更高，而且接口本身定义的方法代表了特定的用途。
        // 面向抽象编程的一个原则就是：尽量持有接口，而不是具体的实现类
        // 不推荐的写法
        LinkedList<String> d1 = new LinkedList<>();
        d1.offerLast("z");
        // 推荐的写法
        Deque<String> d2 = new LinkedList<>();
        d2.offerLast("z");

        // 使用Stack  例子有点复杂，先不看

        // 使用Iterator   例子有点复杂，先不看
        // Java的集合类都可以使用for each循环，List、Set和Queue会迭代每个元素，Map会迭代每个key。

        // 使用Collections   例子有点复杂，先不看
    }

    public static void testOOP() {
        // 构造方法
        OOPknowledge mtObj = new OOPknowledge();
        System.out.println("第一个构造函数传入的值：" + mtObj.val11 + " " + mtObj.age11);     // 第一个构造函数传入的值：null 0
        OOPknowledge mtObj11 = new OOPknowledge("bbb", 33);
        System.out.println("第二个构造函数传入的值：" + mtObj11.val11 + " " + mtObj11.age11); // 第二个构造函数传入的值：bbb 33
        OOPknowledge mtObj22 = new OOPknowledge("ccc");
        System.out.println("第三个构造函数传入的值：" + mtObj22.val22 + " " + mtObj22.val11
                + " " + mtObj22.age11);     // 第三个构造函数传入的值：ccc ccc22 44

        // 方法
        mtObj.name = "louis qian";
        mtObj.age = -100;

        mtObj.setAddress(" 无锡市 顾山镇 ");
        mtObj.setSex(999);
        System.out.println("地址是：" + mtObj.getAddress());    // 地址是：无锡市 顾山镇
        System.out.println("年龄是：" + mtObj.getSex());        // 年龄是：999

        mtObj.getFormerNames("aa", "bb", "xxx", "yyy");       // 曾用名：[aa, bb, xxx, yyy]
        mtObj.getFormerNames("aa");     // 曾用名：[aa]
        mtObj.getFormerNames();         // 曾用名：[]
        mtObj.getFormerNames(null);     // 曾用名：null

        mtObj.getFormerAddresses(new String[] {"mm", "nn", "pp"});  // 曾用地址：[mm, nn, pp]
        mtObj.getFormerAddresses(new String[] {});  // 曾用地址：[]
        mtObj.getFormerAddresses(null);     // 曾用地址：null

        // 方法重载
        String s = "Test string";
        int n1 = s.indexOf("t");
        int n2 = s.indexOf("es");
        int n3 = s.indexOf("t", 4);
        System.out.println("indexOf函数，传入不同参数，返回的位置分别是：" + n1 + ", " + n2 + ", " + n3); // indexOf函数，传入不同参数，返回的位置分别是：3, 1, 6

        OOPknowledge myObjLoad11 = new OOPknowledge();
        OOPknowledge myObjLoad22 = new OOPknowledge();
        myObjLoad11.setCountry("test overload 11");
        myObjLoad22.setCountry("test overload 22", "test overload 22-22");
        // 重载方法，调用定义了一个参数的setCountry：test overload 11, null
        System.out.println("重载方法，调用定义了一个参数的setCountry：" + myObjLoad11.country + ", " + myObjLoad11.secondCountry);
        // 重载方法，调用定义了两个参数的setCountry：test overload 22, test overload 22-22
        System.out.println("重载方法，调用定义了两个参数的setCountry：" + myObjLoad22.country + ", " + myObjLoad22.secondCountry);

        // 继承
        FirstChild fcObj = new FirstChild();
        fcObj.setAddress("子类地址,顾山镇，某某村");
        fcObj.setSex(77);
        // 获取父类的public属性address：子类地址,顾山镇，某某村
        // 获取父类的protected属性nationality：China
        fcObj.getParentAttributes();
        // 获取当前类的属性name(注意，此name属性父类也有)：childName
        // 获取父类的属性name：parentName
        fcObj.getSelfAttributes();

        SecondChid scObj = new SecondChid("二儿子", 55, 130);
        scObj.printInitValues();    // 打印构造函数里初始化的参数列表：二儿子 55 130

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
            System.out.println("子类对象 fcObj22 属于 父类 OOPknowledge 的实例"); // 子类对象 fcObj22 属于 父类 OOPknowledge 的实例
        }

        Object obj = "hello";
        if (obj instanceof String) {
            String ss = (String) obj;
            // 从Java 14开始，判断instanceof后，可以直接转型为指定变量 HELLO
            System.out.println("从Java 14开始，判断instanceof后，可以直接转型为指定变量 " + ss.toUpperCase());
        }

        // 多态
        // override 方法名相同，参数相同，返回值类型相同
        // overload 方法名相同，返回值类型相同, 但参数不同。
        // Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。这个非常重要的特性在面向对象中称之为多态
        OOPknowledge tcObj = new ThirdChild();
        tcObj.getThirdChildValue();     // 我是子类 ThirdChild
        OOPknowledge oopObj44 = new OOPknowledge();
        oopObj44.getThirdChildValue();  // 我是父类 OOPknowledge

        Income[] objArr = {
                new Income(100),
                new Salary(20000),
                new Allowance(300)
        };
        System.out.println(taxTotal(objArr));   // 3010.0

        // super 关键词
        Salary sObj = new Salary(0);
        System.out.println("super关键词测试：" + sObj.getTestSuper());    // super关键词测试：43

        // final 关键词
//        sObj.values = "jjjj";       // 无法为最终变量values分配值
        TestFinal testObj = new TestFinal(99);
        testObj.getQuota();     // quota的值：99
//        testObj.setClothes(88);
//        testObj.getClothes();     // 无法为最终变量clothes分配值

        // 抽象类
        com.example.demo.testAbstract.Student studentObj = new com.example.demo.testAbstract.Student();
        studentObj.run();   // student.run

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
        myStuObj.run();     // 我的学生 run
        System.out.println("MyStudent->name: " + myStuObj.getName());   // MyStudent->name: 我的学生

        // 接口定义 default 方法（JDK>=1.8），那么子类就不再必须重写此方法，只需要在需要覆写的地方去覆写。
        // default方法和抽象类的普通方法是有所不同的。因为interface没有字段，default方法无法访问字段，而抽象类的普通方法可以访问实例字段。
        myStuObj.noNeedInherit();   // 我是子类的noNeedInherit
        myStuObj.noNeedInherit2();  // 我是父类的noNeedInherit2

        // 静态字段
        // 在一个class中定义的字段，我们称之为实例字段
        // 实例字段在每个实例中都有自己的一个独立“空间”，但是静态字段只有一个共享“空间”，所有实例都会共享该字段。
        MyStatic msObj11 = new MyStatic("静态测试11");
        MyStatic msObj22 = new MyStatic("静态测试22");
        System.out.println("实例字段值不相同：" + msObj11.name + ", " + msObj22.name);   // 实例字段值不相同：静态测试11, 静态测试22
        msObj11.number = 88;
        System.out.println("静态字段值共享：" + msObj11.number + ", " + msObj22.number); // 静态字段值共享：88, 88
        msObj11.number = 99;
        System.out.println("静态字段值共享：" + msObj11.number + ", " + msObj22.number); // 静态字段值共享：99, 99
        // 静态字段并不属于实例。实例对象并没有静态字段。推荐用类名来访问静态字段
        // 通常情况下，通过实例变量访问静态字段和静态方法，会得到一个编译警告
        System.out.println("静态字段值共享：" + MyStatic.number);   // 静态字段值共享：99

        // 静态方法
        // 调用静态方法通过类名就可以调用
        // 静态方法内部，无法访问this变量，也无法访问实例字段，它只能访问静态字段。
        // 静态方法经常用于工具类。例如：Arrays.sort()     Math.random()
        MyStatic.setAge(77);
        System.out.println("静态方法里对静态字段 age 赋值了： " + MyStatic.age);  // 静态方法里对静态字段 age 赋值了： 77
        // 接口的静态字段
        System.out.println("接口静态字段： " + StaticInterface.male + ", " + StaticInterface.female); // 接口静态字段： 1, 2

        // 作用域
        // import.* 表示把这个包下面的所有class都导入进来（但不包括子包的class）
        // 默认自动import当前package的其他class
        // 默认自动import java.lang.*
        // 确定唯一的包名。推荐的做法是使用倒置的域名来确保唯一性。例如：  com.liaoxuefeng.sample

        // 推荐把private方法放到后面，因为public方法定义了类对外提供的功能，阅读代码的时候，应该先关注public方法
        // Java支持嵌套类，如果一个类内部还定义了嵌套类，那么，嵌套类拥有访问private的权限
        MyScope msObj = new MyScope();
        msObj.doSomething();    // 类名为：MyScope

        // 包作用域是指一个类允许访问同一个package的没有public、private修饰的class，以及没有public、protected、private修饰的字段和方法。
        // 同一个package指：包名必须完全一致，包没有父子关系，com.apache和com.apache.abc是不同的包。
        MyTestPackage mtpObj = new MyTestPackage();
        mtpObj.printFriend();   // 我的隔壁文件里有个静态age，值为；66

        // 最佳实践
        // 如果不确定是否需要public，就不声明为public，即尽可能少地暴露对外的字段和方法。
        // 一个.java文件只能包含一个public类，但可以包含多个非public类。如果有public类，文件名必须和public类的名字相同。
        // Java内建的访问权限包括public、protected、private和package权限

        // 三种内部类
        // Inner Class
        msObj.doSomething2();   // printYouSome: 1
        // Anonymous Class
        msObj.doSomething3();   // hello, 用异步编程测试匿名类

        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>(){}; // 匿名类!
        HashMap<String, String> map3 = new HashMap<>(){
            {
                put("A", "你好啊啊啊");
                put("B", "我很好");
            }
        };
        System.out.println("这里用char就有问题，" + map3.get('B'));   // 这里用char就有问题，null
        System.out.println("这里用字符串就没问题，" + map3.get("B"));  // 这里用字符串就没问题，我很好

        // Static Nested Class
        msObj.doSomething4();   // 测试内部静态类Louis

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

    public static void testCoreClass() {
        // String
        String s = "hello";
        System.out.println(s);  // hello
        s = s.toUpperCase();
        System.out.println(s);  // HELLO
        // 比较字符串
        String s1 = "hello11";
        String s2 = "hello11";
        // 所有相同的字符串当作一个对象放入常量池，自然s1和s2的引用就是相同的。
        System.out.println("字符串比较：" + (s1 == s2));      // 字符串比较：true
        System.out.println("字符串比较：" + s1.equals(s2));   // 字符串比较：true
        String s3 = "hello22";
        String s4 = "HELLo22".toLowerCase();
        System.out.println("字符串比较：" + (s3 == s4));      // 字符串比较：false
        System.out.println("字符串比较：" + s3.equals(s4));   // 字符串比较：true
        System.out.println("字符串比较(忽略大小写)：" + s3.equalsIgnoreCase(s4));  // 字符串比较(忽略大小写)：true
        // 搜索字符串
        System.out.println("hello".contains("ll"));         // true
        System.out.println("hello".indexOf("l"));           // 2
        System.out.println("hello".startsWith("he"));       // true
        System.out.println("hello".endsWith("lo"));         // true
        // 提取字符串
        System.out.println("hello".substring(2));           // llo
        System.out.println("hello".substring(2, 3));        // l
        // 去除首尾空白字符
        System.out.println(" \thello\r\n".trim());          // hello
        // 中文的空格字符\u3000
        System.out.println("\u3000hello\u3000".strip());    // hello
        System.out.println(" hello ".stripLeading());       // hello
        System.out.println(" hello ".stripTrailing());      //  hello
        // isEmpty()和isBlank()来判断字符串是否为空和空白字符串
        System.out.println("".isEmpty());                   // true
        System.out.println(" ".isEmpty());                  // false
        System.out.println(" \n".isBlank());                // true
        System.out.println(" hello ".isBlank());            // false
        // 替换字符串
        System.out.println("hello".replace("l", "w"));      // hewwo
        System.out.println("hello".replace("ll", "~~"));    // he~~o
        System.out.println("A,,B;C ,D".replaceAll("[\\,\\;\\s]+", ","));    // A,B,C,D
        // 分割字符串
        String s5 = "A,B,C,D";
        String[] s5Arr = s5.split("\\,");
        System.out.println(Arrays.toString(s5Arr));      // [A, B, C, D]
        // 拼接字符串
        String[] s6Arr = {"x", "y", "z"};
        String s6 = String.join("--", s6Arr);
        System.out.println(s6);         // x--y--z
        // 格式化字符串
        // 如果你不确定用啥占位符，那就始终用%s，因为%s可以显示任何数据类型
        String s7 = "Hi %s, your score is %.2f, your age is %d";
        System.out.println(String.format(s7, "louis", 88.8, 99));   // Hi louis, your score is 88.80, your age is 99
        // 类型转换
        // 把任意基本类型或引用类型转换为字符串
        System.out.println(String.valueOf(123));           // 123
        System.out.println(String.valueOf(45.67));         // 45.67
        System.out.println(String.valueOf(true));          // true
        System.out.println(String.valueOf(new Object()));  // java.lang.Object@776ec8df
        // 把字符串转换为int类型
        System.out.println(Integer.parseInt("123"));    // 123
        // 字符串转换为boolean类型
        System.out.println(Boolean.parseBoolean("true"));   // true
        System.out.println(Boolean.parseBoolean("FALSE"));  // false
        // Integer有个getInteger(String)方法，它不是将字符串转换为int，而是把该字符串对应的系统变量转换为Integer
        System.out.println(Integer.getInteger("java.version")); // null
        // 字符串转整型
        String sss = "223";
        System.out.println(Integer.valueOf(sss));       // 223
        System.out.println(Integer.parseInt(sss));      // 223
        // String -> char[]
        char[] cs = "hello".toCharArray();
        System.out.println(Arrays.toString(cs));            // [h, e, l, l, o]
        // char[] -> String
        String s8 = new String(cs);
        System.out.println(s8);                             // hello
        // char类型实际上就是两个字节的Unicode编码
        // String和char在内存中总是以Unicode编码表示
        // 转换编码就是将String和byte[]转换，需要指定编码
        // 转换为byte[]时，始终优先考虑UTF-8编码
        try {
            // 把字符串转换成其他编码
            byte[] b1 = "hello".getBytes(); // 按系统默认编码转换，不推荐
            byte[] b2 = "hello".getBytes("UTF-8");  // 按UTF-8编码转换
            byte[] b3 = "hello".getBytes("GBK");    // 按GBK编码转换
            System.out.println(Arrays.toString(b1));        // [104, 101, 108, 108, 111]
            System.out.println(Arrays.toString(b2));        // [104, 101, 108, 108, 111]
            System.out.println(Arrays.toString(b3));        // [104, 101, 108, 108, 111]
            // 把已知编码的byte[]转换为String
            byte[] b4 = {100, 101, 102};
            String s9 = new String(b4, "GBK");
            System.out.println(s9);                     // def
        } catch (UnsupportedEncodingException e) {
            System.out.println("不支持的字符集");
        }

        // StringBuilder  高效拼接字符串, 不会每次循环都会创建新的字符串对象
        StringBuilder sb = new StringBuilder(1024);
        for (int i = 0; i < 10; i++) {
            sb.append(i).append(",");
        }
        System.out.println(sb.toString());              // 0,1,2,3,4,5,6,7,8,9,

        MyCounter mcObj = new MyCounter();
        System.out.println(mcObj.add(3).getNumber());   // 3
        System.out.println(mcObj.add(5).incr().getNumber());    // 9

        // 拼接字符串
        // 方法一  StringBuilder 拼接
        String[] namesArr = {"bob", "alice", "grace"};
        var sb2 = new StringBuilder();
        sb2.append("hello ");
        for (String name:namesArr) {
            sb2.append(name).append(", ");
        }
        sb2.delete(sb2.length()-2, sb2.length());
        sb2.append("!");
        System.out.println(sb2.toString());     // hello bob, alice, grace!
        // 方法二  StringJoiner  拼接
        var sj = new StringJoiner(", ", "hello ", "!");
        for (String name:namesArr) {
            sj.add(name);
        }
        System.out.println(sj.toString());      // hello bob, alice, grace!
        // 方法三  String.join

        // 包装类型
        // Java的数据类型分两种：
        // 基本类型：byte，short，int，long，boolean，float，double，char
        // 引用类型：所有class和interface类型
        // 引用类型可以赋值为null，表示空，但基本类型不能赋值为null

        // int和Integer互相转换
        Integer n = null;
        Integer n2 = Integer.valueOf(99);
        int n3 = n2.intValue();
        System.out.println(n3);             // 99
        Integer n4 = Integer.valueOf("88");
        System.out.println(n4.intValue());  // 88

        Integer n5 = 127;
        Integer n6 = 127;
        Integer n7 = 99999;
        Integer n8 = 99999;
        // 编译器把Integer x = 127;自动变为Integer x = Integer.valueOf(127);
        // 为了节省内存，Integer.valueOf()对于较小的数，始终返回相同的实例，因此，==比较“恰好”为true，
        // 但我们绝不能因为Java标准库的Integer内部有缓存优化就用==比较，必须用equals()方法比较两个Integer
        System.out.println("n5 == n6: " + (n5 == n6));      // n5 == n6: true
        System.out.println("n7 == n8: " + (n7 == n8));      // n7 == n8: false
        System.out.println("n5.equals(n6): " + (n5.equals(n6)));    // n5.equals(n6): true
        System.out.println("n7.equals(n8): " + (n7.equals(n8)));    // n7.equals(n8): true
        // 把字符串解析成一个整数
        int n9 = Integer.parseInt("100");
        // 一些有用的静态变量
        Boolean t = Boolean.TRUE;
        Boolean f = Boolean.FALSE;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int sizeOfLong = Long.SIZE;
        int byteOfLong = Long.BYTES;
        // true  false  2147483647  -2147483648  64  8
        System.out.println(t + " " + f + " " + max + " " + min + " " + sizeOfLong + " " + byteOfLong);
        // 所有的整数和浮点数的包装类型都继承自Number, 所以可以通过包装类型获取各种基本类型
        Number num = Integer.valueOf(77);
        byte b = num.byteValue();
        int n10 = num.intValue();
        long l = num.longValue();
        double d = num.doubleValue();
        float f2 = num.floatValue();
        System.out.println(b + " " + n10 + " " + l + " " + d + " " + f2);  // 77 77 77 77.0 77.0

        // javabean
        // 把一组对应的读方法（getter）和写方法（setter）称为属性（property）
        // boolean字段比较特殊，它的读方法一般命名为isXyz()
        // 只有getter的属性，没有setter属性的，称为只读属性（read-only），反之为只写属性（write-only）

        // 枚举JavaBean属性
        try {
            BeanInfo info = Introspector.getBeanInfo(MyJavaBean.class);
            for (PropertyDescriptor piece:info.getPropertyDescriptors()) {
                // getName(): age
                // getReadMethod(): public int com.example.demo.coreClass.MyJavaBean.getAge()
                // getWriteMethod(): public void com.example.demo.coreClass.MyJavaBean.setAge(int)
                // getName(): class
                // getReadMethod(): public final native java.lang.Class java.lang.Object.getClass()
                // getWriteMethod(): null
                // getName(): name
                // getReadMethod(): public java.lang.String com.example.demo.coreClass.MyJavaBean.getName()
                // getWriteMethod(): public void com.example.demo.coreClass.MyJavaBean.setName(java.lang.String)
                System.out.println("getName(): " + piece.getName());
                System.out.println("getReadMethod(): " + piece.getReadMethod());
                System.out.println("getWriteMethod(): " + piece.getWriteMethod());
            }
        } catch (IntrospectionException e) {
            System.out.println(e.getMessage());
        }

        // enum
        // 使用enum定义的枚举类是一种引用类型
        // enum类型可以使用==比较，也可以使用equals()方法比较，是个例外
        // enum的构造方法要声明为private，字段强烈建议声明为final
        Weekday day = Weekday.SUN;
        if (day == Weekday.SUN) {
            // 返回定义的常量的顺序，从0开始计数
            System.out.println("今天是周末, 数值为：" + day.ordinal() + " ，中文名：" + day.name());  // 今天是周末, 数值为：0 ，中文名：SUN
        }
        if (day.dayValue == 0) {
            System.out.println("今天是周末, 数值为：" + day.dayValue + " ，中文名：" + day.toString() + " || " + day); // 今天是周末, 数值为：0 ，中文名：呃呃呃-星期天 || 呃呃呃-星期天
        }
        day = Weekday.MON;
        switch (day) {
            case MON:
            case TUE:
                System.out.println("Hmmmm, Today is a " + day);     // Hmmmm, Today is a 呃呃呃-星期一
                break;
            case WES:
            case SAT:
                System.out.println("Hmmmm, Today is a --- " + day);
                break;
            default:
                throw new RuntimeException("找不到对应的日期");
        }


        // 记录类  为了不让你用Lombok   没学完，后面再看
        // https://www.liaoxuefeng.com/wiki/1252599548343744/1331429187256353

        // 不变类，String、Integer、BigInteger 等类型都是不变类，一个不变类具有以下特点：
        // 定义class时使用final，无法派生子类；
        // 每个字段使用final，保证创建实例后无法修改任何字段。

        // BigInteger
        // 和long型整数运算比，BigInteger不会有范围限制，但缺点是速度比较慢
        BigInteger bi = new BigInteger("100");
        System.out.println(bi.pow(5));      // 10000000000
        System.out.println(bi.longValue()); // 100
        // 如果BigInteger表示的范围超过了基本类型的范围，转换时将丢失高位信息，即结果不一定是准确的。
        // 如果需要准确地转换成基本类型，可以使用intValueExact()、longValueExact()等方法，在转换时如果超出范围，将直接抛出ArithmeticException异常。
        System.out.println(bi.multiply(bi).longValueExact());   // 10000
        // 加法运算
        BigInteger bi2 = new BigInteger("12345678901234567890");
        System.out.println(bi2.add(bi));    // 12345678901234567990
        try {
            System.out.println(bi2.multiply(bi2).longValueExact());  // BigInteger out of long range
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=======");

        // BigDecimal   没学完，后面再看
        // https://www.liaoxuefeng.com/wiki/1252599548343744/1279768011997217
        BigDecimal bg = new BigDecimal("50.55");
        System.out.println(bg.multiply(bg));        // 2555.3025
        BigDecimal bg2 = new BigDecimal("50");
        BigDecimal bg3 = new BigDecimal("50.00");
        // 用scale()表示小数位数
        System.out.println(bg.multiply(bg).scale());        // 4
        System.out.println(bg.scale());     // 2
        System.out.println(bg2.scale());    // 0
        System.out.println(bg3.scale());    // 2

        // Math 类
        System.out.println(Math.abs(-100)); // 100
        System.out.println(Math.abs(-7.8)); // 7.8
        System.out.println(Math.max(100, 98));  // 100
        System.out.println(Math.min(100, 80));  // 80
        System.out.println(Math.pow(2, 3)); // 8.0
        System.out.println(Math.sqrt(9));   // 3.0
        System.out.println(Math.random());  // 0.7252868739713516
        // 伪随机数
        // 我们创建Random实例时，如果不给定种子，就使用系统当前时间戳作为种子，因此每次运行时，种子不同，得到的伪随机数序列就不同
        Random r = new Random();
        System.out.println(r.nextInt());        // 2071575453,每次都不一样
        System.out.println(r.nextInt(10));  // 5,生成一个[0,10)之间的int
        System.out.println(r.nextLong());       // 8811649292570369305,每次都不一样
        System.out.println(r.nextFloat());      // 0.54335...生成一个[0,1)之间的float
        System.out.println(r.nextDouble());     // 0.3716...生成一个[0,1)之间的double
        // 指定种子相同，伪随机数序列就相同
        r = new Random(30);
        System.out.println(r.nextInt(100));     // 6
        System.out.println(r.nextInt(100));     // 68
        // 真随机数
        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong();  // 获取高强度安全随机数生成器
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom();    // 获取普通的安全随机数生成器
        }
        byte[] bArr = new byte[16];
        sr.nextBytes(bArr);     // 用安全随机数填充buffer
        System.out.println(Arrays.toString(bArr));  // [33, 58, -38, -76, -70, -52, 112, 7, 30, -14, -7, -69, 27, -29, -19, -23]
        System.out.println(sr.nextInt(100)); // 7
    }

    public static void testAnnotationHaHa() {
        // 注解（Annotation）是Java语言用于工具处理的标注
        // 有一些注解可以修饰其他注解，这些注解就称为元注解（meta annotation）
        //      @Target可以定义Annotation能够被应用于源码的哪些位置
        //          类或接口：ElementType.TYPE；
        //          字段：ElementType.FIELD；
        //          方法：ElementType.METHOD；
        //          构造方法：ElementType.CONSTRUCTOR；
        //          方法参数：ElementType.PARAMETER
        //      @Retention定义了Annotation的生命周期
        //          仅编译期：RetentionPolicy.SOURCE；
        //              注解在编译期就被丢掉了
        //              主要由编译器使用，因此我们一般只使用，不编写
        //          仅class文件：RetentionPolicy.CLASS；
        //              注解仅保存在class文件中，它们不会被加载进JVM
        //              主要由底层工具库使用，涉及到class的加载，一般我们很少用到
        //          运行期：RetentionPolicy.RUNTIME
        //              注解会被加载进JVM，并且在运行期可以被程序读取
        //              不但要使用，还经常需要编写
        //      @Repeatable可以定义Annotation是否可重复。应用不是特别广泛。
        //      @Inherited定义子类是否可继承父类定义的Annotation
        // @override 让编译器检查该方法是否正确地实现了覆写

        // testAnnotation/* 的两个文件不知道怎么测试，先不深入看了
    }

    public static void testGenericity() {
        // 泛型就是编写模板代码来适应任意类型。不必对类型进行强制转换，它通过编译器对类型进行检查
        // 泛型的继承关系：可以把ArrayList<Integer>向上转型为List<Integer>（T不能变！），但不能把ArrayList<Integer>向上转型为ArrayList<Number>（T不能变成父类）
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("hello");
        strList.add("louis");
        System.out.println(strList.get(0));     // hello

        List<Number> list = new ArrayList<Number>();
        list.add(Integer.valueOf(33));
        list.add(Float.valueOf(13.44f));
        Number first = list.get(0);
        Number second = list.get(1);
        System.out.println(first + " " + second);   // 33 13.44
        // 可以省略后面的Number，编译器可以自动推断泛型类型：
        List<Number> list2 = new ArrayList<>();
        // 泛型接口
        // String本身已经实现了Comparable<String>接口,可以直接排序
        String[] ss = new String[] {"Orange", "Apple", "Pear"};
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));    // [Apple, Orange, Pear]
        // 自定义一个类实现按name进行排序
        System.out.println("zello".compareTo("bbb"));   // 24
        PersonT[] ps = new PersonT[] {
                new PersonT("bob", 61),
                new PersonT("alice", 88),
                new PersonT("lily", 70)
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));        // [alice,88, bob,61, lily,70]

        // 使用自定义的泛型类
        Pair<String> p2 = new Pair<>("hello", "world");
        String first2 = p2.getFirst();
        String second2 = p2.getSecond();
        System.out.println(first2 + ", " + second2);    // hello, world

        Pair<Integer> p3 = new Pair<>(99, 88);
        Integer first3 = p3.getFirst();
        Integer second3 = p3.getSecond();
        System.out.println(first3 + ", " + second3);    // 99, 88

        // 所有泛型实例，无论T的类型是什么，getClass()返回同一个Class实例，因为编译后它们全部都是Pair<Object>
        Class c1 = p2.getClass();
        Class c2 = p3.getClass();
        System.out.println((c1 == c2) + ", " + (c1 == Pair.class)); // true, true

        // extends 通配符  暂时先忽略，不学

        // super 通配符  暂时先忽略，不学
    }

    public static void testBasicSecond() {
        // xml 与 json
        // ① DOM：一次性读取XML，并在内存中表示为树形结构；
        InputStream input = Main.class.getClassLoader().getResourceAsStream("book.xml");
//        System.out.println(input);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(input);
            printNode(doc, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ② SAX：以流的形式读取XML，使用事件回调。
        InputStream input22 = Main.class.getClassLoader().getResourceAsStream("book.xml");
        SAXParserFactory spf = SAXParserFactory.newInstance();
        try {
            SAXParser saxParserObj = spf.newSAXParser();
            saxParserObj.parse(input22, new MyHandler());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ③ 使用Jackson
        InputStream input33 = Main.class.getClassLoader().getResourceAsStream("book.xml");
        JacksonXmlModule module = new JacksonXmlModule();
        XmlMapper mapper = new XmlMapper(module);
        try {
            Book book = mapper.readValue(input33, Book.class);
            System.out.println(book.id);
            System.out.println(book.name);
            System.out.println(book.author);
            System.out.println(book.isbn);
            System.out.println(book.tags);
            System.out.println(book.pubDate);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // json
        // JSON只允许使用UTF-8编码，不存在编码问题
        // 仅支持以下几种数据类型
        //     键值对：{"key": value}
        //     数组：[1, 2, 3]
        //     字符串："abc"
        //     数值（整数和浮点数）：12.34
        //     布尔值：true或false
        //     空值：null
        InputStream input44 = Main.class.getClassLoader().getResourceAsStream("book.json");
//        ObjectMapper mapper44 = new ObjectMapper();
        // 要把JSON的某些值解析为特定的Java对象，例如LocalDate，需要 JavaTimeModule()
        ObjectMapper mapper44 = new ObjectMapper().registerModule(new JavaTimeModule());
        // 反序列化时忽略不存在的 javabean 属性
        mapper44.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            Book22 book44 = mapper44.readValue(input44, Book22.class);
            System.out.println(book44.id);
            System.out.println(book44.name);
            System.out.println(book44.author);
            System.out.println(book44.isbn);
            System.out.println(book44.tags);
            System.out.println(book44.pubDate);
            // 序列化为JSON
            String json = mapper44.writeValueAsString(book44);  // {"id":1,"name":"Java核心技术","author":"Cay S. Horstmann","isbn":9787111547426,"tags":["Java","Network"],"pubDate":[2016,9,1],"price":119.5}
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 日期与时间
        // Java有两套日期和时间的API：
        //    旧的 Date、Calendar、TimeZone、SimpleDateFormat
        //    新的 LocalDateTime、ZonedDateTime、ZoneId、DateTimeFormatter
        // date
        // 获取当前时间
        Date date = new Date();
        System.out.println(date.getYear() + 1900);  // 2022
        System.out.println(date.getMonth() + 1);    // 6
        System.out.println(date.getDate());         // 16
        // 转换为String
        System.out.println(date.toString());        // Thu Jun 16 21:32:05 CST 2022
        // 转换为GMT时区
        System.out.println(date.toGMTString());     // 16 Jun 2022 13:32:05 GMT
        // 转换为本地时区
        System.out.println(date.toLocaleString());  // 2022年6月16日下午9:32:05
        var sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));       // 2022-06-16 21:32:05
        // Calendar和Date比，主要多了一个可以做简单的日期和时间运算的功能
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        int m = 1 + c.get(Calendar.MONTH);
        int d = c.get(Calendar.DAY_OF_MONTH);
        int w = c.get(Calendar.DAY_OF_WEEK);    // 1~7分别表示周日，周一，……，周六
        int hh = c.get(Calendar.HOUR_OF_DAY);
        int mm = c.get(Calendar.MINUTE);
        int ss = c.get(Calendar.SECOND);
        int ms = c.get(Calendar.MILLISECOND);
        System.out.println(c.getTime());    // Thu Jun 16 21:32:05 CST 2022
        System.out.println(y + "-" + m + "-" + d + " " + w + " " + hh + ":" + mm + ":" + ss + "." + ms);    // 2022-6-16 5 21:32:5.734
        c.set(Calendar.YEAR, 2020);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));  // 2020-06-16 21:32:05
        // 清除所有:
        c.clear();
        c.set(Calendar.YEAR, 2019);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));    // 2019-01-01 00:00:00
        // TimeZone 时区
        TimeZone tzDefault = TimeZone.getDefault();
        TimeZone tzGMT7  = TimeZone.getTimeZone("GMT+07:00");
        System.out.println(tzDefault); // sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null]
        System.out.println(tzGMT7);    // sun.util.calendar.ZoneInfo[id="GMT+07:00",offset=25200000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]
        c.clear();
        // 设置年月日时分秒
        c.set(2019, 10, 20, 1, 15, 0);
        var sdf22 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf22.setTimeZone(TimeZone.getTimeZone("GMT+11:00"));
        System.out.println(sdf22.format(c.getTime()));  // 2019-11-20 04:15:00

        // LocalDateTime
        // 当前日期
        LocalDate d2 = LocalDate.now();
        // 当前时间
        LocalTime t2 = LocalTime.now();
        // 当前日期和时间
        LocalDateTime ldt2 = LocalDateTime.now();
        System.out.println(d2 + " ==== " + t2 + " ==== " + ldt2);   // 2022-06-16 ==== 21:32:05.740769 ==== 2022-06-16T21:32:05.740786
        // 指定日期和时间
        LocalDate d3 = LocalDate.of(2019, 11, 30);
        LocalTime t3 = LocalTime.of(15, 16, 17);
        LocalDateTime ldt3 = LocalDateTime.of(2019, 11, 30, 15, 16, 17);
        System.out.println(d3 + " ==== " + t3 + " ==== " + ldt3);   // 2019-11-30 ==== 15:16:17 ==== 2019-11-30T15:16:17
        // 解析日期
        LocalDateTime ldt4 = LocalDateTime.parse("2019-11-19T15:16:17");
        LocalDate d4 = LocalDate.parse("2019-11-19");
        LocalTime t4 = LocalTime.parse("15:16:17");
        System.out.println(ldt4 + " ==== " + d4 + " ==== " + t4);   // 2019-11-19T15:16:17 ==== 2019-11-19 ==== 15:16:17

        // DateTimeFormatter
        DateTimeFormatter dft5 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dft5.format(LocalDateTime.now()));   // 2022/06/16 21:32:05
        LocalDateTime ldt5 = LocalDateTime.parse("2019/11/29 13:12:11", dft5);
        System.out.println(ldt5);   // 2019-11-29T13:12:11
        // 日期加减
        LocalDateTime ldt6 = LocalDateTime.of(2019, 10, 26, 20, 30, 59);
        LocalDateTime ldt611 = ldt6.plusDays(6).minusHours(3);
        System.out.println(ldt611); // 2019-11-01T17:30:59
        LocalDateTime ldt622 = ldt6.minusMonths(1);
        System.out.println(ldt622); // 2019-09-26T20:30:59
        // 重置日期
        //     调整年：withYear()
        //     调整月：withMonth()
        //     调整日：withDayOfMonth()
        //     调整时：withHour()
        //     调整分：withMinute()
        //     调整秒：withSecond()
        LocalDateTime ldt7 = LocalDateTime.of(2019, 10, 26, 20, 30, 59);
        LocalDateTime ldt711 = ldt7.withDayOfMonth(31);
        System.out.println(ldt711); // 2019-10-31T20:30:59
        // 本月第一天0:00
        LocalDateTime firstDay = LocalDate.now().withDayOfMonth(1).atStartOfDay();
        System.out.println(firstDay);   // 2022-06-01T00:00
        // 本月最后1天
        LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDay);    // 2022-06-30
        // 下月第1天
        LocalDate nextMonthFristDay = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(nextMonthFristDay);  // 2022-07-01
        // 本月第1个周一
        LocalDate firstWeekday = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstWeekday);   // 2022-06-06

        // 日期比较
        LocalDateTime target = LocalDateTime.of(2019, 11, 19, 8, 15, 0);
        System.out.println(LocalDateTime.now().isBefore(target));   // false
        System.out.println(LocalDateTime.now().isAfter(target));    // true

        // 时区计算 ZonedDateTime
        // 简单地把ZonedDateTime理解成LocalDateTime加ZoneId
        // 默认时区
        ZonedDateTime zbj = ZonedDateTime.now();
        // 用指定时区获取当前时间
        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zbj + " " + zny);    // 2022-06-16T21:32:05.743941+08:00[Asia/Shanghai] 2022-06-16T09:32:05.744843-04:00[America/New_York]

        LocalDateTime ldt = LocalDateTime.of(2019, 9, 15, 15, 16, 17);
        ZonedDateTime zbj22 = ldt.atZone(ZoneId.systemDefault());
        ZonedDateTime zny22 = ldt.atZone(ZoneId.of("America/New_York"));
        System.out.println(zbj22 + " " + zny22); // 2019-09-15T15:16:17+08:00[Asia/Shanghai] 2019-09-15T15:16:17-04:00[America/New_York]

        // Instant 获取时间戳
        Instant now = Instant.now();
        // 秒
        System.out.println(now.getEpochSecond());   // 1655386325
        // 到毫秒
        System.out.println(now.toEpochMilli());     // 1655386325745
        // 时间戳转换时区时间
        Instant ins = Instant.ofEpochSecond(1654401791);
        ZonedDateTime zdt3 = ins.atZone(ZoneId.systemDefault());
        System.out.println(zdt3);       // 2022-06-05T12:03:11+08:00[Asia/Shanghai]


        // 函数式编程
        // Stream
        // 创建 stream
        System.out.println("创建 stream");
        Stream<String> stream11 = Stream.of("A", "B", "C", "D");
        Stream<String> stream22 = Arrays.stream(new String[] {"A", "B", "C"});
        Stream<String> stream33 = List.of("X", "Y", "Z").stream();
        stream11.forEach(System.out::print);    // ABCD
        stream22.forEach(System.out::print);    // ABC
        stream33.forEach(System.out::print);    // XYZ

        System.out.println();
        Stream<Integer> natural = Stream.generate(new NaturalSupplier());
        natural.limit(20).forEach(System.out::print);   // 1234567891011121314151617181920

        System.out.println();
        Pattern p = Pattern.compile("\\s+");
        Stream<String> s = p.splitAsStream("His hair had a natural curl");
        s.forEach(System.out::print);   // Hishairhadanaturalcurl

        System.out.println();
        IntStream is = Arrays.stream(new int[] {1, 2, 3});
        LongStream ls = List.of("1", "3", "5").stream().mapToLong(Long::parseLong);
        is.forEach(System.out::print);  // 123
        ls.forEach(System.out::print);  // 135

        // map
        System.out.println();
        System.out.println("map");
        List.of(" Apple ", " pEar", " orAnge ", "  bAnana   ").stream().map(String::trim).map(String::toLowerCase).forEach(System.out::print);  // applepearorangebanana

        // filter
        System.out.println();
        System.out.println("filter");
        Stream.generate(new LocalDateSupplier()).limit(31)
                .filter(ldt22 -> ldt22.getDayOfWeek() == DayOfWeek.SATURDAY || ldt22.getDayOfWeek() == DayOfWeek.SUNDAY)
                .forEach(System.out::print); // 2022-06-04 2022-06-05 2022-06-11 2022-06-12 2022-06-18 2022-06-19 2022-06-25 2022-06-26 2022-07-02

        // reduce
        System.out.println();
        System.out.println("reduce");
        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8).reduce(0, (acc, n) -> acc + n); // 36
        System.out.println(sum);
        // 按行读取文件
        List<String> props = List.of("profile=native", "debug=true", "logging=warn", "interval=500");
        Map<String, String> map110 = props.stream().map(kv -> {
            String[] ss110 = kv.split("\\=", 2);
            return Map.of(ss110[0], ss110[1]);
        }).reduce(new HashMap<String, String>(), (m110, kv) -> {
            m110.putAll(kv);
            return m110;
        });
        map110.forEach((k, v) -> {
            System.out.println(k + " = " + v); // logging = warn  interval = 500  debug = true  profile = native
        });

        // 输出集合
        System.out.println();
        System.out.println("输出集合");
        // 输出为List
        Stream<String> stream44 = Stream.of("Apple", "", null, "Pear", "  ", "Orange");
        List<String> list44 = stream44.filter(s44 -> s44 != null && !s44.isBlank()).collect(Collectors.toList());
        System.out.println(list44);     // [Apple, Pear, Orange]
        // 输出为数组
        List<String> list55 = List.of("Apple", "Banana", "Orange");
        String[] array55 = list55.stream().toArray(String[]::new);
        for(String arr:array55) {
            System.out.println(arr);    // Apple  Banana  Orange
        }
        // 输出为Map
        Stream<String> stream66 = Stream.of("appL:apple", "msft1:microsoft");
        Map<String, String> map66 = stream66.collect(Collectors.toMap(
                s6 -> s6.substring(0, s6.indexOf(":")), s6 -> s6.substring(s6.indexOf(":")+1)
        ));
        System.out.println(map66);  // {appL=apple, msft1=microsoft}
        // 分组输出
        List<String> list77 = List.of("Apple", "Banana", "Blackberry", "Coconut", "Avocado", "Cherry", "Apricots");
        Map<String, List<String>> groups = list77.stream().collect(Collectors.groupingBy(
                s77 -> s77.substring(0, 1), Collectors.toList()
        ));
        System.out.println(groups); // {A=[Apple, Avocado, Apricots], B=[Banana, Blackberry], C=[Coconut, Cherry]}

        // 其它操作
        System.out.println();
        System.out.println("综合");
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 1; i < 1000; i++) {
            l.add(i);
        }
        Stream<Integer> naturals = l.stream().filter(n -> n % 2 == 0).map(n -> n - 1).limit(10);
        naturals.forEach(System.out::print);    // 1 3 5 7 9 11 13 15 17 19
        // 排序
        List<String> list88 = List.of("Orange", "apple", "Banana").stream().sorted().collect(Collectors.toList());
        System.out.println(list88); // [Banana, Orange, apple]
        // 去重
        List<String> list99 = List.of("A", "B", "A", "C", "B", "D").stream().distinct().collect(Collectors.toList());
        System.out.println(list99); // [A, B, C, D]
        // 截取
        List<String> list100 = List.of("A", "B", "C", "D", "E", "F").stream().skip(2).limit(3).collect(Collectors.toList());
        System.out.println(list100); // [C, D, E]
        // 合并
        Stream<String> s110 = List.of("A", "B", "C").stream();
        Stream<String> s111 = List.of("A", "Y", "X").stream();
        Stream<String> s112 = Stream.concat(s110, s111);
        System.out.println(s112.collect(Collectors.toList()));  // [A, B, C, A, Y, X]
        // flatMap
        Stream<List<Integer>> s120 = Stream.of(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        Stream<Integer> i120 = s120.flatMap(list -> list.stream());
        i120.forEach(System.out::print);    // 123456789
        System.out.println();
        // 转换操作：map()，filter()，sorted()，distinct()；
        // 合并操作：concat()，flatMap()；
        // 并行处理：parallel()；
        // 聚合操作：reduce()，collect()，count()，max()，min()，sum()，average()；
        // 其他操作：allMatch(), anyMatch(), forEach()


        // IO   File 对象， InputStream， 读取 classpath， Reader， 使用Files
        // IO流以byte（字节）为最小单位，因此也称为字节流
        // InputStream代表输入字节流，OuputStream代表输出字节流，这是最基本的两种IO流
        // 按照char来读写显然更方便，这种流称为字符流
        // Reader和Writer表示字符流，字符流传输的最小数据单位是char
        //     究竟使用Reader还是InputStream，要取决于具体的使用场景。如果数据源不是文本，就只能使用InputStream，如果数据源是文本，使用Reader更方便一些。
        //     Reader和Writer本质上是一个能自动编解码的InputStream和OutputStream

        System.out.println();
        System.out.println("IO");
        System.out.println(File.separator);     // /
        // Windows平台。  假设当前目录是C:\Docs
        // .表示当前目录，  ..表示上级目录
        File f1 = new File("sub\\javac");   // 绝对路径是C:\Docs\sub\javac
        File f2 = new File(".\\sub\\javac"); // 绝对路径是C:\Docs\sub\javac
        File f3 = new File("..\\sub\\javac"); // 绝对路径是C:\sub\javac
        try {
            File f4 = new File("..");
            System.out.println(f4.getPath());   // ..
            System.out.println(f4.getAbsolutePath());  //  /Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/..
            System.out.println(f4.getCanonicalPath()); //  /Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java
        } catch (IOException e) {
            e.printStackTrace();
        }
        File f5 = new File("/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java");
        File f6 = new File("/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/pom.xml");
        System.out.println(f5.isFile());    // false
        System.out.println(f5.isDirectory());   // true
        System.out.println(f6.isFile());    // true
        System.out.println(f6.isDirectory());   // false
        // boolean canRead()：是否可读；
        // boolean canWrite()：是否可写；
        // boolean canExecute()：是否可执行；
        // long length()：文件字节大小

        File f7 = new File("/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/mmm.txt");
        try {
            // 创建、删除文件
            if (f7.createNewFile()) {
                System.out.println("创建文件成功");   // 创建文件成功
                if (f7.delete()) {
                    System.out.println("删除文件成功");   // 删除文件成功
                }
            }
            // 创建临时文件
            File f8 = File.createTempFile("tmp-", ".txt");
            f8.deleteOnExit(); // JVM退出时自动删除
            System.out.println(f8.isFile());        // true
            System.out.println(f8.getAbsolutePath());   // /var/folders/c1/rwz_lt052_bgfn7zx4yr14q40000gn/T/tmp-14969864616872664021.txt
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 遍历文件和目录
        File f9 = new File("/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy");
        File[] fs1 = f9.listFiles();
        printFiles(fs1);
        //  /Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/testFiles
        //  /Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/mvnw.cmd
        //  /Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/config
        //  /Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/target
        File[] fs2 = f9.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".xml");
            }
        });
        printFiles(fs2);   //  /Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/pom.xml
        // boolean mkdir()：创建当前File对象表示的目录；
        // boolean mkdirs()：创建当前File对象表示的目录，并在必要时将不存在的父目录也创建出来；
        // boolean delete()：删除当前File对象表示的目录，当前目录必须为空才能删除成功。

        // InputStream
        // 写法一
        InputStream input10 = null;
        try {
            input10 = new FileInputStream("testFiles/ttt.txt");
            for(;;) {
                int n = input10.read();
                // 反复调用read()方法，直到返回-1
                if (n == -1) {
                    break;
                }
                // 输出的是 ascii 码值
                // 打印byte的值
//                System.out.println(n);
            }
            input10.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 写法二
        // try(resource)的语法，只需要编写try语句，让编译器自动为我们关闭资源。
        try (InputStream input11 = new FileInputStream("testFiles/ttt.txt")) {
            int n;
            while ((n = input11.read()) != -1) {
                // 输出的是 ascii 码值
                System.out.println(n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 利用缓冲区一次读取多个字节
        try (InputStream input12 = new FileInputStream("testFiles/ttt22.txt")) {
            byte[] buffer = new byte[1000];
            int n;
            while ((n = input12.read(buffer)) != -1) {
                System.out.println("read " + n + " bytes....");
                // read 1000 bytes....
                // read 1000 bytes....
                // read 483 bytes....
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String s13;
        try (InputStream input13 = new FileInputStream("testFiles/ttt22.txt")) {
            int n;
            StringBuilder sb13 = new StringBuilder();
            while ((n = input13.read()) != -1) {
                sb13.append((char) n);
            }
            s13 = sb13.toString();
            System.out.println(s13);    // 输入 txt 内容，但是中文是乱码 ？？？
        } catch (IOException e) {
            e.printStackTrace();
        }

        // FileOutputStream
        try {
            OutputStream output11 = new FileOutputStream("testFiles/ttt33.txt");
            output11.write(72);  // h
            output11.write(101); // e
            output11.write(108); // l
            output11.write(108); // l
            output11.write(111); // o
            output11.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 一次性写入多个字节
        try (OutputStream output12 = new FileOutputStream("testFiles/ttt44.txt")) {
            output12.write("Hello121212".getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reader
        // InputStream是一个字节流，即以byte为单位读取，而Reader是一个字符流，即以char为单位读取
        try (Reader reader = new FileReader("testFiles/ttt22.txt", StandardCharsets.UTF_8)) {
            for (;;) {
                int n = reader.read();
                if (n == -1) {
                    break;
                }
                System.out.print((char)n);  // 输出 txt 内容，无中文乱码
            }
//            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 一次性读取若干字符
        try (Reader reader = new FileReader("testFiles/ttt22.txt", StandardCharsets.UTF_8)) {
            char[] buffer = new char[500];
            int n;
            while ((n = reader.read(buffer)) != -1) {
                System.out.println("read " + n + " chars.");
                // read 500 chars.
                // read 500 chars.
                // read 175 chars.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writer
        try (Writer writer = new FileWriter("testFiles/ttt55.txt", StandardCharsets.UTF_8)) {
            writer.write("H");
            writer.write("Job".toCharArray()); // 写入char[]
            writer.write(" candidate=");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 使用Files
        // 注意：Files提供的读写方法，受内存限制，只能读写小文件，例如配置文件等，不可一次读入几个G的大文件。
        // 读写大型文件仍然要使用文件流，每次只读写一部分文件内容
        try {
            // 读
            byte[] data13 = Files.readAllBytes(Path.of("testFiles/ttt66.txt"));
            System.out.println(data13[0]); // ASCII码 116
            System.out.println("-----------");
            String content13 = Files.readString(Path.of("testFiles/ttt66.txt"), StandardCharsets.UTF_8);
            System.out.println(content13); // 输入全部 txt 内容，没有中文乱码
            System.out.println("-----------");
            List<String> lines = Files.readAllLines(Path.of("testFiles/ttt66.txt"));
            System.out.println(lines.get(0)); // 输入 txt 内容的第一行
            System.out.println("-----------");
            // 写
            byte[] data14 = {56, 57, 98};
            Files.write(Path.of("testFiles/ttt77_1.txt"), data14);  // 将 ASCII 码转换为字符
            Files.writeString(Path.of("testFiles/ttt77_2.txt"), "文档内容 lalaa", StandardCharsets.UTF_8);
            List<String> lines14 = List.of("咯咯咯咯", "upset");    // 输入中英文，无乱码
            Files.write(Path.of("testFiles/ttt77_3.txt"), lines14);     // 输入中英文，无乱码
        } catch (IOException e) {
            e.printStackTrace();
        }


        // 正则表达式    文档整理会多一些
        // 基础匹配
        String regex11 = "20\\d\\d";
        System.out.println("2019".matches(regex11) + " " + "2100".matches(regex11));  // true false
        String regex22 = "abc";
        System.out.println("abc".matches(regex22) + " " + "Abc".matches(regex22) + " " + "abcd".matches(regex22));  // true false false

        // 对应的正则是a\&c
        String regex33 = "a\\&c";
        System.out.println("a&c".matches(regex33) + " " + "a-c".matches(regex33) + " " + "a&&c".matches(regex33)); // true false false
        String regex44 = "java\\d";
        System.out.println("java9".matches(regex44) + " " + "java10".matches(regex44) + " " + "javac".matches(regex44)); // true false false
        String regex55 = "java\\D";
        System.out.println("javax".matches(regex55) + " " + "java#".matches(regex55) + " " + "java5".matches(regex55)); // true true false

        // 复杂匹配
        String regex66 = "java|php";
        System.out.println("java".matches(regex66) + " " + "php".matches(regex66) + " " + "go".matches(regex66));  // true true false
        String regex77 = "learn\\s(java|php|go)";
        System.out.println("learn java".matches(regex77) + " " + "learn php".matches(regex77) + " " + "learn Java".matches(regex77));  // true true false

        // 分组匹配
        Pattern pat11 = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        Matcher mat11 = pat11.matcher("010-12345678");
        if (mat11.matches()) {
            String g0 = mat11.group(0);
            String g1 = mat11.group(1);
            String g2 = mat11.group(2);
            System.out.println(g0 + " | " + g1 + " | " + g2);   // 010-12345678 | 010 | 12345678
        } else {
            System.out.println("匹配失败");
        }
        Matcher mat11_22 = pat11.matcher("021-123456");
        System.out.println(mat11_22.matches());  // false
        Matcher mat11_33 = pat11.matcher("022#1234567");
        System.out.println(mat11_33.matches());  // false

        // 非贪婪匹配
        Pattern pat22 = Pattern.compile("(\\d+)(0*)");
        Matcher mat22 = pat22.matcher("1230000");
        if (mat22.matches()) {
            System.out.println("group1=" + mat22.group(1));     // group1=1230000
            System.out.println("group2=" + mat22.group(2));     // group2=
        }
        Pattern pat33 = Pattern.compile("(\\d+?)(0*)");
        Matcher mat33 = pat33.matcher("1230000");
        if (mat33.matches()) {
            System.out.println("group1=" + mat33.group(1));     // group1=123
            System.out.println("group2=" + mat33.group(2));     // group2=0000
        }

        // 搜索和替换
        // 分割字符串
        String[] arr44 = "a b c".split("\\s");
        for(String val44:arr44) {
            System.out.println("arr44: " + val44);
            // arr44: a
            // arr44: b
            // arr44: c
        }
        String[] arr55 = "a b  c".split("\\s");
        for(String val55:arr55) {
            System.out.println("arr55: " + val55);
            // arr55: a
            // arr55: b
            // arr55:
            // arr55: c
        }
        String[] arr66 = "a, b ;; c".split("[\\,\\;\\s]+");
        for(String val66:arr66) {
            System.out.println("arr66: " + val66);
            // arr66: a
            // arr66: b
            // arr66: c
        }
        // 搜索字符串
        String str77 = "the quick brown fox jumps over the lazy dog.";
        Pattern pat77 = Pattern.compile("\\wo\\w");
        Matcher mat77 = pat77.matcher(str77);
        while(mat77.find()) {
            String sub = str77.substring(mat77.start(), mat77.end());
            System.out.println(mat77.start() + " " + mat77.end() + " " + sub);
            // 11 14 row
            // 16 19 fox
            // 40 43 dog
        }
        // 替换字符串
        String str88 = "The     quick\\t\\t     brown   fox  jumps   over the  lazy dog.";
        String r88 = str88.replaceAll("\\s+", " ");
        System.out.println(r88);  // The quick\t\t brown fox jumps over the lazy dog.
        // 反向引用
        String str99 = "the quick brown fox jumps over the lazy dog.";
        String r99 = str99.replaceAll("\\s([a-z]{4})\\s", " <b>$1</b> ");
        System.out.println(r99);  // the quick brown fox jumps <b>over</b> the <b>lazy</b> dog.


        // Maven基础      文档整理会多一些
        // Maven使用groupId，artifactId和version唯一定位一个依赖





    }

    // 这是一个递归
    static void printNode(Node n, int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print(" ");
        }
        switch (n.getNodeType()) {
            case Node.DOCUMENT_NODE:    // Document节点
                System.out.println(indent + " Document: " + n.getNodeName());
                break;
            case Node.ELEMENT_NODE:     // 元素节点
                System.out.println(indent + " Element: " + n.getNodeName());
                break;
            case Node.TEXT_NODE:    // 文本
                System.out.println(indent + " Text: " + n.getNodeName() + " = " + n.getNodeValue());
                break;
            case Node.ATTRIBUTE_NODE:   // 属性
                System.out.println(indent + " Attribute: " + n.getNodeName() + " = " + n.getNodeValue());
                break;
            case Node.CDATA_SECTION_NODE:
                System.out.println(indent + " CDATA: " + n.getNodeName() + " = " + n.getNodeValue());
                break;
            case Node.COMMENT_NODE:
                System.out.println(indent + " Comment: " + n.getNodeName() + " = " + n.getNodeValue());
                break;
            default:
                System.out.println(indent + " NodeType: " + n.getNodeType() + ", NodeValue: " + n.getNodeValue());
        }
        for (Node child = n.getFirstChild(); child != null; child = child.getNextSibling()) {
            printNode(child, indent + 1);
        }
    }

    static void printFiles(File[] files) {
        System.out.println("================");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("================");
    }

    public static void testBasicThird() {
        // 反射是为了解决在运行期，对某个实例一无所知的情况下，如何调用其方法。
        // 通过Class实例获取class信息的方法称为反射（Reflection）

        System.out.println(OffsetDateTime.of(LocalDate.of(2022, 7, 1),
                LocalTime.of(23, 59, 59, 900000000),
                ZoneOffset.ofHours(8)));        // 2022-07-01T23:59:59.900+08:00

        // lambda 表达式
        ZzzzApplication tester = new ZzzzApplication();
        // ① 类型声明
        MathOperation addition = (int a, int b) -> a + b;
        // ② 无类型声明
        MathOperation subtraction = (a, b) -> a - b;
        // ③ 用括号返回语句
        MathOperation multiplication = (int a, int b) -> {return a * b;};
        System.out.println("a+b= " + tester.operate(10, 5, addition));  // a+b= 15
        System.out.println("a-b= " + tester.operate(10, 5, subtraction));   // a-b= 5
        System.out.println("a*b= " + tester.operate(10, 5, multiplication));    // a*b= 50
        // ④ 不用括号
        GreetingService gs1 = message -> System.out.println("hello " + message);
        gs1.sayMessage("baidu");    // hello baidu

        // lambda 变量作用域
        // 引用标记了 final 的外层局部变量
        GreetingService gs2 = message -> System.out.println("people " + salutation + message);
        gs2.sayMessage(" louis");  // people that's the truth louis

        // lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有 final 的语义）
        // 在 Lambda 表达式当中不允许声明一个与局部变量同名的参数或者局部变量
        final int num = 1;
        int num22 = 2;
        Converter<Integer, String> conRes = (param) -> System.out.println(String.valueOf(param + num + num22));
        conRes.convert(2);  // 5

        // Arrays.copyOf 方法      把一个数组的区间值完全赋给另一个数组， 区间的开始和结束位置遵循 左闭右开原则
        int a[] = {4, 3, 6, 5, 1, 2};
        int b[] = Arrays.copyOf(a, 4);
        int c[] = Arrays.copyOfRange(a, 2, 5);
        System.out.println(Arrays.toString(b));     // [4, 3, 6, 5]
        System.out.println(Arrays.toString(c));     // [6, 5, 1]

        // 多线程
        // 创建新线程
        // 最简单的多线程。这个线程启动后实际上什么也不做就立刻结束了
        Thread t = new Thread();
        t.start();
        // ① 从Thread派生一个自定义类
        Thread t2 = new MyThread22();
        t2.start();     // start second new thread
        // 注意：直接调用 run 方法不会启动新线程
        t2.run();       // start second new thread
        // ② 创建Thread实例时，传入一个Runnable实例
        Thread t3 = new Thread(new MyRunnable());
        t3.start();     // start third new thread
        // ③ 用 lambda 语法进一步简化
        Thread t4 = new Thread(() -> {
            System.out.println("start fourth new thread");
        });
        t4.start();     // start fourth new thread

        // 线程的状态
        //   New：新创建的线程，尚未执行；
        //   Runnable：运行中的线程，正在执行run()方法的Java代码；
        //   Blocked：运行中的线程，因为某些操作被阻塞而挂起；
        //   Waiting：运行中的线程，因为某些操作在等待中；
        //   Timed Waiting：运行中的线程，因为执行sleep()方法正在计时等待；
        //   Terminated：线程已终止，因为run()方法执行完毕。
        //  new -> Runnable、Blocked、Waiting、Timed Waiting 线程在四种状态间来回切换 -> Terminated

        // 通过t.join()等待t线程结束后再继续运行
        Thread t5 = new Thread(() -> {
            System.out.println("hello join");
        });
        t5.start();     // hello join
        try {
            t5.join();
        } catch (InterruptedException e) {}
        System.out.println("55 main end");  // 55 main end

        // 中断线程
        // 最常见的功能就是下载，用户下载了一个 10G 的文件，网络太慢，用户等得不耐烦，下载过程中点 取消 按钮
        Thread t6 = new MyThread66();
        t6.start();
        // 1 Thread66
        // 2 Thread66
        // ...
        // 117 Thread66
        try {
            Thread.sleep(1);    // 暂停1毫秒
            t6.interrupt();     // 中断t6线程
            t6.join();      // 等待t6线程结束
        } catch (InterruptedException e) {}
        System.out.println("66 main end");  // 66 main end

        // interrupt 终止 join 的等待
        Thread t7 = new MyThread77();
        t7.start();
        try {
            Thread.sleep(1000);
            t7.interrupt();
            t7.join();
        } catch (InterruptedException e) {}
        System.out.println("77 main end");  // 77 main end

        // 线程间共享变量需要使用volatile关键字
        // volatile关键字的目的是告诉虚拟机：
        //      每次访问变量时，总是获取主内存的最新值；
        //      每次修改变量后，立刻回写到主内存。
        HelloThread88 t8 = new HelloThread88();
        t8.start();
        // 1 HelloThread88
        // 2 HelloThread88
        // ...
        // 129 HelloThread88
        // HelloThread88 end
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {}
        t8.running = false;

        // 守护线程(Daemon Thread)
        Thread t9 = new TimerThread();
        t9.setDaemon(true);
//        t9.start();
        // 守护进程：11:16:47.479045
        // 守护进程：11:16:48.483682
        // ...

        // 线程同步
        // 例子一，没有 synchronized
        var add10 = new AddThread10();
        var dec10 = new DecThread10();
        try {
            add10.start();
            dec10.start();
            add10.join();
            dec10.join();
        } catch (InterruptedException e) {}
        System.out.println(Counter.count);  // -7528 每次打印的数字都不是 0，因为加减过程中读取count变量存在脏读

        // 例子二，有 synchronized
        Counter.count = 0;
        var add11 = new AddThread11();
        var dec11 = new DecThread11();
        try {
            add11.start();
            dec11.start();
            add11.join();
            dec11.join();
        } catch (InterruptedException e) {}
        System.out.println(Counter.count);   // 0

        // 同步方法
        var counter12_AA = new Counter12();
        var counter12_BB = new Counter12();
        Thread t12_add = new Thread(() -> {
            int tmp1 = 1;
            while (tmp1 <= 2000) {
                tmp1++;
                counter12_AA.add12(2);
                counter12_BB.add12(4);
            }
        });
        Thread t12_dec = new Thread(() -> {
            int tmp2 = 1;
            while (tmp2 <= 2000) {
                tmp2++;
                counter12_AA.dec12(1);
                counter12_BB.dec12(2);
            }
        });
        try {
            t12_add.start();
            t12_add.join();
            t12_dec.start();
            t12_dec.join();
        } catch (InterruptedException e) {}
        System.out.println(counter12_AA.get());     // 2000
        System.out.println(counter12_BB.get());     // 4000

        // 使用wait和notify
        // synchronized解决了多线程竞争的问题，使用wait和notify 解决多线程协调的问题
        // 下面的例子，创建一个线程把10条数据放入 队列，创建 5 个消费线程，用来消费队列。 等待 100 毫秒，中断这 5 个消费线程
        var q13 = new TaskQueue13();
        var arrT13 = new ArrayList<Thread>();
        for (int i = 0; i < 5; i++) {
            var t13 = new Thread() {
                public void run() {
                    // 执行 task
                    while(true) {
                        try {
                            String doS13 = q13.doTask();
                            System.out.println("execute task: " + doS13);
                        } catch (InterruptedException e) {
                            return ;
                        }
                    }
                }
            };
            t13.start();    // execute task: t13-0.5130567154490466
            arrT13.add(t13);
        }
        var add13 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                // 放入 task
                String addS13 = "t13-" + Math.random();
                System.out.println("add task: " + addS13);
                q13.addTask(addS13);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}
            }
        });
        add13.start();  // add task: t13-0.5130567154490466
        try {
            add13.join();
            Thread.sleep(100);
        } catch (InterruptedException e) {}
        for (var tmp13:arrT13) {
            tmp13.interrupt();
        }

        // 使用ReentrantLock
        // synchronized关键字用于加锁，但这种锁一是很重，二是获取时必须一直等待，没有额外的尝试机制，不需要考虑异常
        // ReentrantLock是Java代码实现的锁，必须先获取锁，然后在finally中正确释放锁，ReentrantLock可以尝试获取锁，synchronized不行
        // 使用ReentrantLock比直接使用synchronized更安全，可以替代synchronized进行线程同步

        // 使用Condition
        // 使用Condition对象来实现wait和notify的功能
        // 例子同上面的 t13
        System.out.println("==========");
        var q14 = new TaskQueue14();
        var arrT14 = new ArrayList<Thread>();
        for (int i = 0; i < 5; i++) {
            var t14 = new Thread() {
                public void run() {
                    // 执行 task
                    while(true) {
                        String doS14 = q14.doTask();
                        System.out.println("execute task: " + doS14);
                    }
                }
            };
            t14.start();    // execute task: t14-0.41502147849420756
            arrT14.add(t14);
        }
        var add14 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                // 放入 task
                String addS14 = "t14-" + Math.random();
                System.out.println("add task: " + addS14);
                q14.addTask(addS14);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}
            }
        });
        add14.start();  // add task: t14-0.41502147849420756
        try {
            add14.join();
            Thread.sleep(100);
        } catch (InterruptedException e) {}
        for (var tmp14:arrT14) {
            tmp14.interrupt();
        }

        // 使用ReadWriteLock
        // 解决一些特殊场景: 解决多线程同时读，但只有一个线程能写的问题
        //          只允许一个线程写入（其他线程既不能写入也不能读取）；
        //          没有写入时，多个线程允许同时读（提高性能）
        //          适合读多写少的场景
        //  一个论坛的帖子，回复可以看做写入操作，它是不频繁的，但是，浏览可以看做读取操作，是非常频繁的，这种情况就可以使用ReadWriteLock。
        //  它有个潜在的问题：如果有线程正在读，写线程需要等待读线程释放锁后才能获取写锁，即读的过程中不允许写，这是一种悲观的读锁。

        // 使用StampedLock
        // 乐观锁的意思就是乐观地估计读的过程中大概率不会有写入，因此被称为乐观锁。乐观锁的并发效率更高，但一旦有小概率的写入导致读取的数据不一致，需要能检测出来，再读一遍就行。
        // 悲观锁则是读的过程中拒绝有写入，也就是写入必须等待。

        // 使用Concurrent
        // 并发集合类，大大简化多线程编程
        // ReentrantLock和Condition实现了一个BlockingQueue
        //      interface	non-thread-safe	                thread-safe
        //      List	    ArrayList	                    CopyOnWriteArrayList
        //      Map	        HashMap	                        ConcurrentHashMap
        //      Set	        HashSet / TreeSet	            CopyOnWriteArraySet
        //      Queue	    ArrayDeque / LinkedList	        ArrayBlockingQueue / LinkedBlockingQueue
        //      Deque	    ArrayDeque / LinkedList	        LinkedBlockingDeque

        // 使用Atomic
        // 提供了一组原子操作的封装类

        // 使用线程池
        //   线程池内部维护了若干个线程，没有任务的时候，这些线程都处于等待状态。如果有新任务，就分配一个空闲线程执行。
        //   如果所有线程都处于忙碌状态，新任务要么放入队列等待，要么增加一个新线程进行处理。
        // 创建一个固定大小的线程池
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++) {
            es.submit(new Task15(" " + i));
            // start task15  1
            // start task15  0
            // start task15  2
            // end task15  2
            // end task15  1
            // end task15  0
            // ...
        }
        // 关闭线程池
        es.shutdown();

        // 使用Future
        // ExecutorService.submit()方法，会返回一个Future类型，Future类型代表一个未来能获取结果的对象：

        // 使用CompletableFuture
        // Future获得异步执行结果时，要么调用阻塞方法get()，要么轮询看isDone()是否为true，这两种方法都不是很好，因为主线程也会被迫等待。
        // CompletableFuture 针对Future做了改进，可以传入回调对象，当异步任务完成或者发生异常时，自动调用回调对象的回调方法。
        // 创建异步执行任务:
        CompletableFuture<Double> cf16 = CompletableFuture.supplyAsync(ZzzzApplication::fetchPrice16);
        // 如果执行成功:
        cf16.thenAccept((result) -> {
            System.out.println("price16: " + result);   // price16: 17.597618167576652
        });
        // 如果执行异常:
        cf16.exceptionally((e) -> {
            e.printStackTrace();
            return null;
        });
        // 主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭:
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}

        // CompletableFuture 可以串行执行
        // 第一个任务:
        CompletableFuture<String> cfQuery17 = CompletableFuture.supplyAsync(() -> {
            return queryCode17("中国石油", "");
        });
        // cfQuery成功后，执行第二个任务:
        CompletableFuture<Double> cfFetch17 = cfQuery17.thenApplyAsync((code) -> {
            return fetchPrice17(code, "");
        });
        cfFetch17.thenAccept((result) -> {
            System.out.println("price17: " + result);   // price17: 7.974464468713185
        });
        // 主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭:
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {}

        // 多个CompletableFuture可以并行执行
        // 两个CompletableFuture执行异步查询:
        CompletableFuture<String> cfQueryFromSina = CompletableFuture.supplyAsync(() -> {
            return queryCode17("中国石油", "https://finance.sina.com.cn/code/");
        });
        CompletableFuture<String> cfQueryFrom163 = CompletableFuture.supplyAsync(() -> {
            return queryCode17("中国石油", "https://money.163.com/code/");
        });
        // 用anyOf合并为一个新的CompletableFuture:
        CompletableFuture<Object> cfQuery17_2 = CompletableFuture.anyOf(cfQueryFromSina, cfQueryFrom163);
        // 两个CompletableFuture执行异步查询:
        CompletableFuture<Double> cfFetchFromSina = cfQuery17_2.thenApplyAsync((code) -> {
            return fetchPrice17((String) code, "https://finance.sina.com.cn/price/");
        });
        CompletableFuture<Double> cfFetchFrom163 = cfQueryFrom163.thenApplyAsync((code) -> {
            return fetchPrice17((String) code, "https://money.163.com/price/");
        });
        // 用anyOf合并为一个新的CompletableFuture:
        CompletableFuture<Object> cfFetch17_2 = CompletableFuture.anyOf(cfFetchFromSina, cfFetchFrom163);
        // 最终结果:
        cfFetch17_2.thenAccept((result) -> {
            System.out.println("price17_2: " + result);  // price17_2: 13.023957920342694
        });
        // 主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭:
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}

        // 使用ForkJoin
        // Fork/Join线程池，把一个大任务拆成多个小任务并行执行。
        // 创建2000个随机数组成的数组:
        long[] array18 = new long[2000];
        long expectedSum = 0;
        // 最笨的办法直接循环汇总结果
        for (int i = 0; i < array18.length; i++) {
            array18[i] = MyRandom();
            expectedSum += array18[i];
        }
        System.out.println("Expected sum:" + expectedSum);  // Expected sum:9788366
        // 引入 fork/join 线程池 汇总结果:
        ForkJoinTask<Long> task18 = new SumTask18(array18, 0, array18.length);
        // 获取当前系统毫秒数
        Long startTime = System.currentTimeMillis();
        Long result = ForkJoinPool.commonPool().invoke(task18);
        Long endTime = System.currentTimeMillis();
        System.out.println("Fork/join sum: " + result + " in " + (endTime - startTime) + " ms.");
        // Fork/join sum: 9788366 in 599 ms.

        // 使用ThreadLocal
        // 获取当前线程的信息
        LogHere("start logHere...");
        new Thread(() -> {
            LogHere("run task19 ...");
        }).start();
        new Thread(() -> {
            LogHere("print task19 ...");
        }).start();
        LogHere("end logHere...");
        // main 线程: start logHere...
        // Thread-29 线程: run task19 ...
        // main 线程: end logHere...
        // Thread-30 线程: print task19 ...

        // 如何在一个线程内传递状态？ ThreadLocal，它可以在一个线程中传递同一个对象
        // 在一个线程中，横跨若干方法调用，需要传递的对象，我们通常称之为上下文（Context），它是一种状态，可以是用户身份、任务信息等
        ExecutorService es20 = Executors.newFixedThreadPool(3);
        String[] users20 = new String[] {"Bob", "Alice", "Tim", "Mike", "Lily", "Jack", "Bush"};
        for (String user : users20) {
            es20.submit(new Task20(user));
            // [pool-2-thread-1]① init user Bob...
            // [pool-2-thread-2]① init user Alice...
            // [pool-2-thread-2]② check user Alice...
            // [pool-2-thread-1]② check user Bob...
            // [pool-2-thread-2]③ Alice registered ok...
            // [pool-2-thread-1]③ Bob registered ok...
            // [pool-2-thread-3]① init user Mike...
            // [pool-2-thread-2]④ Alice's work has done...
            // [pool-2-thread-1]④ Bob's work has done...
            // [pool-2-thread-1]⑤ cleanup for user Bob...
            // [pool-2-thread-2]⑤ cleanup for user Alice...
            // [pool-2-thread-1]① init user Lily...
        }
        try {
            es20.awaitTermination(3, TimeUnit.SECONDS);
            es20.shutdown();
        } catch (InterruptedException e) {}

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    public interface Converter<T1, T2> {
        void convert(int i);
    }

    static Double fetchPrice16() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        if (Math.random() < 0.3) {
            throw new RuntimeException("fetch price16 failed");
        }
        return 5 + Math.random() * 100;
    }

    static String queryCode17(String name, String address) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
        return "601857";
    }

    static Double fetchPrice17(String code, String addr) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
        return 5 + Math.random() * 10;
    }

    static long MyRandom() {
        return random18.nextInt(10000);
    }

    static void LogHere(String s) {
        System.out.println(Thread.currentThread().getName() + " 线程: " + s);
    }
}

class NaturalSupplier implements Supplier {
    int n = 0;

    public Integer get() {
        n++;
        return n;
    }
}

class LocalDateSupplier implements Supplier<LocalDate> {
    LocalDate start = LocalDate.of(2022, 6, 2);
    int n = -1;

    public LocalDate get() {
        n++;
        return start.plusDays(n);
    }
}

class MyThread22 extends Thread {
    @Override
    public void run() {
        System.out.println("start second new thread");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {}
        System.out.println("start third new thread");
    }
}

class MyThread66 extends Thread {
    @Override
    public void run() {
        int n = 0;
        while (! isInterrupted()) {
            n++;
            System.out.println(n + " Thread66");
        }
    }
}

class MyThread77 extends Thread {
    public void run() {
        Thread hello = new HelloThread();
        hello.start();
        // 1 helloThread
        // 2 helloThread
        // ...
        // 10 helloThread
        try {
            hello.join();
        } catch (InterruptedException e) {
            System.out.println("MyThread77 interrupted!");  // MyThread77 interrupted!
        }
        hello.interrupt();
    }
}

class HelloThread extends Thread {
    public void run() {
        int n = 0;
        while(!isInterrupted()) {
            n++;
            System.out.println(n + " helloThread");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

class HelloThread88 extends Thread {
    public volatile boolean running = true;
    public void run() {
        int n = 0;
        while(running) {
            n++;
            System.out.println(n + " HelloThread88");
        }
        System.out.println("HelloThread88 end");
    }
}

class TimerThread extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("守护进程：" + LocalTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

class Counter {
    public static final Object lock = new Object();
    public static int count = 0;
}

class AddThread10 extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Counter.count += 1;
        }
    }
}

class DecThread10 extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Counter.count -= 1;
        }
    }
}

class AddThread11 extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Counter.lock) {
                Counter.count += 1;
            }
        }
    }
}

class DecThread11 extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Counter.lock) {
                Counter.count -= 1;
            }
        }
    }
}

class Counter12 {
    private int count12 = 0;

    // synchronized 加锁，写法一
    public void add12(int n) {
        synchronized(this) {
            count12 += n;
        }
    }

    // synchronized 加锁，写法二
    public synchronized void dec12(int n) {
        count12 -= n;
    }

    public int get() {
        return count12;
    }
}

class TaskQueue13 {
    Queue<String> queue = new LinkedList<>();

    public synchronized void addTask(String s) {
        this.queue.add(s);
        this.notifyAll();
    }

    public synchronized String doTask() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("当前的线程 -- " + Thread.currentThread().getName() + " AAA");
            this.wait();
            System.out.println("当前的线程 -- " + Thread.currentThread().getName() + " BBB");
        }
        System.out.println("当前的线程 -- " + Thread.currentThread().getName() + " CCC");
        return queue.remove();
    }
}

class TaskQueue14 {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private Queue<String> queue = new LinkedList<>();

    public void addTask(String s) {
        lock.lock();
        try {
            queue.add(s);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String doTask() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                try {
                    condition.await();
                } catch (InterruptedException e) {}
            }
            return queue.remove();
        } finally {
            lock.unlock();
        }
    }
}

class Task15 implements Runnable {
    private final String name;

    public Task15(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("start task15 " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println("end task15 " + name);
    }
}

class SumTask18 extends RecursiveTask<Long> {
    static final int THRESHOLD = 500;
    long[] array;
    int start;
    int end;

    SumTask18(long[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start <= THRESHOLD) {
            // 如果任务足够小,直接计算:
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += this.array[i];
                // 故意放慢计算速度:
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {}
            }
            return sum;
        }
        // 任务太大，一分为二
        int middle = (end + start) / 2;
        System.out.println(String.format("split %d - %d ==> %d - %d, %d - %d", start, end, start, middle, middle, end));
        // split 0 - 2000 ==> 0 - 1000, 1000 - 2000
        // split 0 - 1000 ==> 0 - 500, 500 - 1000
        // split 1000 - 2000 ==> 1000 - 1500, 1500 - 2000
        SumTask18 subTask1 = new SumTask18(this.array, start, middle);
        SumTask18 subTask2 = new SumTask18(this.array, middle, end);
        // invokeAll会并行运行两个子任务:
        invokeAll(subTask1, subTask2);
        // 获得子任务的结果:
        Long subResult1 = subTask1.join();
        Long subResult2 = subTask2.join();
        // 汇总结果:
        Long result = subResult1 + subResult2;
        System.out.println("result = " + subResult1 + " + " + subResult2 + " ===> " + result);
        // result = 2485485 + 2491717 ===> 4977202
        // result = 2391591 + 2419573 ===> 4811164
        // result = 4811164 + 4977202 ===> 9788366
        return result;
    }

}

class Task20 implements Runnable {
    final String username;

    public Task20(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        try (var ctx = new UserContext(this.username)) {
            new Task1().process();
            new Task2().process();
            new Task3().process();
        }
    }
}

class UserContext implements AutoCloseable {
    private static final ThreadLocal<String> userThreadLocal = new ThreadLocal<>();

    public UserContext(String name) {
        userThreadLocal.set(name);
        System.out.printf("[%s]① init user %s...\n", Thread.currentThread().getName(), UserContext.getCurrentUser());
    }

    public static String getCurrentUser() {
        return userThreadLocal.get();
    }

    @Override
    public void close() {
        System.out.printf("[%s]⑤ cleanup for user %s...\n", Thread.currentThread().getName(), UserContext.getCurrentUser());
        userThreadLocal.remove();
    }
}

class Task1 {
    public void process() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) { }
        System.out.printf("[%s]② check user %s...\n", Thread.currentThread().getName(), UserContext.getCurrentUser());
    }
}

class Task2 {
    public void process() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) { }
        System.out.printf("[%s]③ %s registered ok...\n", Thread.currentThread().getName(), UserContext.getCurrentUser());
    }
}

class Task3 {
    public void process() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) { }
        System.out.printf("[%s]④ %s\'s work has done...\n", Thread.currentThread().getName(), UserContext.getCurrentUser());
    }
}


































