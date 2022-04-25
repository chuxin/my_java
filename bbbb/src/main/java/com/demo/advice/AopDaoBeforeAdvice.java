package com.demo.advice;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

public class AopDaoBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("AopDaoBeforeAdvice 正在执行前置增强操作…………");
    }
}
