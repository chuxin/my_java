package com.scaffold.mapper;

import com.scaffold.pojo.WpUsers;
import com.scaffold.pojo.WpUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WpUsersMapper {
    long countByExample(WpUsersExample example);

    int deleteByExample(WpUsersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WpUsers record);

    int insertSelective(WpUsers record);

    List<WpUsers> selectByExample(WpUsersExample example);

    WpUsers selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WpUsers record, @Param("example") WpUsersExample example);

    int updateByExample(@Param("record") WpUsers record, @Param("example") WpUsersExample example);

    int updateByPrimaryKeySelective(WpUsers record);

    int updateByPrimaryKey(WpUsers record);
}