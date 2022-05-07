package com.mb.mapper;

import com.mb.po.Website;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WebsiteMapper22 {
    @Select(value = "select * from website")
    public List<Website> selectAllRecords22();
}
