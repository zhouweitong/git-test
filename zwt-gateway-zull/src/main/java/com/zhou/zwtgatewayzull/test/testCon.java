package com.zhou.zwtgatewayzull.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class testCon {

    @Value("${name}")
    private String name;

    @RequestMapping("/test")
    public String test(){
        return name;

    }

}
