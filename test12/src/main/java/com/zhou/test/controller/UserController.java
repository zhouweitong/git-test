package com.zhou.test.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login(String username,String password) throws  Exception{
        Map<String, Object>map = new HashMap<>();
        //tom   123
        if("tom".equals(username) && "123".equals(password)){
            map.put("loginMsg","success");
        }else{
            map.put("loginMsg","fail");
        }
        return JSONObject.toJSONString(map);
    }
}
