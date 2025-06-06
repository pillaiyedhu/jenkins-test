package com.fab4.jenkinstestapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testMsg(){
        return "Test Jenkins Here";
    }

}
