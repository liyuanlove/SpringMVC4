package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.powernode.po.Student;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/myAjax.do")
    @ResponseBody
    public Object doAjax() {
        return new Student("张三", 23);
    }

}
