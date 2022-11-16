package org.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageBoardController {

    @ResponseBody
    @RequestMapping("/showList")
    public String showList() {
        return "这里是留言板列表内容";
    }
}
