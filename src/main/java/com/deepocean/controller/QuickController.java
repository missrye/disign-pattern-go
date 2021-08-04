package com.deepocean.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController {

    @GetMapping("/quick")
    public String quick(){
        return "hello springboot.";
    }
}
