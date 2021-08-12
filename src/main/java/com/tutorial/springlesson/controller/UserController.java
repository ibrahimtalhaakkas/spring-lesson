package com.tutorial.springlesson.controller;

import com.tutorial.springlesson.model.User;
import com.tutorial.springlesson.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController           //It says this class contains some APIs
public class UserController {

    //@Autowired // field injection
    //private UserService userService;
    //
    //@Autowired // setter injection
    //public void  setInjection(UserService userService){
    //    this.userService = userService;
    //}
    private final UserService userService;

    @Autowired // Dependency injection
    // (P.S -> if you have only 1 constructor in a class, then you don`t need to add this @Autowired annotation)
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String mainPage() {
        return userService.getMainPageContent();
    }

    // CRUD -> create, read, update, delete
    @GetMapping("/user") //Read
    public User getUser() {
        return userService.getUser();
    }

//TODO: create an API that returns a userlist.
}


