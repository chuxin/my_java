package org.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.demo.mapper")
public class MycrudApplication {

    public static void main(String[] args) {
        // Spring 启动起来
        SpringApplication.run(MycrudApplication.class, args);
    }
}

