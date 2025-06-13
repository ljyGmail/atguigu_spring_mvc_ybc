package com.atguigu.mvc.controller;

import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        // 当前requestEntity表示整个请求报文的信息
        System.out.println("请求头: " + requestEntity.getHeaders());
        System.out.println("请求体: " + requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().println("hello, response");
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }
}
