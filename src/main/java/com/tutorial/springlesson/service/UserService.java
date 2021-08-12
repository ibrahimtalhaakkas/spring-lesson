package com.tutorial.springlesson.service;


import com.tutorial.springlesson.model.User;
import org.springframework.stereotype.Service;

@Service // it contains @Component to be scanned
public class UserService {

    public String getMainPageContent() {
        return "Welcome!";
    }

    public User getUser() {
        return new User("Talha", "Akkas",26); }
}
