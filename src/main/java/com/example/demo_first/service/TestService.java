package com.example.demo_first.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_first.model.SignUpReq;
import com.example.demo_first.model.SignUpUser;
import com.example.demo_first.model.UserSignUpRepository;

@Service
public class TestService {

    @Autowired
    private UserSignUpRepository userSignUpRepository;

    public String signUpAUser(SignUpReq req) {
        UUID uuid = UUID.randomUUID();
        SignUpUser user = new SignUpUser(uuid.toString(), req.getFirstName(), req.getLastName(), req.getEmail(),
                req.getPhoneNumber(), req.getPassword());
        userSignUpRepository.save(user);
        return "signUp completed";
    }
}
