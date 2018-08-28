package com.powernode.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller//表示当前类是一个处理器
@RequestMapping("/test")//命名空间
public class MyController {

    @RequestMapping(value = "/first.do", method = RequestMethod.POST)
    public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "执行doFirst()方法");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping(value = "/second.do", params = {"name", "!age"})
    public ModelAndView doSecond(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "执行doSecond()方法");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/third*.do")//资源名称必须以third开头
    public ModelAndView doThird(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "执行doThird()方法");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/*fourth.do")//资源名称必须以fourth结尾
    public ModelAndView doFourth(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "执行doFourth()方法");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/*/fifth.do")//路径级数的绝对匹配，即要求在test与fifth.do之间必须要有一级路径
    public ModelAndView doFifth(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "执行doFifth()方法");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/**/sixth.do")//要求在test与sixth.do之间可以包含多级路径，也可以没有其他路径
    public ModelAndView doSixth(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "执行doSixth()方法");
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

}
