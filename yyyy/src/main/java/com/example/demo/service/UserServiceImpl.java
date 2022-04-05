package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
//    @Autowired
//    UserMapper userMapper;

    public User getUserByNameAndAddressLine(User user) {
        return user;
//        User loginUser = userMapper.getUserByNameAndAddressLine(user);
//        return loginUser;
    }
}
