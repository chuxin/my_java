package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.mypackages.OOPknowledge;
import com.example.demo.mypackages.BasicKnowledge;
import com.example.demo.mypackages.FirstChild;
import com.example.demo.mypackages.SecondChid;
import com.example.demo.mypackages.ThirdChild;

import com.example.demo.polymorphic.Income;
import com.example.demo.polymorphic.Salary;
import com.example.demo.polymorphic.Allowance;
import com.example.demo.polymorphic.TestFinal;

import com.example.demo.testInterface.Student;
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
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.DayOfWeek;
import java.util.*;

import com.example.demo.coreClass.MyCounter;
import com.example.demo.coreClass.MyJavaBean;
import com.example.demo.coreClass.Weekday;

import java.math.BigDecimal;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.testT.PersonT;
import com.example.demo.testT.Pair;

import com.example.demo.testCollections.MyStudent;
import com.example.demo.testCollections.Students;
import com.example.demo.testCollections.HisStudent;
import com.example.demo.testCollections.User;

import com.example.demo.testFunctionalProgramming.Person;
import org.springframework.context.annotation.ImportResource;

// 方法①  @ImportResource 导入 Spring 配置文件  不推荐
//@ImportResource(locations = {"classpath:/beans.xml"})
@SpringBootApplication
public class ZzzzApplication {

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
        // 

        /*********   开始看框架 spring  *********/
        // http://c.biancheng.net/spring/
        // 0、crud  postman实现
        // 1、登录 + curd + 页面展示
        // 2、github上找个完整的项目看看  （不一定做，后面再说）

        /*********   make a summary (spring)   *********/
        //

        /*********   回过头看最初的教程   *********/
        // 把之前没看的，没学的，都看一遍
        // https://www.liaoxuefeng.com/wiki/1252599548343744/1309301146648610

        /*********   make a summary at second time (basic)   *********/
        //
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
        System.out.println(zzzz.getClass().getResourceAsStream("/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/src/11.properties"));
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
}