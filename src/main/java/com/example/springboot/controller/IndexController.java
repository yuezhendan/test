package com.example.springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {


    @GetMapping
    public String getIndex(){
        return "hello spring boot2222";
    }


}
