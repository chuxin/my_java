package com.mb.mapper;

import com.mb.po.Website;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface WebsiteMapper {
    public List<Website> selectAllRecords();

    public List<Website> selectRecordsByCondition(@Param("name") String name, @Param("url")  String url);
    public List<Website> selectRecordsByCondition22(@Param("name") String name, @Param("url")  String url);
    public List<Website> selectRecordsByCondition33(@Param("name") String name, @Param("url")  String url);
    public List<Website> selectRecordsByCondition44(@Param("name") String name, @Param("url")  String url);

    public int updateWebsiteById(Website site);

    public List<Website> selectRecordsByCondition55(@Param("list55") List<Integer> tttt);

    public List<Website> selectRecordsByCondition66(@Param("name") String name, @Param("url")  String url);

    public List<Website> selectRecordsByCondition77(@Param("name") String name, @Param("url") String url,
                                        @Param("currPage")  Integer currPage, @Param("pageSize") Integer pageSize);
}
