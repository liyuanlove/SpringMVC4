package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public ModelAndView doRegister(String name, int age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("pname", name);
        mv.addObject("page", age);
        mv.setViewName("redirect:/welcome.jsp");
        return mv;
    }

}
