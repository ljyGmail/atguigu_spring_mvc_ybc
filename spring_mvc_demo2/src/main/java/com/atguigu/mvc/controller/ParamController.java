package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

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
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username: " + username + ", password: " + password);
        return "success";
    }

    @RequestMapping("/testParam")
    // 若请求参数中出现多个同名的请求参数，可以在控制器方法的形参位置设置字符串类型或字符串数组接收此请求参数
    // 若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号进行拼接
    public String testParam(@RequestParam(value = "user_name", required = false, defaultValue = "SpringBoot") String username,
                            String password,
                            String[] hobby,
                            @RequestHeader(value = "sayHaha", required = true, defaultValue = "haha") String host,
                            @CookieValue("JSESSIONID") String jSessionId) {
        System.out.println("Controller param: username: " + username + ", password: " + password + ", hobby: " + Arrays.toString(hobby));
        System.out.println("Host in header: " + host);
        System.out.println("JSESSIONID in Cookie: " + jSessionId);
        return "success";
    }

    @RequestMapping("/testPOJO")
    public String testPOJO(User user) {
        System.out.println(user);
        return "success";
    }
}
