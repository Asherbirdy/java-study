package com.example.demo.dao;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentDao {

    Student getById(Integer studentId);

    int insert(Student student);

    void delete(Integer studentId);

    void batchInsert(List<Student> studentList);
}
