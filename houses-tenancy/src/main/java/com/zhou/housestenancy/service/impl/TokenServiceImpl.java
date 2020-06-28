package com.zhou.housestenancy.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zhou.housestenancy.bean.Loginer;
import com.zhou.housestenancy.service.TokenService;
import com.zhou.housestenancy.util.RedisUtil;

import nl.bitwalker.useragentutils.UserAgent;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;

@Service
public class TokenServiceImpl implements TokenService{
    @Resource
    private RedisUtil redisUtil;

    public String generateToken(String userAgentStr,String username){
        StringBuilder token = new StringBuilder("token:");
        UserAgent userAgent = UserAgent.parseUserAgentString(userAgentStr);
        if(userAgent.getOperatingSystem().isMobileDevice()){
            token.append("MOBILE-");
        }else{
            token.append("PC-");
        }
        token.append(DigestUtils.md5Hex(username)+"-");
        token.append(new Random().nextInt(999999-111111+1)+111111);
        System.out.println(token);
        return token.toString();

    }

    public void save(String token, Loginer loginer){
        redisUtil.setex(token, JSONObject.toJSONString(loginer),1000*60*60);
    }

}
