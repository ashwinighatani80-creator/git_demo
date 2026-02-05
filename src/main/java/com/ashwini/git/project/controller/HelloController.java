package com.ashwini.git.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String ashwini() {
        return "Hello Ashwini";
    }

@GetMapping("/namaste")
public String  ashwini2()
{
    return "namste Ashwini";
}
}

