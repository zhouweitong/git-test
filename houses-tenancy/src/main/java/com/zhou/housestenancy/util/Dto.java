package com.zhou.housestenancy.util;

import java.util.List;

public class Dto<T> {
    private String token;

    private T t;

    private List<T> list;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
