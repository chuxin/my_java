package com.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ComponentScan;

// 两种方式启用 @AspectJ 注解支持： Java 配置类启动（标注了 @Configuration 注解的类），另一种是 基于 XML 配置，暂不考虑
// 使用 @EnableAspectJAutoProxy 和 @ComponentScan 注解启用 @AspectJ 注解支持。
@Configuration
@ComponentScan(basePackages = "com.demo")   // 注解扫描
@EnableAspectJAutoProxy  // 开启 AspectJ 的自动代理
public class AopDaoConfig {

}
