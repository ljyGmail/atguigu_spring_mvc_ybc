package com.atguigu.mvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName: TestInterceptor
 * Package: com.atguigu.mvc.interceptor
 * Description:
 *
 * @Author ljy
 * @Create 2025. 6. 16. 오전 11:50
 * @Version 1.0
 */
public class TestInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("TestInterceptor-->preHandle");
        return true;
    }
}
