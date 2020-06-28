package com.zhou.blogeurekaconsumer.service.impl;

import com.zhou.bean.User;
import com.zhou.blogeurekaconsumer.proxy.ProviderUserClient;
import com.zhou.blogeurekaconsumer.service.UserService;
import com.zhou.blogeurekaconsumer.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private ProviderUserClient providerUserClient;
    @Autowired
    private TokenUtil tokenUtil;

    @Override
    public User getUser(String userName, String password, HttpServletRequest request) {
        User user = null;
        user = providerUserClient.getUser(userName,password);
        if(user!=null){
            String userAgent = request.getHeader("user-agent");
            String token = tokenUtil.generateToken(userAgent, userName);
            tokenUtil.save(token,user);
        }
        return user;
    }
}
