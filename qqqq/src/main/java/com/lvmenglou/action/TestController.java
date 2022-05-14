package com.lvmenglou.action;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tttt")
public class TestController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}