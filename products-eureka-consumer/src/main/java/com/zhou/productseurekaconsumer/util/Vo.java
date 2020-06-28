package com.zhou.productseurekaconsumer.util;

import java.io.Serializable;
import java.util.List;

public class Vo<T> implements Serializable{
    private String state;

    private T t;

    private List<T> listT;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public List<T> getListT() {
        return listT;
    }

    public void setListT(List<T> listT) {
        this.listT = listT;
    }
}
