package com.demo.cucumber_spring.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserInfo {

    private String username;
    private String password;

}
