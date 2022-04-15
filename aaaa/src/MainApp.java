import com.demo.ccc.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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
        JavaCollection jcObj = context.getBean("javaCollection", JavaCollection.class);
        LOGGER.info(jcObj.toString());

        // Spring注入其他类型的属性
        ExampleBean ebObj = context.getBean("exampleBean", ExampleBean.class);
        LOGGER.info(ebObj.toString());
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





