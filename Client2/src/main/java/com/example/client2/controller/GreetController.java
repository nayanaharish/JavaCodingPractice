package com.example.client2.controller;

import com.example.client2.service1.WelcomeApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @Autowired
    private WelcomeApi welcomeApi;

    @GetMapping("/greet")
    public String greet()
    {
        return welcomeApi.welcomeMessage() + "From greet";
    }
}
