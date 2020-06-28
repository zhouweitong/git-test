package com.zhou.housestenancy.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class GuestRecord{
    //
    private Integer guestRecordId;
    //房屋信息id
    private Integer guestRecordHouseId;
    //用户id
    private Integer guestRecordUserId;
    //客户姓名
    private String guestRecordGuestName;
    //客户电话
    private String guestRecordGuestTel;
    //承租方id（带客户看房的人）
    private Integer guestRecordTenantryId;
    //看房时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date guestRecordSeeTime;
    //客户提出问题
    private String guestRecordQuestion;

    public Integer getGuestRecordId(){
        return guestRecordId;
    }
    public Integer getGuestRecordHouseId(){
        return guestRecordHouseId;
    }
    public Integer getGuestRecordUserId(){
        return guestRecordUserId;
    }
    public String getGuestRecordGuestName(){
        return guestRecordGuestName;
    }
    public String getGuestRecordGuestTel(){
        return guestRecordGuestTel;
    }
    public Integer getGuestRecordTenantryId(){
        return guestRecordTenantryId;
    }
    public Date getGuestRecordSeeTime(){
        return guestRecordSeeTime;
    }
    public String getGuestRecordQuestion(){
        return guestRecordQuestion;
    }
    public void setGuestRecordId(Integer guestRecordId){
        this.guestRecordId=guestRecordId;
    }
    public void setGuestRecordHouseId(Integer guestRecordHouseId){
        this.guestRecordHouseId=guestRecordHouseId;
    }
    public void setGuestRecordUserId(Integer guestRecordUserId){
        this.guestRecordUserId=guestRecordUserId;
    }
    public void setGuestRecordGuestName(String guestRecordGuestName){
        this.guestRecordGuestName=guestRecordGuestName;
    }
    public void setGuestRecordGuestTel(String guestRecordGuestTel){
        this.guestRecordGuestTel=guestRecordGuestTel;
    }
    public void setGuestRecordTenantryId(Integer guestRecordTenantryId){
        this.guestRecordTenantryId=guestRecordTenantryId;
    }
    public void setGuestRecordSeeTime(Date guestRecordSeeTime){
        this.guestRecordSeeTime=guestRecordSeeTime;
    }
    public void setGuestRecordQuestion(String guestRecordQuestion){
        this.guestRecordQuestion=guestRecordQuestion;
    }

}