package com.zhou.housestenancy.util;

import com.alibaba.fastjson.JSON;
import com.zhou.housestenancy.bean.Loginer;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RedisUtil {
    @Resource
    private RedisTemplate<String,String> redisTemplate;

    public void setex(String key,String value,int second){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key,value,second);
    }

    public Loginer get(String key){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        Loginer loginer = JSON.parseObject(valueOperations.get(key), Loginer.class);
        return loginer;
    }

    public void logout(String token){
        redisTemplate.delete(token);
    }

}
