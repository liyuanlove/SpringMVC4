package com.powernode.controller;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Student> map = new HashMap<>();
        map.put("stu1", new Student("张三", 23));
        map.put("stu2", new Student("李四", 24));
        return map;
    }

}
