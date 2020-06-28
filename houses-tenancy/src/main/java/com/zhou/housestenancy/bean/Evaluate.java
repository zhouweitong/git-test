package com.zhou.housestenancy.bean;

public class Evaluate{
    //
    private Integer evaluateId;
    //家具名称
    private String evaluateFurnitureName;
    //家具估价
    private Integer evaluatePrice;

    public Integer getEvaluateId(){
        return evaluateId;
    }
    public String getEvaluateFurnitureName(){
        return evaluateFurnitureName;
    }
    public Integer getEvaluatePrice(){
        return evaluatePrice;
    }
    public void setEvaluateId(Integer evaluateId){
        this.evaluateId=evaluateId;
    }
    public void setEvaluateFurnitureName(String evaluateFurnitureName){
        this.evaluateFurnitureName=evaluateFurnitureName;
    }
    public void setEvaluatePrice(Integer evaluatePrice){
        this.evaluatePrice=evaluatePrice;
    }

}