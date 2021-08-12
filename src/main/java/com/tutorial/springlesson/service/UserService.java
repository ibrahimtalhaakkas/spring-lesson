package com.tutorial.springlesson.service;


import org.springframework.stereotype.Service;

@Service // it contains @Component to be scanned
public class UserService {

    public String getMainPageContent() {
        return "Welcome!";
    }

    public String getSayHelloContent() {
        return "Say Hello :)";
    }
}
