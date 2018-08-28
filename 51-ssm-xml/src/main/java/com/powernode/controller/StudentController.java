package com.powernode.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.powernode.po.Student;
import com.powernode.service.IStudentService;

public class StudentController implements Controller {

    private IStudentService service;

    public void setService(IStudentService service) {
        this.service = service;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        Integer age = Integer.valueOf(ageStr);

        Student student = new Student(name, age);
        service.addStudent(student);

        return new ModelAndView("/welcome.jsp");
    }

}
