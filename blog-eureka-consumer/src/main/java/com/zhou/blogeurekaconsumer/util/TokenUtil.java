package com.zhou.blogeurekaconsumer.util;

import com.alibaba.fastjson.JSONObject;
import com.zhou.bean.User;
import nl.bitwalker.useragentutils.UserAgent;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Random;
@Component
public class TokenUtil {
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

    public void save(String token,User user){
        redisUtil.setex(token, JSONObject.toJSONString(user),1000*60*60);
        System.out.println(JSONObject.toJSONString(user));
    }
}