package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.powernode.exception.AgeException;
import com.powernode.exception.NameException;

@Controller
public class BaseController {

    /**
     * 处理NameException
     */
    @ExceptionHandler(NameException.class)
    public ModelAndView handlerNameException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/error/nameError.jsp");
        return mv;
    }

    /**
     * 处理AgeException
     */
    @ExceptionHandler(AgeException.class)
    public ModelAndView handlerAgeException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/error/ageError.jsp");
        return mv;
    }

    /**
     * 处理其他异常
     */
    @ExceptionHandler
    public ModelAndView handlerException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/error/error.jsp");
        return mv;
    }

}
