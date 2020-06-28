package com.zhou.housestenancy.controller;

import com.zhou.housestenancy.bean.User;
import com.zhou.housestenancy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<User> getUser(@RequestParam(value = "userId",required = false)Integer userId,
                              @RequestParam(value = "userName",required = false)String userName,
                              @RequestParam(value = "userTel",required = false)String userTel,
                              @RequestParam(value = "userAddress",required = false)String userAddress,
                              @RequestParam(value = "userGender",required = false)Integer userGender,
                              @RequestParam(value = "currentPage",required = false)Integer currentPage,
                              @RequestParam(value = "pageSize",required = false)Integer pageSize) {
        return this.userService.getUser(userName,userId, userTel,userAddress,userGender,currentPage,pageSize);
    }


    @PostMapping("/addUser")
    public String addUser(User user) {
        String msg = null;
        user.setUserRegistTime(new Date());
        if(this.userService.addUser(user)==1){
            msg = "success";
        }else{
            msg = "error";
        }
        return msg;
    }
    @PostMapping("/updateUser")
    public String updateUser(User user) {
        String msg = null;
        user.setUserRegistTime(new Date());
        if(this.userService.updateUser(user)==1){
            msg = "success";
        }else{
            msg = "error";
        }
        return msg;
    }
}
