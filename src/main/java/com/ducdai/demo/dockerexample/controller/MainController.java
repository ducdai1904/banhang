package com.ducdai.demo.dockerexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class MainController {

    @GetMapping("/home")
    public String homeView(){
        String abc;
        abc="abc";
        return "home";
    }
}
