package com.example.demo;

import com.example.demo.fmConfig.Person;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import javax.sql.DataSource;
//import java.sql.SQLException;
//import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class ZzzzApplicationTests {
    // IOC 容器
    @Autowired
    ApplicationContext ioc;
    @Autowired
    Person person;

//    @Autowired
//    DataSource dataSource;
//    @Autowired
//    JdbcTemplate jdbcTemplate;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void testXXXService() {
        boolean b = ioc.containsBean("personService");
        if (b) {
            System.out.println("personService 已经添加到 IOC 容器中");
        } else {
            System.out.println("personService 没有添加到 IOC 容器中");
        }
    }

    // SLF4J 日志级别从小到大trace>debug>info>warn>error
    // Spring Boot 日志默认级别为 info，日志输出内容默认包含以下元素：
    //   时间日期
    //   日志级别
    //   进程 ID
    //   分隔符：---
    //   线程名：方括号括起来（可能会截断控制台输出）
    //   Logger 名称
    //   日志内容
    //
    // 修改默认日志配置，参阅文件 src/main/resources/application.properties
    //
    // 自定义日志配置，这一块先忽略，有点复杂 ？？？
    @Test
    public void testLog() {
        logger.trace("trace 级别日志");
        logger.debug("debug 级别日志");
        logger.info("info 级别日志");
        logger.warn("warn 级别日志");
        logger.error("error 级别日志");
    }

//    @Test
//    public void testJDBC() throws SQLException {
//        System.out.println("默认数据源为：" + dataSource.getClass());
//        System.out.println("数据库连接实例：" + dataSource.getConnection());
//        //访问数据库
//        System.out.println(Integer.class);
//        Integer i = jdbcTemplate.queryForObject("select count(1) from `user`", Integer.class);
//        System.out.println("user表共有：" + i + " 条数据");
//    }
}
