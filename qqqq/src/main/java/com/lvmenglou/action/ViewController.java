package com.lvmenglou.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("viewtest")
public class ViewController {

    @RequestMapping("view111")
    public ModelAndView view111() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("username", "lalalala");
        mv.setViewName("view222");
        return mv;
    }
}
