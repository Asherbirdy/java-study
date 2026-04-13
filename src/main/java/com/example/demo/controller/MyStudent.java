package com.example.demo.controller;

import com.example.demo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyStudent {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public String insert(@RequestBody Student student) {
        int id = studentService.insert(student);
        return "insert success, id: " + id;
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId) {
        studentService.delete(studentId);
        return "delete";
    }

    @PostMapping("/students/batch")
    public String insertList(@RequestBody List<Student> studentList) {
        studentService.batchInsert(studentList);
        return "insert list";
    }

    @GetMapping("/students/{studentId}")
    public Student select(@PathVariable Integer studentId) {
        return studentService.getById(studentId);
    }
}
