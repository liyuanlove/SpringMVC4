package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/some.do")
    public String doSome() {
        //逻辑视图
        return "welcome";
    }

}
