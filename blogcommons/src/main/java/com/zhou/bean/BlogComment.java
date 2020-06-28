package com.zhou.bean;

import java.io.Serializable;
import java.util.Date;

public class BlogComment implements Serializable{
    private Integer id;

    private Integer blogId;

    private String content;

    private Integer createUser;

    private Date createDate;

    public BlogComment(Integer id, Integer blogId, String content, Integer createUser, Date createDate) {
        this.id = id;
        this.blogId = blogId;
        this.content = content;
        this.createUser = createUser;
        this.createDate = createDate;
    }

    public BlogComment(Integer blogId, String content, Integer createUser, Date createDate) {
        this.blogId = blogId;
        this.content = content;
        this.createUser = createUser;
        this.createDate = createDate;
    }

    public BlogComment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
