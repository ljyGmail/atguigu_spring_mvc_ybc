package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: TestController
 * Package: com.atguigu.mvc.controller
 * Description:
 *
 * @Author ljy
 * @Create 2025. 6. 16. 오전 11:42
 * @Version 1.0
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
