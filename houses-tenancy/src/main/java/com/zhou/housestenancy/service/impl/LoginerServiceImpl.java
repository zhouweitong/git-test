package com.zhou.housestenancy.service.impl;

import com.zhou.housestenancy.bean.Loginer;
import com.zhou.housestenancy.mapper.LoginerMapper;
import com.zhou.housestenancy.service.LoginerService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class LoginerServiceImpl implements LoginerService {
    @Resource
    private LoginerMapper loginerMapper;
    @Override
    public Loginer getLoginerByPassword(String userName, String password) {
        return this.loginerMapper.get(userName,password);
    }

    @Override
    public int updateLoginer(Integer loginRoleId, Integer loginerUserId) {
        return this.loginerMapper.update(loginRoleId,loginerUserId);
    }
}
