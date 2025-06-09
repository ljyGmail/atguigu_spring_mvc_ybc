package com.atguigu.mvc.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMappingController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
