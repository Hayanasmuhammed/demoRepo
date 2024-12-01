package com.example.demo_first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_first.service.TestService;

@RestController
public class Controller {
    @Autowired
    TestService testService;

    @GetMapping("/v1/test/{name}")
    public String getMethodName(@PathVariable("name") String name) {

        return testService.printName(name);
    }

}
