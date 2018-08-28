package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.powernode.po.Student;

@Controller
public class MyController {

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public ModelAndView doRegister(@Validated Student student, BindingResult br) {
        ModelAndView mv = new ModelAndView();

        int errorCount = br.getErrorCount();
        if (errorCount > 0) {
            FieldError nameError = br.getFieldError("name");
            FieldError scoreError = br.getFieldError("score");
            FieldError mobileError = br.getFieldError("mobile");

            if (nameError != null) {
                String nameErrorMessage = nameError.getDefaultMessage();
                mv.addObject("nameErrorMessage", nameErrorMessage);
            }
            if (scoreError != null) {
                String scoreErrorMessage = scoreError.getDefaultMessage();
                mv.addObject("scoreErrorMessage", scoreErrorMessage);
            }
            if (nameError != null) {
                String mobileErrorMessage = mobileError.getDefaultMessage();
                mv.addObject("mobileErrorMessage", mobileErrorMessage);
            }
        }

        mv.addObject("student", student);
        mv.setViewName("/index.jsp");
        return mv;
    }

}
