package com.example.demo;

import com.example.demo.fmConfig.Person;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ZzzzApplicationTests {
    // IOC 容器
    @Autowired
    ApplicationContext ioc;
    @Autowired
    Person person;

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
}
