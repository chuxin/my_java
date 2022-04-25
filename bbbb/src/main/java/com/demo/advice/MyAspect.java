package com.demo.advice;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component  // 定义成 Bean
@Aspect // 定义为切面
public class MyAspect {

    // 照着例子写有错误，不去解决了  ？？？
//    @Before("execution(* com.demo.dao.AopDao.add(..))")
//    public void before(Joinpoint joinpoint) {
//        System.out.println("MyAspect - 前置通知" + joinpoint);
//    }

    @After("execution(* com.demo.dao.AopDao.get(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("MyAspect - 最终通知 - " + joinPoint);
    }

    // 将 com.demo.dao 包下的 AopDao 类中的 get() 方法 定义为一个切点
    @Pointcut(value = "execution(* com.demo.dao.AopDao.get(..))")
    public void pointCut1() {

    }

    // 将 com.demo.dao 包下的 AopDao 类中的 get() 方法 定义为一个切点
    @Pointcut(value = "execution(* com.demo.dao.AopDao.delete(..))")
    public void pointCut2() {

    }

    // 切入点引用
    @Around("MyAspect.pointCut2()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知……1");
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知……2");
    }

    // 使用切入点表达式
    @AfterReturning(value="execution(* com.demo.dao.AopDao.modify(..))", returning = "returnValue")
    public void afterReturning(Object returnValue) {
        System.out.println("后置返回通知……,方法返回值为：" + returnValue);
    }

}
