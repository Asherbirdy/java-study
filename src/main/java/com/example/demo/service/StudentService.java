package com.example.demo.service;

import com.example.demo.Student;

import java.util.List;

public interface StudentService {

    Student getById(Integer studentId);

    int insert(Student student);

    void delete(Integer studentId);

    void batchInsert(List<Student> studentList);
}
