package com.zhou;

import redis.clients.jedis.Jedis;

public class Test {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.233.128");
        jedis.auth("123456");
        jedis.set("name","zhou");
        String name = jedis.get("name");
        System.out.println(name);

    }
}
