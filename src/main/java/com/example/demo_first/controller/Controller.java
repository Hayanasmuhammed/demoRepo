package com.example.demo_first.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_first.model.OrderProducer;
import com.example.demo_first.model.SignUpReq;
import com.example.demo_first.service.TestService;

@RestController
public class Controller {
    @Autowired
    TestService testService;

    @Autowired
    OrderProducer orderProducer;

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @PostMapping("/v1/user/signup")
    public String getMethodName(@RequestBody SignUpReq req) {
        logger.info("sign up of a user request recieved");
        return testService.signUpAUser(req);
    }

    @PostMapping("/v1/send")
    public String postMethodName(@RequestBody String message) {
        // TODO: process POST request
        orderProducer.sendMessage(message);
        return message + " published";
    }

}
