package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/some.do")
    public String doSome() {
        //视图对象名称
        return "taobao";
    }

}
