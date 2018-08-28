package com.powernode.controller;

import java.util.ArrayList;
import java.util.List;

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
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三", 23));
        list.add(new Student("李四", 24));
        return list;
    }

}
