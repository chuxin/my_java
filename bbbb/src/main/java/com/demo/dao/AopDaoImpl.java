package com.demo.dao;

public class AopDaoImpl implements AopDao {
    @Override
    public void add() {
        System.out.println("正在执行 AopDaoImpl 的 add() 方法……");
    }

    @Override
    public void delete() {
        System.out.println("正在执行 AopDaoImpl 的 delete() 方法……");
    }

    @Override
    public void modify() {
        System.out.println("正在执行 AopDaoImpl 的 modify() 方法……");
    }

    @Override
    public void get() {
        System.out.println("正在执行 AopDaoImpl 的 get() 方法……");
    }
}
