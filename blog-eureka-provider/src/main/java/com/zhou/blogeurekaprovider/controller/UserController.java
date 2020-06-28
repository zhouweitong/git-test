package com.zhou.blogeurekaprovider.controller;

import com.zhou.bean.User;
import com.zhou.blogeurekaprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser" , method = RequestMethod.GET)
    public User getUser(@RequestParam("userName") String userName,@RequestParam("password") String password) {
        return this.userService.getUser(userName,password);
    }
}
