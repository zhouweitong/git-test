package com.zhou.boot.bean;

import org.springframework.stereotype.Component;

@Component
public class Grade {
    private Integer gradeid;

    private String gradename;

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public String getGradename() {
        return gradename;
    }

    public void setGradename(String gradename) {
        this.gradename = gradename;
    }
}
