package com.zhou.blogeurekaconsumer.service;

import com.zhou.bean.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    public User getUser(String userName, String password,HttpServletRequest request);

}
