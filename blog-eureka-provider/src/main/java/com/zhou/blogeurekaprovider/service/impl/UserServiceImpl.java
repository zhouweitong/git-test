package com.zhou.blogeurekaprovider.service.impl;

import com.zhou.bean.User;
import com.zhou.blogeurekaprovider.mapper.UserMapper;
import com.zhou.blogeurekaprovider.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
   @Resource
    private UserMapper userMapper;

    @Override
    public User getUser(String userName, String password) {
        return this.userMapper.get(userName,password);
    }
}
