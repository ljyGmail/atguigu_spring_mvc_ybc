package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: ViewController
 * Package: com.atguigu.mvc.controller
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 12. 오전 7:56
 * @Version 1.0
 */
@Controller
public class ViewController {

    @RequestMapping("/testThymeleafView")
    public String testThymeleafView() {
        return "success";
    }
}
