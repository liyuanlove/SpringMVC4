package com.powernode.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.powernode.editor.MyDateEditor;

@Controller
@RequestMapping("/test")
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

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new MyDateEditor());
    }

}
