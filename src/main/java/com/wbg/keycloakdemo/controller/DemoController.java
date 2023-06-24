package com.wbg.keycloakdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoController {

    @GetMapping("/hello-1")
    public String hello1(){
        return "Anyone can access";
    }

    @GetMapping("/hello-2")
    public String hello2(){
        return "ADMIN can access";
    }

    @GetMapping("/hello-3")
    public String hello3(){
        return "USER can access";
    }

    @GetMapping("/hello-4")
    public String hello4(){
        return "ADMIN/ USER can access";
    }
}
