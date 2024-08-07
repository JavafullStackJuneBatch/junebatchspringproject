package com.example.junebatchspringproject.controller;

import com.example.junebatchspringproject.entity.User1;
import com.example.junebatchspringproject.services.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user1")
public class User1Controller {
    @Autowired
     User1Service user1Service;
    @PostMapping("/createUser1")
    public User1 createUser(@RequestBody User1 user){
        return user1Service.createUser(user);
    }
}
