package com.lvmenglou.service;

import com.lvmenglou.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    boolean login(User user);

    boolean register(User user);
}
