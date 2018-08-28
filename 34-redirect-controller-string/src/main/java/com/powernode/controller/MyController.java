package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class MyController {

    //http://127.0.0.1:8080/34-redirect-controller-string/test/register.do
    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public String doRegister(String name, int age, Model model) {
        model.addAttribute("pname", name);
        model.addAttribute("page", age);

        //http://127.0.0.1:8080/34-redirect-controller-string/other.do
//        return "redirect:/other.do";

        //http://127.0.0.1:8080/34-redirect-controller-string/test/other.do
        return "redirect:other.do";
    }

    //http://127.0.0.1:8080/34-redirect-controller-string/test/other.do
    @RequestMapping("/other.do")
    public String doOther(String pname, int page) {
        System.out.println("pname = " + pname);
        System.out.println("page = " + page);
        return "/welcome.jsp";
    }

}
