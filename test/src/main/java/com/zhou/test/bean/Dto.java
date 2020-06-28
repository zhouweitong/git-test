package com.zhou.test.bean;

import java.io.Serializable;

public class Dto implements Serializable{
    private String token;

    private Long tokenCreateDate;

    private Long tokenExpiryDate;

    private String isLogin;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getTokenCreateDate() {
        return tokenCreateDate;
    }

    public void setTokenCreateDate(Long tokenCreateDate) {
        this.tokenCreateDate = tokenCreateDate;
    }

    public Long getTokenExpiryDate() {
        return tokenExpiryDate;
    }

    public void setTokenExpiryDate(Long tokenExpiryDate) {
        this.tokenExpiryDate = tokenExpiryDate;
    }

    public String getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(String isLogin) {
        this.isLogin = isLogin;
    }
}
