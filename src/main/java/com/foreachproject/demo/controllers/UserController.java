package com.foreachproject.demo.controllers;

import com.foreachproject.demo.models.User;
import com.foreachproject.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Iterable<User> getAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userService.find(id);
    }

    @PatchMapping
    public User updateUser(@RequestBody User user){
        return userService.save(user);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id){
         userService.delete(id);
    }
}
