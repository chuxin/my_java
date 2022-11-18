package org.example.demo.controller;

import org.example.demo.bean.CrudMessageBoard;
import org.example.demo.mapper.CrudMessageBoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageBoardController {
    @Autowired
    public CrudMessageBoardMapper crudMessageBoardMapper;

    @RequestMapping("/showList")
    public List<CrudMessageBoard> showList() {
        return crudMessageBoardMapper.getAllRecords();
//        return "这里是留言板列表内容";
    }

    @RequestMapping("/addMessage")
    public String insertMessage() {
        return "插入成功";
    }

    @GetMapping("/updateMessage")
    public String updateMessage() {
        return "更新成功";
    }
}
