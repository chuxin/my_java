package com.demo.dao;

import org.springframework.stereotype.Component;

@Component("aopDao")
public class AopDaoImpl22 implements AopDao {
    @Override
    public void add() {
        System.out.println("正在执行 AopDaoImpl22 的 add() 方法……");
    }

    @Override
    public void delete() {
        System.out.println("正在执行 AopDaoImpl22 的 delete() 方法……");
    }

    @Override
    public void modify() {
        System.out.println("正在执行 AopDaoImpl22 的 modify() 方法……");
    }

    @Override
    public void get() {
        System.out.println("正在执行 AopDaoImpl22 的 get() 方法……");
    }
}
