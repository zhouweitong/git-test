package com.zhou.test.service;

import com.zhou.test.bean.User;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    public User login(String username, String password){
        if("tom".equals(username)&&"123".equals(password)){//登陆成功
            return new User(1,username,password);
        }else{//登陆失败
            return null;
        }
    }
}
