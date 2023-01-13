package org22.example22.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org22.example22.demo.bean.CrudMessageBoard;

import java.time.LocalDateTime;
import java.util.List;

public interface CrudMessageBoardMapper {

    public List<CrudMessageBoard> getAllRecords();

    public int insertMessage(@Param("title") String name, @Param("content") String content,
                             @Param("author") String author, @Param("category") String category,
                             @Param("create_time") LocalDateTime create_time, @Param("updateTime") LocalDateTime updateTime);

    public int updateMessage(@Param("id") int id, @Param("content") String content,
                             @Param("author") String author);

    public int deleteMessage(int id);

    public Integer getCount();

    public List<CrudMessageBoard> getPageRecords(@Param("pageStart") int pageStart, @Param("pageSize") int pageSize);
}
