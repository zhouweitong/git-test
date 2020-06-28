package com.zhou.test;

import com.zhou.util.RedisUtil;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        RedisUtil redisUtil= (RedisUtil)beanFactory.getBean("redisUtil");
        //redisUtil.set("name","tom");
        String name = redisUtil.get("name");
        System.out.println(name);


    }
}
