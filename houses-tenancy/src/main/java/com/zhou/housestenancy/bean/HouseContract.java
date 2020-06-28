package com.zhou.housestenancy.bean;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class HouseContract{
    //id
    private Integer houseContractId;
    //合同编号
    private String houseContractNo;
    //合同签订日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date houseContractSignDate;
    //结束日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date houseContractEndDate;
    //租赁房id
    private Integer houseContractUserId;
    //备注
    private String houseContractRemarks;
    //合同模板
    private String houseContractTemplate;

    public Integer getHouseContractId(){
        return houseContractId;
    }
    public String getHouseContractNo(){
        return houseContractNo;
    }
    public Date getHouseContractSignDate(){
        return houseContractSignDate;
    }
    public Date getHouseContractEndDate(){
        return houseContractEndDate;
    }
    public Integer getHouseContractUserId(){
        return houseContractUserId;
    }
    public String getHouseContractRemarks(){
        return houseContractRemarks;
    }
    public String getHouseContractTemplate(){
        return houseContractTemplate;
    }
    public void setHouseContractId(Integer houseContractId){
        this.houseContractId=houseContractId;
    }
    public void setHouseContractNo(String houseContractNo){
        this.houseContractNo=houseContractNo;
    }
    public void setHouseContractSignDate(Date houseContractSignDate){
        this.houseContractSignDate=houseContractSignDate;
    }
    public void setHouseContractEndDate(Date houseContractEndDate){
        this.houseContractEndDate=houseContractEndDate;
    }
    public void setHouseContractUserId(Integer houseContractUserId){
        this.houseContractUserId=houseContractUserId;
    }
    public void setHouseContractRemarks(String houseContractRemarks){
        this.houseContractRemarks=houseContractRemarks;
    }
    public void setHouseContractTemplate(String houseContractTemplate){
        this.houseContractTemplate=houseContractTemplate;
    }

}