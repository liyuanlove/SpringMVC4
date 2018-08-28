package com.powernode.resolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.powernode.exception.AgeException;
import com.powernode.exception.NameException;

public class MyHandlerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/error/error.jsp");

        if (ex instanceof NameException) {
            //执行一些操作
            mv.setViewName("/error/nameError.jsp");
        }

        if (ex instanceof AgeException) {
            //执行一些操作
            mv.setViewName("/error/ageError.jsp");
        }

        return mv;
    }

}
