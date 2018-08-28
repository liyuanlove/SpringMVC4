package com.powernode.service;

import org.springframework.stereotype.Service;

import com.powernode.po.Student;

@Service("studentService")
public interface IStudentService {

    void addStudent(Student student);

}
