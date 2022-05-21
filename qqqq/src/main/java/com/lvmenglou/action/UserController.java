package com.lvmenglou.action;

import com.lvmenglou.entity.Order;
import com.lvmenglou.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
//import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String add(@ModelAttribute("user") User user) {
        return "addUser";
    }

    @RequestMapping(value = "/showuser", method = RequestMethod.POST)
    public String showuser(User user, HttpSession session, HttpServletRequest request) {
        return "showUser";
    }

    @RequestMapping("/converter")
    public String myConverter(@RequestParam("userinfo") User user, Model model) {
        model.addAttribute("user", user);
        return "showUser";
    }


    // 整个页面操作 跟 OrderConverter 没一毛线关系
    @RequestMapping(value = "/addOrder", method = RequestMethod.GET)
    public String addOrder(@ModelAttribute("order") Order order) {
        return "addOrder";
    }

    @RequestMapping("/formatter")
    public String myFormatter(Order order, Model model) {
        System.out.println(order);
        model.addAttribute("order", order);
        return "showOrder";
    }

    @RequestMapping("/indexJson")
    public String indexJson() {
        return "indexJson";
    }

    // Spring MVC JSON数据交互
    /**
     * 接收页面请求的JSON参数，并返回JSON格式的结果
     */
    @RequestMapping("/testJson")
    @ResponseBody
    // @RequestBody 注解用于将前端请求体中的 JSON 格式数据绑定到形参 user 上
    // @ResponseBody 注解用于直接返回 Person 对象（当返回 POJO 对象时默认转换为 JSON 格式数据进行响应）
    public User testJson(@RequestBody User user) {
        System.out.println("name = " + user.getName() + ",password=" + user.getPassword() + ",age=" + user.getAge());
        return user;
    }

    // Spring MVC拦截器（Interceptor）
    // 登录页面初始化
    @RequestMapping("/toLogin")
    public String initLogin() {
        return "login22";
    }

    // 处理登录功能
    @RequestMapping("/login22")
    public String login(User user, Model model, HttpSession session) {
        System.out.println(user.getName());
        if ("louis".equals(user.getName()) && "123456".equals(user.getPwd())) {
            // 登录成功，将用户信息保存到session对象中
            session.setAttribute("user", user);
            // 重定向到主页面的跳转方法
            return "redirect:main";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录！ ");
        return "login22";
    }

    // 跳转到主页面
    @RequestMapping("/main")
    public String toMain() {
        return "main";
    }

    // 退出登录
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // 清除 session
        session.invalidate();
        return "login22";
    }

    // Spring MVC数据校验
    // 下面 /addUser22 页面报错了，没去修复，暂时不深入研究了 ？？？
//    @RequestMapping("/validate")
//    public String validate(@Valid User user, BindingResult result) {
//        if (result.hasErrors()) {
//            List<ObjectError> errors = result.getAllErrors();
//            for (ObjectError error : errors) {
//                System.out.println(error.getDefaultMessage());
//            }
//        }
//
//        return "login22";
//    }
//
//    @RequestMapping(value="/addUser22")
//    public String add() {
//        return "addUser22";
//    }
}

// Spring MVC表单标签库
// 使用 EL 表达式和 JSTL 标签来完成页面视图的开发

// Spring MVC类型转换器（Converter）
// 类型转换是在视图与控制器相互传递数据时发生的。
//   创建实体类。
//   创建控制器类。
//   创建自定义类型转换器类。
//   注册类型转换器。
//   创建相关视图。

// Spring MVC数据格式化（Formatter）
//      Formatter 的源类型必须是 String 类型，而 Converter 的源类型可以是任意数据类型。
//      Formatter<T> 与 Converter<S, T> 一样，是一个可以将一种数据类型转换成另一种数据类型的接口
//      Formatter 更适合 Web 层，而 Converter 可以在任意层中。






