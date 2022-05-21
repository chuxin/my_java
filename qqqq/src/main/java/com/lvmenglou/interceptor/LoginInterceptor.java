package com.lvmenglou.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        // 下面这两个 url 请求，不做拦截
        if (url.indexOf("/toLogin") >= 0 || url.indexOf("/login22") >= 0) {
            return true;
        }
        if (url != null) {
            return true;
        }
        // 获取 session
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("user");
        if (obj != null) {
            return true;
        }
        // 这里是其它情况，跳转到登陆页面，并给出提示
        request.setAttribute("msg", "还没登陆，请先登录");
        request.getRequestDispatcher("/WEB-INF/pages/login22.jsp").forward(request, response);
        return false;
    }

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception {

    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {

    }
}
