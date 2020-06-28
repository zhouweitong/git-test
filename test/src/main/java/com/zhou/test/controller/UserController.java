package com.zhou.test.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhou.test.bean.Dto;
import com.zhou.test.bean.User;
import com.zhou.test.service.TokenService;
import com.zhou.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private TokenService tokenService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(String username, String password, HttpServletRequest request)throws Exception{
        Dto dto = new Dto();
        User user = this.userService.login(username, password);
        if(user!=null){//登陆成功
            String userAgentStr = request.getHeader("user-agent");
            String token = this.tokenService.generateToken(userAgentStr, username);
            this.tokenService.saveToken(token,user);

            dto.setToken(token);
            dto.setTokenCreateDate(System.currentTimeMillis());
            dto.setTokenExpiryDate(System.currentTimeMillis() + 2*60*60*1000);
            dto.setIsLogin("true");
        }else{
            dto.setIsLogin("false");
        }
        System.out.println(JSONObject.toJSONString(dto));
        return JSONObject.toJSONString(dto);
    }


}
