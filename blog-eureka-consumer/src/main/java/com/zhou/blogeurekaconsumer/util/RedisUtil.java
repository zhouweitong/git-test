package com.zhou.blogeurekaconsumer.util;

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
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        User user = JSON.parseObject(valueOperations.get(key), User.class);
        return user;
    }
}
