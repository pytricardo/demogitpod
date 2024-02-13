package com.example.demogitpod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
