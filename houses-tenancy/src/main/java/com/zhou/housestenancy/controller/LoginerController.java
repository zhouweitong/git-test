package com.zhou.housestenancy.controller;

import com.zhou.housestenancy.bean.Loginer;
import com.zhou.housestenancy.service.LoginerService;
import com.zhou.housestenancy.service.TokenService;
import com.zhou.housestenancy.util.Dto;
import com.zhou.housestenancy.util.RedisUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController()
@RequestMapping("/loginer")
public class LoginerController {
    @Autowired
    private LoginerService loginerService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/getLoginerByPassword")
    public Dto getLoginerByPassword(String userName, String password, HttpServletRequest request) {
        String realPassword = DigestUtils.md5Hex(password);
        Loginer loginer = null;
        Dto dto = new Dto();
        loginer = this.loginerService.getLoginerByPassword(userName,realPassword);
        if(loginer!=null){
            dto.setT(loginer);
            String userAgent = request.getHeader("user-agent");
            String token = this.tokenService.generateToken(userAgent, userName);
            this.tokenService.save(token,loginer);
            dto.setToken(token);
        }else{
            dto.setT("失败");
        }
        return dto;
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        String token = request.getHeader("token");
        this.redisUtil.logout(token);
        return "success";
    }

    @GetMapping("/permissions")
    public String permissions(HttpServletRequest request){
        String token = request.getHeader("token");
        String msg = null;
        Loginer loginer = this.redisUtil.get(token);
        if(loginer==null){
            msg = "未登录或超时";
        }else{
            if(loginer.getLoginerRoleId()==1){
                msg = "管理员";
            }else if (loginer.getLoginerRoleId()==2){
                msg = "用户";
            }else if (loginer.getLoginerRoleId()==3){
                msg = "超管";
            }
        }
        return  msg;
    }

    @PostMapping("/updateLoginer")
    public String updateLoginer(Integer loginerRoleId,
                               Integer loginerUserId) {
        String msg = null;
        if(this.loginerService.updateLoginer(loginerRoleId,loginerUserId)==1){
            msg = "success";
        }else{
            msg = "error";
        }
        return msg;
    }

}
