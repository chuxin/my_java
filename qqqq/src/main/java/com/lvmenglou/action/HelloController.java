package com.lvmenglou.action;

import com.lvmenglou.entity.User;
import com.lvmenglou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
    // @Autowired 注解属于 org.springframework.beans.factory. annotation 包，可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作
    // @Service 注解属于 org.springframework.stereotype 包，会将标注类自动注册到 Spring 容器中。
    //    @Service 要加载 UserServiceImpl 上面，不能加在 UserService 上面，否则无效报错
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/sayHello")
    public String sayHello(){
        System.out.println("hello");
        return "success";
    }

    @RequestMapping(value = "/testcc")
    public ModelAndView testCC() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("username", "lalalala");
        mv.setViewName("testcc");
        return mv;
    }

    @RequestMapping("/login")
    public String getLogin(Model model) {
        User userObj = new User();
        userObj.setName("我是谁");
        userObj.setPwd("12345");
        userService.login(userObj);
        model.addAttribute("userObj", userObj);
        return "login";
    }

    @RequestMapping("/register")
    public String getRegister(Model model) {
        User userObj = new User();
        userObj.setName("bbbbb");
        userObj.setPwd("23456");
        Boolean res = userService.register(userObj);
        if (res) {
            model.addAttribute("userObj", userObj);
            return "register";
        } else {
            return "forward:/";
        }
    }

//     ①
//     转发是将用户对当前处理的请求转发给另一个视图或处理请求，以前的 request 中存放的信息不会失效。
//     重定向是将用户从当前处理请求定向到另一个视图（例如 JSP）或处理请求，以前的请求（request）中存放的信息全部失效，并进入一个新的 request 作用域；
//     ②
//     转发是服务器行为，重定向是客户端行为
//     ③
//     客户浏览器发送 http 请求，Web 服务器接受此请求，调用内部的一个方法在容器内部完成请求处理和转发动作，将目标资源发送给客户；在这里转发的路径必须是同一个 Web 容器下的 URL，其不能转向到其他的 Web 路径上，中间传递的是自己的容器内的 request。在客户浏览器的地址栏中显示的仍然是其第一次访问的路径，也就是说客户是感觉不到服务器做了转发的。转发行为是浏览器只做了一次访问请求。
//     客户浏览器发送 http 请求，Web 服务器接受后发送 302 状态码响应及对应新的 location 给客户浏览器，客户浏览器发现是 302 响应，则自动再发送一个新的 http 请求，请求 URL 是新的 location 地址，服务器根据此请求寻找资源并发送给客户。在这里 location 可以重定向到任意 URL，既然是浏览器重新发出了请求，那么就没有什么 request 传递的概念了。在客户浏览器的地址栏中显示的是其重定向的路径，客户可以观察到地址的变化。重定向行为是浏览器做了至少两次的访问请求。
    @RequestMapping("/test_forward")
    public String testForward() {
        return "forward:/hello/sayHello";
    }

    @RequestMapping("/test_redirect")
    public String testRedirect() {
        return "redirect:/hello/sayHello";
    }

    // 访问静态资源
//    http://localhost:8080/html/my.html
    // 配置方式
//    <!--开启springmvc注解的支持-->
//    <mvc:annotation-driven />
//    <mvc:resources location="/html/" mapping="/html/**"></mvc:resources>
    // 解释
//    location:指location指定的目录不要拦截，直接请求，这里指在根目录下的resources文件下的所有文件
//    mapping:指在resources目录下的所有文件(**代表所有文件)
//    所有意思就是在根目录下resources的所有文件不会被DispatcherServlet拦截，直接访问，当做静态资源交个Servlet处理

    // Spring MVC传递参数
    // 还没实践 ？？？？

    // @ModelAttribute
    // ① 应用在方法上
    // a.方法无返回值
//    @ModelAttribute
//    public void myModel(@RequestParam(required = false) String name, Model model) {
//        model.addAttribute("name", name);
//    }
//    @RequestMapping(value = "/model")
//    public String model() {
//        return "index";
//    }

    // b.方法有返回值
    @ModelAttribute
    public String myModel(@RequestParam(required = false) String name) {
        return name;
    }
    @RequestMapping(value = "/model")
    public String model() {
        return "index";
    }

    // ② 应用在方法的参数上 - 表单 和 实体进行绑定
    // 写法一
    @RequestMapping(value = "/model22")
    public String model22(Model model) {
        User user_xx = new User();
        model.addAttribute("user_xx", user_xx);
        return "model22";
    }
    // 写法二
    @RequestMapping(value = "/model33")
    public String model33(@ModelAttribute("user_xx") User user) {
        return "model22";
    }
    @RequestMapping("/saveUser")
    public String saveUser(User user) {
        if ("louis".equals(user.getName()) && "123456".equals(user.getPwd())) {
            return "success";
        } else {
            return "error";
        }
    }

    // ③ ModelAttribute + RequestMapping
    // 访问地址：http://localhost:8080/hello/model44?dddd=9999
    // 模板路径，模板名 和 访问地址一模一样
    @RequestMapping("/model44")
    @ModelAttribute("dddd")
    public String model44(@RequestParam(required = false) String dddd) {
        return dddd;
    }


    // Spring MVC异常处理
    @RequestMapping("/testExceptionHandle")
    // http://localhost:8080/hello/testExceptionHandle?i=1
    // http://localhost:8080/hello/testExceptionHandle?i=0
    public String testExceptionHandle(@RequestParam("i") Integer i) {
        System.out.println(10 / i);
        return "success";
    }

    @ExceptionHandler({ArithmeticException.class})
    public String testArithmeticException(Exception e) {
        System.out.println("打印错误信息 ===> ArithmeticException:" + e);
        return "error";
    }


    // Spring MVC REST风格
    @RequestMapping("/torest")
    public String torest() {
        return "rest";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String hello(@PathVariable Integer id) {
        System.out.println("test rest get: " + id);
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
    public String hello() {
        System.out.println("test POST:");
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String helloDelete(@PathVariable Integer id) {
        System.out.println("test rest delete:" + id);
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public String helloPUt(@PathVariable Integer id) {
        System.out.println("test rest put:" + id);
        return "success";
    }
}

/*
Controller注解
    @Controller 注解用于声明某类的实例是一个控制器。

RequestMapping注解
    一个控制器内有多个处理请求的方法，@RequestMapping 就负责将请求映射到对应的控制器方法上。
    使用 @RequestMapping 来完成映射，具体包括 4 个方面的信息项：请求 URL、请求参数、请求方法和请求头
    常用属性如下：
        value 属性
            @RequestMapping(value="toUser")     http://localhost:8080/toUser
            @RequestMapping(value="toUser/*")   http://localhost:8080/toUser/hahaha
        path属性
            path 属性和 value 属性都用来作为映射使用
        name属性
            相当于方法的注释，使方法更易理解。
        method属性
            用于表示该方法支持哪些 HTTP 请求。如果省略 method 属性，则说明该方法支持全部的 HTTP 请求。
            @RequestMapping(value = "toUser",method = RequestMethod.GET) 表示该方法只支持 GET 请求。
            @RequestMapping(value = "toUser",method = {RequestMethod.GET,RequestMethod.POST})，说明该方法同时支持 GET 和 POST 请求。
        params属性
            用于指定请求中规定的参数
            @RequestMapping(value = "toUser",params = "type")  请求中必须包含 type 参数时才能执行该请求。即 http://localhost:8080/toUser?type=xxx
            @RequestMapping(value = "toUser",params = "type=1")   请求中必须包含 type 参数，且 type 参数为 1 时才能够执行该请求。即 http://localhost:8080/toUser?type=1
        header属性
            请求中必须包含某些指定的 header 值
        consumers属性
            指定处理请求的提交内容类型（Content-Type），例如：application/json、text/html
        produces属性
            指定返回的内容类型，返回的内容类型必须是 request 请求头（Accept）中所包含的类型。
            @RequestMapping(value = "toUser",produces = "application/json,charset=utf-8")，表示返回 utf-8 编码。



 */