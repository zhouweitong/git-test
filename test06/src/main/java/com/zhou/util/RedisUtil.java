package com.zhou.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisUtil {
    private JedisPool jedisPool ;

    public JedisPool getJedisPool() {
        return jedisPool;
    }

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }
    public void set(String key,String value){
        Jedis jedis = this.jedisPool.getResource();
        jedis.set(key,value);
        this.jedisPool.returnResource(jedis);
    }

    public void setex(String key,int seconds,String value){
        Jedis jedis = this.jedisPool.getResource();
        jedis.setex(key,seconds,value);
        this.jedisPool.returnResource(jedis);

    }
    public String get(String key){
        String value = null;
        Jedis jedis = this.jedisPool.getResource();
        value = jedis.get(key);
        this.jedisPool.returnResource(jedis);
        return value;
    }

    public boolean exists(String key){
        Jedis jedis = this.jedisPool.getResource();
        Boolean exists = jedis.exists(key);
        this.jedisPool.returnResource(jedis);
        return exists;
    }

    public Long ttl(String key){
        Jedis jedis = this.jedisPool.getResource();
        Long ttl = jedis.ttl(key);
        this.jedisPool.returnResource(jedis);
        return ttl;
    }

    public void del(String key){
        Jedis jedis = this.jedisPool.getResource();
        jedis.del(key);
        this.jedisPool.returnResource(jedis);
    }

}
