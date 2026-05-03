package com.example.Spring_Sec_Demo.controller;

import com.example.Spring_Sec_Demo.model.Student;
import com.example.Spring_Sec_Demo.model.User;
import com.example.Spring_Sec_Demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("register")
    public User Register(@RequestBody User user){
        service.saveUser(user);
        return user;
    }

    @GetMapping("user")
    public List<User> getAllStudentRedirect(){

        return service.getUsers();
    }

}
