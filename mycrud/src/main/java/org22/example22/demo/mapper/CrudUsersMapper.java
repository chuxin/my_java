package org22.example22.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org22.example22.demo.bean.CrudUsers;

import java.time.LocalDateTime;

public interface CrudUsersMapper {
    public int insertUserInfo(@Param("username") String username, @Param("passwd") String passwd,
                              @Param("ip") String ip, @Param("mobile") String mobile,
                              @Param("create_time") LocalDateTime create_time, @Param("update_time") LocalDateTime update_time);

    public CrudUsers getUserInfo(@Param("username") String username, @Param("passwd") String passwd);

    public CrudUsers getUserInfoById(@Param("id") Integer id);
}

