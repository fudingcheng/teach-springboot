package com.itheima.controller;

import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private User person;

    @RequestMapping("/sayHello")
    public String sayHello(){
        System.out.println(person);
        return "hello world springboot";
    }
}
