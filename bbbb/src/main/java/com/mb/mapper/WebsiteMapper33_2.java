package com.mb.mapper;

import com.mb.po.Website;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface WebsiteMapper33_2 {
    public int addWebsiteByParam(@Param("name") String name, @Param("url") String url);

    public int updateWebsiteByParam(@Param("name") String name, @Param("url") String url, @Param("id") Integer id);

    public int deleteWebsiteByParam(@Param("id") Integer id, @Param("name") String name);

    public List<Website> selectWebsiteByParam(@Param("name") String name, @Param("url") String url);
}
