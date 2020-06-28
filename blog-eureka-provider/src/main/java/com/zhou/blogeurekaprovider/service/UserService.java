package com.zhou.blogeurekaprovider.service;

import com.zhou.bean.User;

public interface UserService {
    User getUser(String userName , String password);
}
