package com.powernode.service.impl;

import com.powernode.dao.IStudentDao;
import com.powernode.po.Student;
import com.powernode.service.IStudentService;

public class StudentServiceImpl implements IStudentService {

    private IStudentDao dao;

    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public void addStudent(Student student) {
        dao.insertStudent(student);

    }

}
