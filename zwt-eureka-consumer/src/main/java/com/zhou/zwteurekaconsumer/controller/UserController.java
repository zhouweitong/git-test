package com.zhou.zwteurekaconsumer.controller;

import com.zhou.zwteurekaconsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username,String password){
        String result = this.userService.login(username, password);
        return "consumer-"+result;
    }



}
