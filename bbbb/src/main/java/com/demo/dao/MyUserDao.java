package com.demo.dao;

import com.demo.entity.MyUser;
import java.util.List;

public interface MyUserDao {
    int addMyUser(MyUser myUser);

    int updateMyUser(MyUser myUser);

    int delete(MyUser myUser);

    int count(MyUser myUser);

    List<MyUser> getList(MyUser myUser);

    MyUser getMyUser(MyUser myUser);

    void batchAddMyUser(List<Object[]> batchArgs);
}
