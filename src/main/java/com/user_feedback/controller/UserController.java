package com.user_feedback.controller;

import com.user_feedback.entity.User;
import com.user_feedback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/get/{userName}")
    public  User findByUserName(@PathVariable String userName){
        return  userService.getByUsername(userName);
    }
    @PostMapping("/save")
    public User userRegister(@RequestBody User user){
    return   userService.register(user);
    }
}
