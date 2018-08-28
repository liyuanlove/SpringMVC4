package com.powernode.controller;

import java.util.Date;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public ModelAndView doRegister(int age, Date birthday) {
        System.out.println("age = " + age);
        System.out.println("birthday = " + birthday);

        ModelAndView mv = new ModelAndView();
        mv.addObject("age", age);
        mv.addObject("birthday", birthday);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @ExceptionHandler(TypeMismatchException.class)
    public ModelAndView ExceptionResolver(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/index.jsp");
        return mv;
    }

}
