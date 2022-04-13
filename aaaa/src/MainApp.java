import com.demo.ccc.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MainApp {
    private static final Log LOGGER = LogFactory.getLog(MainApp.class);

    public static void main(String[] args) {
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
        Student stuObj = context.getBean("Student", Student.class);
        LOGGER.info(stuObj.toString());
        // setter 注入
        
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


