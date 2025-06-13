package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: HttpController
 * Package: com.atguigu.mvc.controller
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 13. 오후 7:50
 * @Version 1.0
 */
@Controller
public class HttpController {

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println("requestBody: " + requestBody);
        return "success";
    }
}
