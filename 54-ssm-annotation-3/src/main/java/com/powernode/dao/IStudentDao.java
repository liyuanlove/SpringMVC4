package com.powernode.dao;

import org.apache.ibatis.annotations.Insert;

import com.powernode.po.Student;

public interface IStudentDao {

    @Insert("insert into student(name, age) values (#{name}, #{age})")
    void insertStudent(Student student);

}
