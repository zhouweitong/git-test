package com.zhou.test.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {
    private RedisTemplate<String,String> redisTemplate;

    public void set(String key,String value){
        ValueOperations<String ,String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key,value);
    }

    public void setex(String key,String value,long seconds){
        ValueOperations<String ,String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value, seconds);
    }

}
