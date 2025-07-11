package com.PracticeThink.controller;

import com.PracticeThink.entity.User;
import com.PracticeThink.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // return JSON formate data
@RequestMapping("/simpleUser")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
     public List<User> getAllUser(){
        return this.userService.getAllUsers();
     }
     @GetMapping("/username")
     public User getUser(String userName){
        return this.userService.getUser(userName);
     }
     @PostMapping("/")
     public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
     }
}
