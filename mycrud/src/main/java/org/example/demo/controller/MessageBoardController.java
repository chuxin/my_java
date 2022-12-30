package org.example.demo.controller;

import kafka.utils.json.JsonObject;
import org.example.demo.bean.CrudMessageBoard;
import org.example.demo.bean.ResponseStandard;
import org.example.demo.mapper.CrudMessageBoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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

    @RequestMapping(value="/addMessage", method=RequestMethod.POST)
    public ResponseEntity insertMessage(@RequestParam(defaultValue = "null") String title,
                                @RequestParam(defaultValue = "null") String content,
                                @RequestParam(defaultValue = "null") String author,
                                @RequestParam(defaultValue = "null") String category,
                                @RequestParam(defaultValue = "0000-00-00 00:00:00") String create_time) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt_create = LocalDateTime.parse(create_time, dtf);
        // 获取当前时间
        LocalDateTime ldt_update = LocalDateTime.parse(dtf.format(LocalDateTime.now()), dtf);
        int res = crudMessageBoardMapper.insertMessage(title, content, author, category, ldt_create, ldt_update);
        return new ResponseEntity<>("插入成功，标识符为：" + res, HttpStatus.OK);
    }

    @RequestMapping(value="/updateMessage", method=RequestMethod.POST)
    public ResponseEntity<ResponseStandard<String>> updateMessage(@RequestParam(defaultValue = "") int id,
                                          @RequestParam(defaultValue = "") String content,
                                          @RequestParam(defaultValue = "") String author) {
        int res = crudMessageBoardMapper.updateMessage(id, content, author);
        ResponseStandard<String> tt = new ResponseStandard<String>(200, "更新成功,标识符：" + res, "lalal");
        System.out.println(tt);
        return new ResponseEntity<>(tt, HttpStatus.OK);
    }

    @GetMapping("/deleteMessage/{id}")
    public String deleteMessage(@PathVariable("id") int id) {
        int res = crudMessageBoardMapper.deleteMessage(id);
        return "删除成功,标识符：" + res;
    }

}
