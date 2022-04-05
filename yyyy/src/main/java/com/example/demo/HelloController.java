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
    // 配置文件加载优先级顺序从大到小，注意：resources，config 的目录名称不能修改
    // application.properties 先加载
    //   yyyy/config/mmm/.
    //   yyyy/config/.
    //   yyyy/.
    //   yyyy/src/main/resources/config/.   ( classpath )
    //   yyyy/src/main/resources/.      ( classpath )
    // application.yml 后加载
    //   yyyy/src/main/resources/application.yml    ( classpath )
    //
    // 配置文件的优先级顺序，遵循以下规则：
    //   先加载 JAR 包外的配置文件，再加载 JAR 包内的配置文件；
    //     JAR 包外的 application.yml 优先级最高
    //     创建一个 run-yyyy 目录，其下再新建 application.yml ，并设置上下文路径为“/out-default”，并激活生产环境（prod）Profile
    //     执行命令 java -jar mybootdemo-0.0.1-SNAPSHOT.jar
    //     此时项目的优先级顺序为：JAR 包外 application.yml > JAR 包内 application-prod.yml > JAR 包内其他配置文件
    //   先加载 config 目录内的配置文件，再加载 config 目录外的配置文件；
    //   先加载 config 子目录下的配置文件，再加载 config 目录下的配置文件；
    //   先加载 appliction-{profile}.properties/yml，再加载 application.properties/yml；
    //   先加载 .properties 文件，再加载 .yml 文件。

    // Maven使用
    // Maven 对项目进行打包时，位于项目根目录下的配置文件是无法被打包进项目的 JAR 包的，因此位于根目录下的默认配置文件无法在 JAR 中生效

    // Spring Boot 指定项目外部配置文件
    // ① java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.config.location=/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/MyDoc/test/application.properties
    // 会使项目本身的配置文件失效，只使用外部配置文件
    //
    // ② java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.config.additional-location=/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/MyDoc/test/application.properties
    // 不会使项目本身的配置文件失效，且其优先级是最高的
    // 因此加载顺序为：
    // spring.config.additional-location 指定的外部配置文件 /Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/yyyy/MyDoc/test/application.properties
    // classpath:/config/application.yml
    // classpath:/application.yml

    // Spring Boot配置加载顺序
    //
    // Spring Boot 配置形式及其加载顺序（优先级由高到低）：
    //   命令行参数
    //     java -jar {Jar文件名} --{参数1}={参数值1} --{参数2}={参数值2}
    //     java -jar springbootdemo-0.0.1-SNAPSHOT.jar --server.port=8081 --server.servlet.context-path=/bcb
    //   来自 java:comp/env 的 JNDI 属性
    //   Java 系统属性（System.getProperties()）
    //   操作系统环境变量
    //   RandomValuePropertySource 配置的 random.* 属性值
    //   配置文件（YAML 文件、Properties 文件）
    //   @Configuration 注解类上的 @PropertySource 指定的配置文件
    //   通过 SpringApplication.setDefaultProperties 指定的默认属性

    // Spring Boot自动配置原理
    // 这一章讲得比较深奥，跳过

    // SpringBoot 底层使用 slf4j+logback 的方式记录日志
    // 具体使用参考： src/test/java/com/example/demo/ZzzzApplicationTests.java

    // Spring Boot静态资源映射
    // WebJars 映射
    //   到 https://www.webjars.org/ 寻找需要的插件，选择 classic WebJars
    //   pom.xml 里添加依赖关系。
    //     <dependency>
    //      <groupId>org.webjars</groupId>
    //      <artifactId>jquery</artifactId>
    //      <version>3.6.0</version>
    //     </dependency>
    //   右击 pom.xml 文件，Maven -> load project， 更新配置文件对应的本地插件库
    //
    // 默认资源映射
    //   优先级顺序
    //      classpath:/META-INF/resources/     (src/main/resources/META-INF/resources/test.html)
    //      classpath:/resources/              (src/main/resources/resources/test.html)
    //      classpath:/static/                 (src/main/resources/static/test.html)
    //      classpath:/public/                 (src/main/resources/public/test.html)

    // Spring Boot JDBC访问数据库
    // ① 导入 JDBC 插件
    //   <!--导入JDBC的场景启动器-->
    //   <dependency>
    //       <groupId>org.springframework.boot</groupId>
    //       <artifactId>spring-boot-starter-data-jdbc</artifactId>
    //   </dependency>
    //    <!--导入数据库驱动-->
    //   <dependency>
    //       <groupId>mysql</groupId>
    //       <artifactId>mysql-connector-java</artifactId>
    //       <scope>runtime</scope>
    //   </dependency>
    // ② 配置数据源 application.yml
    //   spring:
    //     datasource:
    //       username: root
    //       password: root
    //       url: jdbc:mysql://127.0.0.1:3306/bianchengbang_jdbc
    //       driver-class-name: com.mysql.cj.jdbc.Driver
    // ③ 连接数据库

    // Spring Boot数据源配置原理  先忽略
}
