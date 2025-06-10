package com.atguigu.mvc.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName: ParamController
 * Package: com.atguigu.mvc.controlller
 * Description:
 *
 * @Author ljy
 * @Create 2025. 6. 10. 오후 4:04
 * @Version 1.0
 */
@Controller
public class ParamController {

    @RequestMapping("/testServletAPI")
    // 形参位置的request表示当前请求
    public String testServletAPI(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username: " + username + ", password: " + password);
        return "success";
    }
}
