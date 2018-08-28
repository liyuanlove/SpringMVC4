package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/myAjax.do")
    @ResponseBody//将返回的数据放入到响应体中
    public Object doAjax() {
        return 123.456;
    }

}
