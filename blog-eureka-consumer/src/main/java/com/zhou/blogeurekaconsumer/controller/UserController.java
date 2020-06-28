package com.zhou.blogeurekaconsumer.controller;

import com.zhou.bean.BlogDetail;
import com.zhou.bean.User;
import com.zhou.blogeurekaconsumer.service.BlogServiceDetail;
import com.zhou.blogeurekaconsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public User getUser(String userName, String password, HttpServletRequest request) {
        return userService.getUser(userName,password,request);
    }

}
