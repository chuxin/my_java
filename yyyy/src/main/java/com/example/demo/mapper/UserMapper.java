package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

// 当 mapper 接口较多时，我们可以在 Spring Boot 主启动类上使用 @MapperScan 注解扫描指定包下的 mapper 接口，
// 而不再需要在每个 mapper 接口上都标注 @Mapper 注解。
//@Mapper
public interface UserMapper {
    // 通过用户名地址查询用户数据
    User getUserByNameAndAddressLine(User user);
}
