package com.demo.dao;


import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void print() {
        System.out.println("我是 UserDaoImpl ");
    }
}
