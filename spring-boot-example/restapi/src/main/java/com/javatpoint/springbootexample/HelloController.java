package com.javatpoint.springbootexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Kubernetes!";
    }
}