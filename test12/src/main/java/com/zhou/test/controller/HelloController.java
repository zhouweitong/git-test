package com.zhou.test.controller;

import com.zhou.test.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private User user;

    @RequestMapping("/hello")
    public String hello()throws Exception{
        return user.getUsername()+user.getPassword();
    }
}
