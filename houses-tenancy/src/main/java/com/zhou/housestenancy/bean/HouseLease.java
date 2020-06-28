package com.zhou.housestenancy.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class HouseLease{
    //
    private Integer houseLeaseId;
    //房屋id
    private Integer houseLeaseHouseId;
    //用户id
    private Integer houseLeaseUserId;
    //租赁期限
    private String houseLeaseTerm;
    //付款方式
    private Integer houseLeasePaymentMode;
    //押金
    private Integer houseLeaseDeposit;
    //总金额
    private Integer houseLeaseTotalAmount;
    //起始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date houseLeaseStartDate;
    //结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date houseLeaseEndDate;
    //合同图片路径
    private String houseLeaseContractPicturePath;
    //记录生成时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date houseLeaseCreatedDate;

    private House house;

    private User user;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getHouseLeaseId(){
        return houseLeaseId;
    }
    public Integer getHouseLeaseHouseId(){
        return houseLeaseHouseId;
    }
    public Integer getHouseLeaseUserId(){
        return houseLeaseUserId;
    }
    public String getHouseLeaseTerm(){
        return houseLeaseTerm;
    }
    public Integer getHouseLeasePaymentMode(){
        return houseLeasePaymentMode;
    }
    public Integer getHouseLeaseDeposit(){
        return houseLeaseDeposit;
    }
    public Integer getHouseLeaseTotalAmount(){
        return houseLeaseTotalAmount;
    }
    public Date getHouseLeaseStartDate(){
        return houseLeaseStartDate;
    }
    public Date getHouseLeaseEndDate(){
        return houseLeaseEndDate;
    }
    public String getHouseLeaseContractPicturePath(){
        return houseLeaseContractPicturePath;
    }
    public Date getHouseLeaseCreatedDate(){
        return houseLeaseCreatedDate;
    }
    public void setHouseLeaseId(Integer houseLeaseId){
        this.houseLeaseId=houseLeaseId;
    }
    public void setHouseLeaseHouseId(Integer houseLeaseHouseId){
        this.houseLeaseHouseId=houseLeaseHouseId;
    }
    public void setHouseLeaseUserId(Integer houseLeaseUserId){
        this.houseLeaseUserId=houseLeaseUserId;
    }
    public void setHouseLeaseTerm(String houseLeaseTerm){
        this.houseLeaseTerm=houseLeaseTerm;
    }
    public void setHouseLeasePaymentMode(Integer houseLeasePaymentMode){
        this.houseLeasePaymentMode=houseLeasePaymentMode;
    }
    public void setHouseLeaseDeposit(Integer houseLeaseDeposit){
        this.houseLeaseDeposit=houseLeaseDeposit;
    }
    public void setHouseLeaseTotalAmount(Integer houseLeaseTotalAmount){
        this.houseLeaseTotalAmount=houseLeaseTotalAmount;
    }
    public void setHouseLeaseStartDate(Date houseLeaseStartDate){
        this.houseLeaseStartDate=houseLeaseStartDate;
    }
    public void setHouseLeaseEndDate(Date houseLeaseEndDate){
        this.houseLeaseEndDate=houseLeaseEndDate;
    }
    public void setHouseLeaseContractPicturePath(String houseLeaseContractPicturePath){
        this.houseLeaseContractPicturePath=houseLeaseContractPicturePath;
    }
    public void setHouseLeaseCreatedDate(Date houseLeaseCreatedDate){
        this.houseLeaseCreatedDate=houseLeaseCreatedDate;
    }

}