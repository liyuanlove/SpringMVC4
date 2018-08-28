package com.powernode.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping("/myAjax.do")
    public void doAjax(String name, int age, HttpServletResponse response) throws IOException {
        Map<String, Object> map = new HashMap<>();
        map.put("pname", name);
        map.put("page", age);

        String jsonStr = JSONObject.toJSON(map).toString();
        PrintWriter out = response.getWriter();
        out.print(jsonStr);
        out.close();
    }

}
