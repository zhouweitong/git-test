package com.zhou.bean;

import java.io.Serializable;
import java.util.Date;

public class BlogDetail implements Serializable{
    private Integer id ;

    private String title;

    private String summary;

    private Integer createUser;

    private Date createDate;

    public BlogDetail() {
    }

    public BlogDetail(Integer id, String title, String summary, Integer createUser, Date createDate) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.createUser = createUser;
        this.createDate = createDate;
    }

    public BlogDetail(String title, String summary, Integer createUser, Date createDate) {
        this.title = title;
        this.summary = summary;
        this.createUser = createUser;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
