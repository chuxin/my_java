package com.demo.service;

import com.demo.entity.MyUser;
import java.util.List;

public interface MyUserService {
    public int addMyUser(MyUser myUser);

    public int updateMyUser(MyUser myUser);

    public int deleteMyUser(MyUser myUser);

    public int countMyUser(MyUser myUser);

    public List<MyUser> getMyUserList(MyUser myUser);

    public MyUser getMyUser(MyUser myUser);

    public void batchAddMyUser(List<Object[]> batchArgs);

}
