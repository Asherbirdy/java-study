package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
    @RequestMapping("/test1")
    public String test1(@RequestParam Integer id,
                        @RequestParam(defaultValue = "123122") String name){
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        return "Hello test1";
    }

    @RequestMapping("/test2")
    public String test2(@RequestBody Student student){
        System.out.println("student id:" + student.getId());
        System.out.println("student id: " + student.getName());
        return "Hello test2";
    }

    @RequestMapping("/test4/{id}/{name}")
    public String test4(@PathVariable Integer id,
                        @PathVariable String name){
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        return "test4";
    }

}
