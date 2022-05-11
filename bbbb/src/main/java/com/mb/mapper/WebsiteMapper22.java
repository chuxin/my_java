package com.mb.mapper;

import com.mb.po.Domain;
import com.mb.po.Pages;
import com.mb.po.Website;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface WebsiteMapper22 {
    @Select(value = "select * from website")
    public List<Website> selectAllRecords22();

    @Select("select id, name, url, age, country, createtime from website where name = #{name} and country = #{country}")
    @Results(id="websiteMapXXXX", value={
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "url"),     // 这里故意整反了  name vs url
            @Result(column = "url", property = "name"),     // 这里故意整反了  name vs url
            @Result(column = "age", property = "age"),
            @Result(column = "createtime", property = "createtime", jdbcType = JdbcType.DATE),
    })
    // @Param 中的 value 属性可省略，用于指定参数的别名
    public List<Website> selectOne(@Param(value="name") String name22, @Param("country") String country22);

    @Select("select id, name, url, age, country from website")
    @Results({
        @Result(id = true, column = "id", property = "id", jdbcType = JdbcType.INTEGER),
        @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
        @Result(column = "url", property = "url", jdbcType = JdbcType.VARCHAR),
    })
    public List<Website> selectAll();

    @Select("select id, name, url, age, country from website")
    @ResultMap("websiteMapXXXX")
    public List<Website> selectAll22();


    @Insert("insert into website(name, url, age, country, createtime) values(#{name}, #{url}, #{age}, #{country}, #{createtime})")
    public int insert(Website website);

    @Insert("insert into website(id, name, url) values(#{id}, #{name}, #{url})")
    @SelectKey(statement = "select last_insert_id()", keyProperty = "id", keyColumn = "id", resultType = Integer.class, before = false)
    public int insert_2(Website website);


    @Update("update website set name= #{name}, url = #{url} where id = #{id}")
    public int updateWebsiteById(Website website);


    @Delete("delete from website where id =#{id}")
    public int deleteById(Integer id);


    // 一对一
    @Select("select * from website where id = #{id}")
    @Results(id = "userAndIdcardResultMap", value = {
            @Result(id=true, column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "url", property = "url"),
            @Result(column = "id", property = "domainObj", one=@One(select = "com.mb.mapper.DomainMapper.selectOneByWebId"))
    })
    public List<Website> getOneOfWebsiteAndDomain(Integer id);


    // 一对多
    @Select("select * from website where id = #{id}")
    @Results({
            @Result(id=true, column = "id", property = "id"),
            @Result(column = "id", property = "pagesList", many=@Many(select = "com.mb.mapper.WebsiteMapper22.selectManyByWebId"))
    })
    public List<Website> getManyPagesAndOneWebsite(Integer id);

    @Select("select * from pages where website_id = #{xxx_id}")
    public List<Pages> selectManyByWebId(@Param("xxx_id") Integer id);
}