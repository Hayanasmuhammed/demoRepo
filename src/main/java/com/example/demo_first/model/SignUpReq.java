package com.example.demo_first.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SignUpReq {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;

}
