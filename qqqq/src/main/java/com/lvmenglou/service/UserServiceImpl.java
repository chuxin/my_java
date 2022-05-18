package com.lvmenglou.service;

import com.lvmenglou.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public boolean login(User user) {
        if ("aaaaa".equals(user.getName()) && "12345".equals(user.getPwd())) {
            return true;
        }

        return false;
    }

    @Override
    public boolean register(User user) {
        if ("bbbbb".equals(user.getName()) && "23456".equals(user.getPwd())) {
            return true;
        }
        return false;
    }
}
