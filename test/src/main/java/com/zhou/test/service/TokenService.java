package com.zhou.test.service;

import com.alibaba.fastjson.JSONObject;
import com.zhou.test.bean.User;
import com.zhou.test.util.RedisUtil;
import nl.bitwalker.useragentutils.UserAgent;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Service("tokenService")
public class TokenService {
    @Resource
    private RedisUtil redisUtil;

    public String generateToken(String userAgentStr,String username){
        StringBuilder token = new StringBuilder("token:");
        UserAgent userAgent = UserAgent.parseUserAgentString(userAgentStr);
        if (userAgent.getOperatingSystem().isMobileDevice()){
            token.append("MOBILE-");
        }else{
            token.append("PC-");
        }
        token.append(DigestUtils.md5Hex(username)+"-");
        //时间
        token.append(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())+"-");
        token.append(new Random().nextInt(999999-111111+1)+111111);
        System.out.println(token.toString());
        return token.toString();
    }

    public void saveToken(String token,User user){
        if (token.startsWith("token:PC")){
            redisUtil.setex(token,JSONObject.toJSONString(user),2*60*60);
        }else{
            redisUtil.set(token,JSONObject.toJSONString(user));
        }
    }

}
