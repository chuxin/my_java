package com.example.demo;

import com.example.demo.fmConfig.Person;

import com.example.demo.unittest.Calculator;
import com.example.demo.unittest.Factorial;
import com.example.demo.unittest.StringUtils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void testFact() {
        assertEquals(1, ZzzzApplicationTests.fact(1));
        assertEquals(2, ZzzzApplicationTests.fact(2));
        assertEquals(6, ZzzzApplicationTests.fact(3));
        // 使用浮点数时，由于浮点数无法精确地进行比较，
        // 因此，我们需要调用assertEquals(double expected, double actual, double delta)这个重载方法，指定一个误差值
        assertEquals(0.1, Math.abs(1 - 9/10.0), 0.0000001);
    }

    public static long fact(long n) {
        long r = 1;
        for (long i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }

    // 异常测试
    @Test
    void testNegative() {
        // 写法一
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Factorial.fact22(-1);
            }
        });

        // 写法二
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.fact22(-2);
        });
    }

    // 条件测试
    @Test
    @Disabled("my_operation")
    void testOperation() {
//        TODO: this test is disabled for bug fixing
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testWindows() {
        assertEquals("C:\\test.ini", "C:\test.ini");
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void testLiunxAndMac() {
        assertEquals("/usr/test.ini", "/usr/test.ini");
    }

    // 参数化测试
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 5, 100})
    void testAbs(int x) {
        assertEquals(x, Math.abs(x));
    }

    @ParameterizedTest
    @MethodSource
    void testCapitalize(String input, String result) {
        assertEquals(result, StringUtils.capitalize(input));
    }

    static List<Arguments> testCapitalize() {
        return List.of(
                Arguments.of("abc", "Abc"),
                Arguments.of("APPLE", "Apple"),
                Arguments.of("gooD", "Good")
        );
    }

    @ParameterizedTest
    @CsvSource({"abc, Abc", "APPLE, Apple", "gooD, Good"})
    void testCapitalize22(String input, String result) {
        assertEquals(result, StringUtils.capitalize(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/test-capitalize.csv"})
    void testCapitalize33(String input, String result) {
        assertEquals(result, StringUtils.capitalize(input));
    }














}
