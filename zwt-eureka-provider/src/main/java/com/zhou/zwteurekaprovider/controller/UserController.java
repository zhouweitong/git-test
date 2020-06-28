package com.zhou.zwteurekaprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public String login(@RequestParam("username") String username , @RequestParam("password") String password) {
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        System.out.println(port);
        return username + password;
    }
}
