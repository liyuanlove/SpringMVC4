package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.powernode.exception.AgeException;
import com.powernode.exception.NameException;
import com.powernode.exception.StudentException;

@Controller
@RequestMapping("/test")
public class MyController extends BaseController {

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public ModelAndView doRegister(String name, int age) throws StudentException {
//        int i = 3 / 0;

        if (!"beijing".equals(name)) {
            throw new NameException("用户名不正确");
        }
        if (age > 60) {
            throw new AgeException("年龄太大了");
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

}
