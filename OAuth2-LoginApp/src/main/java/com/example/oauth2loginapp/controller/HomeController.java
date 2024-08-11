package com.example.oauth2loginapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello Public!";
    }

    @GetMapping("/secure")
    public String secure(){
        return "Hello Secure!";
    }
}
