package com.zhou.bloggatewayzuul.util;

import com.alibaba.fastjson.JSON;
import com.zhou.bean.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class RedisUtil {
    @Resource
    private RedisTemplate<String,String> redisTemplate ;

    public void setex(String key,String value,int second){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key,value,second);
    }

    public User get(String key){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        User user = JSON.parseObject(valueOperations.get(key), User.class);
        System.out.println(valueOperations.get(key));
        return user;
    }

    public boolean existKey(String key){
        User user = this.get(key);
        if(user==null){
            return false;
        }else{
            return true;
        }
    }
}
