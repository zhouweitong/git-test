package com.zhou.zwteurekaconsumer.service.impl;

import com.zhou.zwteurekaconsumer.proxy.ProviderUserControllerClient;
import com.zhou.zwteurekaconsumer.proxy.impl.ProviderUserControllerClientImpl;
import com.zhou.zwteurekaconsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private ProviderUserControllerClient providerUserControllerClient;

    @Override
    public String login(String username, String password) {
        return providerUserControllerClient.login(username,password);
    }
}
