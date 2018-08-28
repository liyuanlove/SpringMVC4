package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping(value = "/myAjax.do", produces = "text/html;charset=utf-8")
    @ResponseBody
    public Object doAjax() {
        return "China北京";
    }

}
