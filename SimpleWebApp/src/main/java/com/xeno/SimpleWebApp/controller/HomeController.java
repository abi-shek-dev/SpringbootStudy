package com.xeno.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Hello Xeno" ;
    }

    @RequestMapping("/about")
    public String about(){
        return "You are Xeno";
    }

}
