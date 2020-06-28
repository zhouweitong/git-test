package com.zhou.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private Integer id;

    private String userName;

    private String password;

    private Date createDate;

    public User() {
    }

    public User(Integer id, String userName, String password, Date createDate) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.createDate = createDate;
    }

    public User(String userName, String password, Date createDate) {
        this.userName = userName;
        this.password = password;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
