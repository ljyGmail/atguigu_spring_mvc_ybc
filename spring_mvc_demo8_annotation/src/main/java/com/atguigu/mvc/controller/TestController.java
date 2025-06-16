package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

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

    @RequestMapping("/testException")
    public String testException() {
        System.out.println(1 / 0);
        return "hello";
    }

    @RequestMapping("/testUpload")
    public String testUp(MultipartFile photo, HttpSession session) throws IOException {
        // 获取上传文件的文件名
        String fileName = photo.getOriginalFilename();
        // 获取上传文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        // 将UUID作为文件名
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        // 将uuid和后缀名拼接后的结果作为最终的文件名
        fileName = uuid + suffixName;
        // 通过ServletContext获取服务器中photo目录的路径
        ServletContext servletContext = session.getServletContext();
        String photoPath = servletContext.getRealPath("photo");
        File dir = new File(photoPath);
        // 判断photoPath所对应的路径是否存在
        if (!dir.exists()) {
            // 若不存在，则创建目录
            dir.mkdir();
        }
        String finalPath = photoPath + File.separator + fileName;
        photo.transferTo(new File(finalPath));
        return "hello";
    }
}
