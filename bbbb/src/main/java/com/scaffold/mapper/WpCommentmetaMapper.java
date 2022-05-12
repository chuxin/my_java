package com.scaffold.mapper;

import com.scaffold.pojo.WpCommentmeta;
import com.scaffold.pojo.WpCommentmetaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WpCommentmetaMapper {
    long countByExample(WpCommentmetaExample example);

    int deleteByExample(WpCommentmetaExample example);

    int deleteByPrimaryKey(Integer metaId);

    int insert(WpCommentmeta record);

    int insertSelective(WpCommentmeta record);

    List<WpCommentmeta> selectByExampleWithBLOBs(WpCommentmetaExample example);

    List<WpCommentmeta> selectByExample(WpCommentmetaExample example);

    WpCommentmeta selectByPrimaryKey(Integer metaId);

    int updateByExampleSelective(@Param("record") WpCommentmeta record, @Param("example") WpCommentmetaExample example);

    int updateByExampleWithBLOBs(@Param("record") WpCommentmeta record, @Param("example") WpCommentmetaExample example);

    int updateByExample(@Param("record") WpCommentmeta record, @Param("example") WpCommentmetaExample example);

    int updateByPrimaryKeySelective(WpCommentmeta record);

    int updateByPrimaryKeyWithBLOBs(WpCommentmeta record);

    int updateByPrimaryKey(WpCommentmeta record);
}