package com.atguigu.mvc.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username: " + username + ", password: " + password);
        return "success";
    }

    @RequestMapping("/testParam")
    // 若请求参数中出现多个同名的请求参数，可以在控制器方法的形参位置设置字符串类型或字符串数组接收此请求参数
    // 若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号进行拼接
    public String testParam(String username, String password, String[] hobby) {
        System.out.println("Controller param: username: " + username + ", password: " + password + ", hobby: " + Arrays.toString(hobby));
        return "success";
    }
}
