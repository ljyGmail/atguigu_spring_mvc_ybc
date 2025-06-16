package com.atguigu.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ClassName: ExceptionController
 * Package: com.atguigu.mvc.controller
 * Description:
 *
 * @Author ljy
 * @Create 2025. 6. 16. 오전 9:59
 * @Version 1.0
 */
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
    public String handleArithmeticException(Exception ex, Model model) {
        model.addAttribute("ex", ex);
        return "error";
    }
}
