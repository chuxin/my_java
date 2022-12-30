package org.example.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.demo.bean.CrudUsers;

import java.time.LocalDateTime;
import java.util.List;

public interface CrudUsersMapper {
    public int insertUserInfo(@Param("username") String username, @Param("passwd") String passwd,
                              @Param("ip") String ip, @Param("mobile") String mobile,
                              @Param("create_time") LocalDateTime create_time, @Param("update_time") LocalDateTime update_time);

    public List<CrudUsers> getUserInfo(@Param("username") String username, @Param("passwd") String passwd);
}

