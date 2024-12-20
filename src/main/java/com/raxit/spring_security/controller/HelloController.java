package com.raxit.spring_security.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {

    @GetMapping("/")
    public String greet() {
        return "Welcome to Telusko";
    }

}
