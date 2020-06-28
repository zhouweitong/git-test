package com.zhou.housestenancy.bean;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class User{
    //id
    private Integer userId;
    //姓名
    private String userName;
    //性别 1 男 2 女
    private Integer userGender;
    //生日
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userBirthday;
    //身份证号
    private String userIdNumber;
    //现住址
    private String userAddress;
    //个人相片地址
    private String userPicturePath;
    //籍贯
    private String userNativePlace;
    //联系电话
    private String userTel;
    //注册时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userRegistTime;
    //是否激活
    private Integer userState;

    public User() {
    }

    public User(String userName, Integer userGender, Date userBirthday, String userIdNumber, String userAddress, String userPicturePath, String userNativePlace, String userTel, Date userRegistTime, Integer userState) {
        this.userName = userName;
        this.userGender = userGender;
        this.userBirthday = userBirthday;
        this.userIdNumber = userIdNumber;
        this.userAddress = userAddress;
        this.userPicturePath = userPicturePath;
        this.userNativePlace = userNativePlace;
        this.userTel = userTel;
        this.userRegistTime = userRegistTime;
        this.userState = userState;
    }

    public User(Integer userId, String userName, Integer userGender, Date userBirthday, String userIdNumber, String userAddress, String userPicturePath, String userNativePlace, String userTel, Date userRegistTime, Integer userState) {
        this.userId = userId;
        this.userName = userName;
        this.userGender = userGender;
        this.userBirthday = userBirthday;
        this.userIdNumber = userIdNumber;
        this.userAddress = userAddress;
        this.userPicturePath = userPicturePath;
        this.userNativePlace = userNativePlace;
        this.userTel = userTel;
        this.userRegistTime = userRegistTime;
        this.userState = userState;
    }

    public Integer getUserId(){
        return userId;
    }
    public String getUserName(){
        return userName;
    }
    public Integer getUserGender(){
        return userGender;
    }
    public Date getUserBirthday(){
        return userBirthday;
    }
    public String getUserIdNumber(){
        return userIdNumber;
    }
    public String getUserAddress(){
        return userAddress;
    }
    public String getUserPicturePath(){
        return userPicturePath;
    }
    public String getUserNativePlace(){
        return userNativePlace;
    }
    public String getUserTel(){
        return userTel;
    }
    public Date getUserRegistTime(){
        return userRegistTime;
    }
    public Integer getUserState(){
        return userState;
    }
    public void setUserId(Integer userId){
        this.userId=userId;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setUserGender(Integer userGender){
        this.userGender=userGender;
    }
    public void setUserBirthday(Date userBirthday){
        this.userBirthday=userBirthday;
    }
    public void setUserIdNumber(String userIdNumber){
        this.userIdNumber=userIdNumber;
    }
    public void setUserAddress(String userAddress){
        this.userAddress=userAddress;
    }
    public void setUserPicturePath(String userPicturePath){
        this.userPicturePath=userPicturePath;
    }
    public void setUserNativePlace(String userNativePlace){
        this.userNativePlace=userNativePlace;
    }
    public void setUserTel(String userTel){
        this.userTel=userTel;
    }
    public void setUserRegistTime(Date userRegistTime){
        this.userRegistTime=userRegistTime;
    }
    public void setUserState(Integer userState){
        this.userState=userState;
    }

}