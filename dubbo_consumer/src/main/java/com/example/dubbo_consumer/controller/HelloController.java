package com.example.dubbo_consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference //该注解是dubbo提供的
    private UserService userService;

    @GetMapping("/")
    public String hello(String name) {
        String s = userService.sayHello(name);
        return s;
    }
}
