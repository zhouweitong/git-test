package com.zhou.housestenancy.service;

import com.zhou.housestenancy.bean.Loginer;

public interface LoginerService {
    Loginer getLoginerByPassword(String userName , String password);


    int updateLoginer(Integer loginRoleId,Integer loginerUserId);
}
