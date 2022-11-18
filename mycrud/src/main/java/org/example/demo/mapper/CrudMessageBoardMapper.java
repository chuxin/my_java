package org.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.demo.bean.CrudMessageBoard;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CrudMessageBoardMapper {

    public List<CrudMessageBoard> getAllRecords();

    public int insertMessage();

    public int updateMessage();

    public int deleteMessage();
}
