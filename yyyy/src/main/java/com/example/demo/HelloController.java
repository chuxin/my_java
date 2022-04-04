package com.example.demo;
import com.example.demo.fmConfig.Person;
import com.example.demo.fmConfig.Person22;
import com.example.demo.fmConfig.Person33;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    private Person person;
    @Autowired
    private Person22 person22;
    @Autowired
    private Person33 person33;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("打印点东西");
        return "hello world=2=";
    }

    /*
    @Value 与 @ConfigurationProperties 对比
    1. 使用位置不同
        @ConfigurationProperties：标注在 JavaBean 的类名上；
        @Value：标注在 JavaBean 的属性上。
    2. 功能不同
        @ConfigurationProperties：用于批量绑定配置文件中的配置；
        @Value：只能一个一个的指定需要绑定的配置。
    3. 松散绑定支持不同
        @ConfigurationProperties：支持松散绑定（松散语法），例如实体类 Person 中有一个属性为 firstName，那么配置文件中的属性名支持以下写法：
            person.firstName
            person.first-name
            person.first_name
            PERSON_FIRST_NAME
        @Vaule：不支持松散绑定。
    4. SpEL 支持不同
        @ConfigurationProperties：不支持 SpEL 表达式;
        @Value：支持 SpEL 表达式。
    5. 复杂类型封装
        @ConfigurationProperties：支持所有类型数据的封装，例如 Map、List、Set、以及对象等；
        @Value：只支持基本数据类型的封装，例如字符串、布尔值、整数等类型。
    6. 应用场景不同
        若只是获取配置文件中的某项值，则推荐使用 @Value 注解；
        若专门编写了一个 JavaBean 来和配置文件进行映射，则建议使用 @ConfigurationProperties 注解。
     */
    @ResponseBody
    @RequestMapping("/printConfig")
    public Person printConfig() {
        // 如果我们想要使用 @ConfigurationProperties 注解进行配置绑定，那么首先就要保证该 JavaBean 对象在 IoC 容器中，所以需要用到 @Component 注解来添加组件到容器中
        // JavaBean 上使用了注解 @ConfigurationProperties(prefix = "person") ，它表示将这个 JavaBean 中的所有属性与配置文件中以“person”为前缀的配置进行绑定。
        return person;
    }

    @ResponseBody
    @RequestMapping("/printConfig22")
    public Person22 printConfig22() {
        // 当我们只需要读取配置文件中的某一个配置时，可以通过 @Value 注解获取
        return person22;
    }

    // action 名字和 mapping 名字不一致，也没关系
    @ResponseBody
    @RequestMapping("/printConfig33")
    public Person33 printConfig55() {
        // 将与 Spring Boot 无关的配置（例如自定义配置）提取出来，写在一个单独的配置文件中，并在对应的 JavaBean 上使用 @PropertySource 注解指向该配置文件。
        // 中文乱码问题 ？？？
        return person33;
    }

    // Spring Boot导入Spring配置
    // 有两种方法，代码位置
    // src/test/java/com/example/demo/ZzzzApplicationTests.java
    // com.example.demo.fmConfig.service
    // 个人感悟：
    //     spring boot 导入配置文件，跟 spring 无关，感觉像是为了定义一些规范
    //     通过单元测试来验证是否导入成功

    // Spring Boot Profile（多环境配置）
    // properties 配置     src/main/resources/Person33.properties
    // yml 配置    src/main/resources/application.yml
    //
    // 命令行激活配置  java -jar helloworld-0.0.1-SNAPSHOT.jar  --spring.profiles.active=dev
    // 虚拟机参数激活  java -Dspring.profiles.active=prod -jar helloworld-0.0.1-SNAPSHOT.jar
    //
    // 个人感悟：
    //      application.properties 的配置会覆盖 application.yml 的配置

    // Spring Boot默认配置文件
    //
    //
    //
    //

}
