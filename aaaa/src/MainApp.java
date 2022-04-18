import com.demo.ccc.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.demo.ccc.MyWorld;

public class MainApp {
    private static final Log LOGGER = LogFactory.getLog(MainApp.class);

    public static void main(String[] args) {
        System.out.println("---创建一个测试Bean---");
        // 方法一，没成功
//        ApplicationContext context = new FileSystemXmlApplicationContext("/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/aaaa/src/Test.xml");
        // 方法二
        ApplicationContext context = new ClassPathXmlApplicationContext("Test.xml");

        // 方法一
//        HelloWorld obj = (HelloWorld) context.getBean("helloworld22");
        // 方法二
        HelloWorld obj = context.getBean("helloworld22", HelloWorld.class);
        obj.getMessage();

        // 构造函数注入
        System.out.println("---构造函数注入【System.out.println】---");
        LOGGER.info("---构造函数注入【LOGGER.info】---");
        Student stuObj = context.getBean("Student", Student.class);
        LOGGER.info(stuObj.toString());

        // setter 注入
        System.out.println("---setter 注入【System.out.println】---");      // 注意这里的sout信息 比 上面LOGGER.info先输出
        LOGGER.info("---setter 注入【LOGGER.info】---");
        Parent22 parent22Obj = context.getBean("Parent22", Parent22.class);
        LOGGER.info(parent22Obj.toString());
        Child22 child22Obj = context.getBean("Child22", Child22.class);
        LOGGER.info(child22Obj.toString());

        // 短命名空间注入
        System.out.println("---短命名空间注入【System.out.println】---");      // 注意这里的sout信息 比 上面LOGGER.info先输出
        LOGGER.info("---短命名空间注入【LOGGER.info】---");
        // p 命名空间注入
        Employee33 emp33Obj = context.getBean("employee33", Employee33.class);
        LOGGER.info(emp33Obj.toString());
        // c 命名空间注入
        Employee44 emp44Obj = context.getBean("employee44", Employee44.class);
        LOGGER.info(emp44Obj.toString());

        // Spring注入内部Bean
        LOGGER.info("--- Spring注入内部Bean ---");
        //   setter 方式注入内部 Bean
        Employee55 emp55Obj = context.getBean("employee55", Employee55.class);
        LOGGER.info(emp55Obj.toString());
        //   构造函数方式注入内部 Bean
        Employee66 emp66Obj = context.getBean("employee66", Employee66.class);
        LOGGER.info(emp66Obj.toString());

        // Spring注入集合
        //   <list>	用于注入 list 类型的值，允许重复
        //   <set>	用于注入 set 类型的值，不允许重复
        //   <map>	用于注入 key-value 的集合，其中 key 和 value 都可以是任意类型
        //   <props>	用于注入 key-value 的集合，其中 key  和 value 都是字符串类型
        //   在集合中设置对象类型的值
        LOGGER.info("--- Spring注入集合 ---");
        JavaCollection jcObj = context.getBean("javaCollection", JavaCollection.class);
        LOGGER.info(jcObj.toString());
        // Spring注入其他类型的属性
        ExampleBean ebObj = context.getBean("exampleBean", ExampleBean.class);
        LOGGER.info(ebObj.toString());

        // Spring Bean作用域
        LOGGER.info("--- Spring Bean作用域 ---");
        //   singleton
        PatternBean sb11 = context.getBean("singletonBean", PatternBean.class);
        PatternBean sb22 = context.getBean("singletonBean", PatternBean.class);
        LOGGER.info(sb11);   // 实例地址完全相同
        LOGGER.info(sb22);   // 实例地址完全相同
        //   prototype
        PatternBean pb11 = context.getBean("prototypeBean", PatternBean.class);
        PatternBean pb22 = context.getBean("prototypeBean", PatternBean.class);
        LOGGER.info(pb11);   // 实例地址不相同
        LOGGER.info(pb22);   // 实例地址不相同

        // Spring Bean生命周期
        LOGGER.info("");
        LOGGER.info("--- Spring Bean生命周期 ---");
        // ① 通过接口实现
        // 获取 ClassPathXmlApplicationContext 容器
        ClassPathXmlApplicationContext context_1 = new ClassPathXmlApplicationContext("Test.xml");
        LifeCycleBean lcbObj = context_1.getBean("lifeCycleBean", LifeCycleBean.class);
        LOGGER.info(lcbObj);
        context_1.close();
        // ② 通过 XML 配置实现
        ClassPathXmlApplicationContext context_2 = new ClassPathXmlApplicationContext("Test.xml");
        LifeCycleBean22 lcbObj22 = context_2.getBean("lifeCycleBean22", LifeCycleBean22.class);
        LOGGER.info(lcbObj22);
        context_2.close();
        // ③ 使用注解实现 ？？？
        // 目前 spring 框架里缺少 javax.annotation 包，需要学了 Maven 工具后，安装这个。然后才能测试  注解功能

        // Spring后置处理器（BeanPostProcessor）
        AbstractApplicationContext context_3 = new ClassPathXmlApplicationContext("Test.xml");
        MyWorld hwObj = (MyWorld) context_3.getBean("myWorld");
        hwObj.getMessage();
        context_3.registerShutdownHook();
    }

}

// 创建 spring项目，输出第一个 helloworld
// https://blog.csdn.net/qq_46631566/article/details/118114677
// http://c.biancheng.net/spring/first-spring.html

// 加载类路径 ClassPath 下指定的 XML 配置文件，并完成 ApplicationContext 的实例化工作
// ApplicationContext applicationContext = new ClassPathXmlApplicationContext(String configLocation);

// 加载指定的文件系统路径中指定的 XML 配置文件，并完成 ApplicationContext 的实例化工作
// ApplicationContext applicationContext = new FileSystemXmlApplicationContext(String configLocation);

// Spring Bean定义    <bean> 标签上的各种属性
// http://c.biancheng.net/spring/bean-definition.html
// 属性名称	    描述
// id	        Bean 的唯一标识符，Spring IoC 容器对 Bean 的配置和管理都通过该属性完成。id 的值必须以字母开始，可以使用字母、数字、下划线等符号。
// name	        该属性表示 Bean 的名称，我们可以通过 name 属性为同一个 Bean 同时指定多个名称，每个名称之间用逗号或分号隔开。Spring 容器可以通过 name 属性配置和管理容器中的 Bean。
// class	    该属性指定了 Bean 的具体实现类，它必须是一个完整的类名，即类的全限定名。
// list	        用于封装 List 或数组类型的属性注入。
// set	        用于封装 Set 类型的属性注入。
// map	        用于封装 Map 类型的属性注入。

// Spring Bean属性注入
// Bean 属性注入，简单点说就是将属性注入到 Bean 中的过程，而这属性既可以普通属性，也可以是一个对象（Bean）
//  构造函数注入
//  setter 注入
//  短命名空间注入
//        短命名空间	    简化的 XML 配置	                        说明
//        p 命名空间	    <bean> 元素中嵌套的 <property> 元素	    是 setter 方式属性注入的一种快捷实现方式
//        c 命名空间	    <bean> 元素中嵌套的 <constructor> 元素	    是构造函数属性注入的一种快捷实现方式
//
//        使用 p 命名空间注入依赖时，必须注意以下 3 点：
//            Java 类中必须有 setter 方法；
//            Java 类中必须有无参构造器（类中不包含任何带参构造函数的情况，无参构造函数默认存在）；
//            在使用 p 命名空间实现属性注入前，XML 配置的 <beans> 元素内必须先导入 p 命名空间的 XML 约束。

// Spring注入内部Bean

// Spring Bean作用域
//      singleton	  默认值，单例模式，表示在 Spring 容器中只有一个 Bean 实例
//      prototype	  原型模式，表示每次通过 Spring 容器获取 Bean 时，容器都会创建一个新的 Bean 实例。
//      request	      每次 HTTP 请求，容器都会创建一个 Bean 实例。该作用域只在当前 HTTP Request 内有效。
//      session	      同一个 HTTP Session 共享一个 Bean 实例，不同的 Session 使用不同的 Bean 实例。该作用域仅在当前 HTTP Session 内有效。
//      application	  同一个 Web 应用共享一个 Bean 实例，该作用域在当前 ServletContext 内有效。
//                    与 singleton 类似，但 singleton 表示每个 IoC 容器中仅有一个 Bean 实例，而一个 Web 应用中可能会存在多个 IoC 容器，但一个 Web 应用只会有一个 ServletContext，也可以说 application 才是 Web 应用中货真价实的单例模式。
//      websocket	  websocket 的作用域是 WebSocket ，即在整个 WebSocket 中有效。

// spring Bean 的生命周期
//   Bean 的实例化
//   Bean 属性赋值
//   Bean 的初始化
//   Bean 的使用
//   Bean 的销毁

// 对于 singleton 作用域的 Bean 来说，Spring IoC 容器能够精确地控制 Bean 何时被创建、何时初始化完成以及何时被销毁；
// 对于 prototype 作用域的 Bean 来说，Spring IoC 容器只负责创建，然后就将 Bean 的实例交给客户端代码管理，Spring IoC 容器将不再跟踪其生命周期。


// 3 种方式自定义 Bean 的生命周期回调方法
//    通过接口实现
//    通过 XML 配置实现
//    使用注解实现