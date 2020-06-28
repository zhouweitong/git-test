package com.zhou.guest.bean;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class GuestRecord {
    //id
    private Integer guestRecordId;
    //房屋信息id
    private Integer guestRecordHouseId;
    //用户id
    private Integer guestRecordUserId;
    //客户姓名
    private String guestRecordGuestName;
    //客户电话
    private String guestRecordGuestTel;
    //承诺方id
    private Integer guestRecordTenantryId;
    //看房时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date guestRecordSeeTime;
    //客户提出的问题
    private String guestRecordQuestion;

    public GuestRecord() {
    }

    public GuestRecord(Integer guestRecordHouseId, Integer guestRecordUserId, String guestRecordGuestName, String guestRecordGuestTel, Integer guestRecordTenantryId, Date guestRecordSeeTime, String guestRecordQuestion) {
        this.guestRecordHouseId = guestRecordHouseId;
        this.guestRecordUserId = guestRecordUserId;
        this.guestRecordGuestName = guestRecordGuestName;
        this.guestRecordGuestTel = guestRecordGuestTel;
        this.guestRecordTenantryId = guestRecordTenantryId;
        this.guestRecordSeeTime = guestRecordSeeTime;
        this.guestRecordQuestion = guestRecordQuestion;
    }

    public GuestRecord(Integer guestRecordId, Integer guestRecordHouseId, Integer guestRecordUserId, String guestRecordGuestName, String guestRecordGuestTel, Integer guestRecordTenantryId, Date guestRecordSeeTime, String guestRecordQuestion) {
        this.guestRecordId = guestRecordId;
        this.guestRecordHouseId = guestRecordHouseId;
        this.guestRecordUserId = guestRecordUserId;
        this.guestRecordGuestName = guestRecordGuestName;
        this.guestRecordGuestTel = guestRecordGuestTel;
        this.guestRecordTenantryId = guestRecordTenantryId;
        this.guestRecordSeeTime = guestRecordSeeTime;
        this.guestRecordQuestion = guestRecordQuestion;
    }

    public Integer getGuestRecordId() {
        return guestRecordId;
    }

    public void setGuestRecordId(Integer guestRecordId) {
        this.guestRecordId = guestRecordId;
    }

    public Integer getGuestRecordHouseId() {
        return guestRecordHouseId;
    }

    public void setGuestRecordHouseId(Integer guestRecordHouseId) {
        this.guestRecordHouseId = guestRecordHouseId;
    }

    public Integer getGuestRecordUserId() {
        return guestRecordUserId;
    }

    public void setGuestRecordUserId(Integer guestRecordUserId) {
        this.guestRecordUserId = guestRecordUserId;
    }

    public String getGuestRecordGuestName() {
        return guestRecordGuestName;
    }

    public void setGuestRecordGuestName(String guestRecordGuestName) {
        this.guestRecordGuestName = guestRecordGuestName;
    }

    public String getGuestRecordGuestTel() {
        return guestRecordGuestTel;
    }

    public void setGuestRecordGuestTel(String guestRecordGuestTel) {
        this.guestRecordGuestTel = guestRecordGuestTel;
    }

    public Integer getGuestRecordTenantryId() {
        return guestRecordTenantryId;
    }

    public void setGuestRecordTenantryId(Integer guestRecordTenantryId) {
        this.guestRecordTenantryId = guestRecordTenantryId;
    }

    public Date getGuestRecordSeeTime() {
        return guestRecordSeeTime;
    }

    public void setGuestRecordSeeTime(Date guestRecordSeeTime) {
        this.guestRecordSeeTime = guestRecordSeeTime;
    }

    public String getGuestRecordQuestion() {
        return guestRecordQuestion;
    }

    public void setGuestRecordQuestion(String guestRecordQuestion) {
        this.guestRecordQuestion = guestRecordQuestion;
    }
}
