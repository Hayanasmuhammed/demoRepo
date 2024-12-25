package com.example.demo_first.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserSignUpRepository extends MongoRepository<SignUpUser, String> {

}
