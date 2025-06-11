package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * ClassName: ScopeController
 * Package: com.atguigu.mvc.controller
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 6. 11. 오후 3:13
 * @Version 1.0
 */
@Controller
public class ScopeController {

    // 使用ServletAPI向request域对象共享数据
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request) {
        request.setAttribute("testRequestScope", "hello, servletAPI");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView mav = new ModelAndView();
        // 处理模型数据，即向请求域request共享数据
        mav.addObject("testRequestScope", "hello, ModelAndView");
        // 设置视图名称
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model) {
        model.addAttribute("testRequestScope", "hello, Model");
        System.out.println("@@@ " + model.getClass().getName());
        return "success";
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("testRequestScope", "hello, Map");
        System.out.println("### " + map.getClass().getName());
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap) {
        modelMap.addAttribute("testRequestScope", "hello, ModelMap");
        System.out.println("$$$ " + modelMap.getClass().getName());
        return "success";
    }
}
