package com.demo.cucumber_spring.service;

import org.springframework.stereotype.Service;

@Service
public class UserInfoImpl implements UserInfoService {

    @Override
    public String authenticate(String username, String password) {

       if(username.equals("validUsername") && password.equals("validPassword")) {
           return "Welcome!";
       }

       return "Check your credentials!";
    }

}