package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @PostMapping("/students")
    public String create(@RequestBody Student student) {
        return "Create";
    }

    @GetMapping("/students/{studentId}")
    public String get(@PathVariable Integer studentId){
        return  "Get";
    }

    @PutMapping("/students/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student){
        return "update";
    }

    @DeleteMapping("/students/{studentId}")
    public  String delete(@PathVariable Integer studentId){
        return "delete";
    }
}
