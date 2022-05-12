package com.scaffold.mapper;

import com.scaffold.pojo.WpOptions;
import com.scaffold.pojo.WpOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WpOptionsMapper {
    long countByExample(WpOptionsExample example);

    int deleteByExample(WpOptionsExample example);

    int deleteByPrimaryKey(Integer optionId);

    int insert(WpOptions record);

    int insertSelective(WpOptions record);

    List<WpOptions> selectByExampleWithBLOBs(WpOptionsExample example);

    List<WpOptions> selectByExample(WpOptionsExample example);

    WpOptions selectByPrimaryKey(Integer optionId);

    int updateByExampleSelective(@Param("record") WpOptions record, @Param("example") WpOptionsExample example);

    int updateByExampleWithBLOBs(@Param("record") WpOptions record, @Param("example") WpOptionsExample example);

    int updateByExample(@Param("record") WpOptions record, @Param("example") WpOptionsExample example);

    int updateByPrimaryKeySelective(WpOptions record);

    int updateByPrimaryKeyWithBLOBs(WpOptions record);

    int updateByPrimaryKey(WpOptions record);
}