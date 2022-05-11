package com.mb.mapper;

import com.mb.po.Domain;
import com.mb.po.Website;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DomainMapper {
    @Select("select * from domain where website_id = #{website_id}")
    public Domain selectOneByWebId(Integer website_id);
}