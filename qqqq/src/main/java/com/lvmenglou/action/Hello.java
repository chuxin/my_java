package com.lvmenglou.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello");
        return "success";
    }
}