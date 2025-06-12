package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: JspController
 * Package: com.atguigu.mvc.controller
 * Description:
 *
 * @Author ljy
 * @Create 2025. 6. 12. 오전 9:49
 * @Version 1.0
 */
@Controller
public class JspController {

    @RequestMapping("/success")
    public String success() {
        return "success";
    }
}
