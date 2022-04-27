package com.demo.service;

import com.demo.dao.MyUserDao;
import com.demo.entity.MyUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("myUserService222")
public class MyUserServiceImpl implements MyUserService {
    @Resource
    private MyUserDao myUserDao;

    @Override
    public int addMyUser(MyUser myUser) {
        return myUserDao.addMyUser(myUser);
    }

    @Override
    public int updateMyUser(MyUser myUser) {
        return myUserDao.updateMyUser(myUser);
    }

    @Override
    public int deleteMyUser(MyUser myUser) {
        return myUserDao.delete(myUser);
    }

    @Override
    public int countMyUser(MyUser myUser) {
        return myUserDao.count(myUser);
    }

    @Override
    public List<MyUser> getMyUserList(MyUser myUser) {
        return myUserDao.getList(myUser);
    }

    @Override
    public MyUser getMyUser(MyUser myUser) {
        return myUserDao.getMyUser(myUser);
    }

    @Override
    public void batchAddMyUser(List<Object[]> batchArgs) {
        myUserDao.batchAddMyUser(batchArgs);
    }

}
