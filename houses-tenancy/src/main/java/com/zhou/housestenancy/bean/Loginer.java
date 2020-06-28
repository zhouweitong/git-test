package com.zhou.housestenancy.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Loginer implements Serializable{
    //id
    private Integer loginerId;
    //登录名
    private String loginerName;
    //密码
    private String loginerPassword;
    //角色id
    private Integer loginerRoleId;
    //用户id
    private Integer loginerUserId;
    //登录时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date loginerLoginTime;
    //是否是租客
    private Integer loginerIsRenter;

    public Integer getLoginerId(){
        return loginerId;
    }
    public String getLoginerName(){
        return loginerName;
    }
    public String getLoginerPassword(){
        return loginerPassword;
    }
    public Integer getLoginerRoleId(){
        return loginerRoleId;
    }
    public Integer getLoginerUserId(){
        return loginerUserId;
    }
    public Date getLoginerLoginTime(){
        return loginerLoginTime;
    }
    public Integer getLoginerIsRenter(){
        return loginerIsRenter;
    }
    public void setLoginerId(Integer loginerId){
        this.loginerId=loginerId;
    }
    public void setLoginerName(String loginerName){
        this.loginerName=loginerName;
    }
    public void setLoginerPassword(String loginerPassword){
        this.loginerPassword=loginerPassword;
    }
    public void setLoginerRoleId(Integer loginerRoleId){
        this.loginerRoleId=loginerRoleId;
    }
    public void setLoginerUserId(Integer loginerUserId){
        this.loginerUserId=loginerUserId;
    }
    public void setLoginerLoginTime(Date loginerLoginTime){
        this.loginerLoginTime=loginerLoginTime;
    }
    public void setLoginerIsRenter(Integer loginerIsRenter){
        this.loginerIsRenter=loginerIsRenter;
    }

}