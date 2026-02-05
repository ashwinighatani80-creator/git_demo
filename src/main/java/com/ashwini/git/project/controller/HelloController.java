package com.ashwini.git.project.controller;
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String ashwini()
    {
        return "Hello Ashwini";
    }
}
