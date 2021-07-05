package com.example.springboottestproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Springboot hello world";
    }

    @GetMapping("/test")
    public String testPage() {
        return "Another test page";
    }

}
