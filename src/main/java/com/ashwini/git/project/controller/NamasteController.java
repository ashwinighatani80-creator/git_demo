package com.ashwini.git.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NamasteController {

        @GetMapping("/hello")
        public String ashwini() {
            return "Hello Ashwini";
        }

    }
