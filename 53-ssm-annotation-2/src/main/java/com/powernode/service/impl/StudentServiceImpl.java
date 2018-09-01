package com.powernode.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.powernode.dao.IStudentDao;
import com.powernode.po.Student;
import com.powernode.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

//    @Autowired
//    @Qualifier("IStudentDao")
    @Resource(name = "IStudentDao")
    private IStudentDao dao;

    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }

    @Transactional
    @Override
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }

}
