package com.example.demo.fmConfig.service;

import com.example.demo.fmConfig.service.PersonService;
import com.example.demo.fmConfig.service.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 方法②  使用全注解方式加载 Spring 配置  推荐
/**
 * @Configuration 注解用于定义一个配置类，相当于 Spring 的配置文件
 * 配置类中包含一个或多个 @Bean 注解的方法，该方法等同于 Spring 配置文件中的 <bean> 标签定义的组件。
 */
@Configuration
public class MyAppConfig {

    /**
     * 与 <bean id="personService" class="PersonServiceImpl"></bean> 等价
     * 返回值以组件的形式添加到容器中
     * 方法名 等同于 <bean> 标签的属性 id
     */
    @Bean
    public PersonService personService() {
        System.out.println("在容器中添加了一个组件 peronService");
        return new PersonServiceImpl();
    }
}
