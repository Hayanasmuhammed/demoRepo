package com.example.demo_first.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String printName(String name) {
        return "hello" + name;
    }
}
