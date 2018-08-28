package com.powernode.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

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
    public ModelAndView ExceptionResolver(HttpServletRequest request, Exception ex) {
        String age = request.getParameter("age");
        String birthday = request.getParameter("birthday");

        ModelAndView mv = new ModelAndView();

        //捕获到的异常信息
        String exmsg = ex.getMessage();
        if (exmsg.contains(age)) {
            mv.addObject("ageError", "年龄输入有误");
        }
        if (exmsg.contains(birthday)) {
            mv.addObject("birthdayError", "日期输入有误");
        }

        mv.addObject("age", age);
        mv.addObject("birthday", birthday);
        mv.setViewName("/index.jsp");
        return mv;
    }

}
