package com.zhou.housestenancy.bean;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class House{
    //
    private Integer houseId;
    //面积
    private Integer houseArea;
    //楼层
    private Integer houseFloor;
    //朝向
    private String houseOrientations;
    //户型
    private String houseType;
    //是否有电梯
    private Integer houseElevator;
    //是否有阳台
    private Integer houseBalcony;
    //租金
    private Integer houseRent;
    //地址Id
    private Integer houseAddressId;
    //家具id
    private Integer houseFurnitureId;
    //发布时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date housePublishTime;
    //图片地址
    private String housePicturePath;
    //是否已租赁
    private Integer houseLeaseState;
    //装修程度0毛呸1简装2精装
    private Integer houseDecorationDegree;

    private HouseAddress houseAddress;

    public HouseAddress getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(HouseAddress houseAddress) {
        this.houseAddress = houseAddress;
    }

    public House() {
    }

    public House(Integer houseArea, Integer houseFloor, String houseOrientations, String houseType, Integer houseElevator, Integer houseBalcony, Integer houseRent, Integer houseLeaseState) {
        this.houseArea = houseArea;
        this.houseFloor = houseFloor;
        this.houseOrientations = houseOrientations;
        this.houseType = houseType;
        this.houseElevator = houseElevator;
        this.houseBalcony = houseBalcony;
        this.houseRent = houseRent;
        this.houseLeaseState = houseLeaseState;
    }

    public House(Integer houseId, Integer houseArea, Integer houseFloor, String houseOrientations, String houseType, Integer houseElevator, Integer houseBalcony, Integer houseRent, Integer houseAddressId, Integer houseFurnitureId, Date housePublishTime, String housePicturePath, Integer houseLeaseState, Integer houseDecorationDegree) {
        this.houseId = houseId;
        this.houseArea = houseArea;
        this.houseFloor = houseFloor;
        this.houseOrientations = houseOrientations;
        this.houseType = houseType;
        this.houseElevator = houseElevator;
        this.houseBalcony = houseBalcony;
        this.houseRent = houseRent;
        this.houseAddressId = houseAddressId;
        this.houseFurnitureId = houseFurnitureId;
        this.housePublishTime = housePublishTime;
        this.housePicturePath = housePicturePath;
        this.houseLeaseState = houseLeaseState;
        this.houseDecorationDegree = houseDecorationDegree;
    }

    public Integer getHouseId(){
        return houseId;
    }
    public Integer getHouseArea(){
        return houseArea;
    }
    public Integer getHouseFloor(){
        return houseFloor;
    }
    public String getHouseOrientations(){
        return houseOrientations;
    }
    public String getHouseType(){
        return houseType;
    }
    public Integer getHouseElevator(){
        return houseElevator;
    }
    public Integer getHouseBalcony(){
        return houseBalcony;
    }
    public Integer getHouseRent(){
        return houseRent;
    }
    public Integer getHouseAddressId(){
        return houseAddressId;
    }
    public Integer getHouseFurnitureId(){
        return houseFurnitureId;
    }
    public Date getHousePublishTime(){
        return housePublishTime;
    }
    public String getHousePicturePath(){
        return housePicturePath;
    }
    public Integer getHouseLeaseState(){
        return houseLeaseState;
    }
    public Integer getHouseDecorationDegree(){
        return houseDecorationDegree;
    }
    public void setHouseId(Integer houseId){
        this.houseId=houseId;
    }
    public void setHouseArea(Integer houseArea){
        this.houseArea=houseArea;
    }
    public void setHouseFloor(Integer houseFloor){
        this.houseFloor=houseFloor;
    }
    public void setHouseOrientations(String houseOrientations){
        this.houseOrientations=houseOrientations;
    }
    public void setHouseType(String houseType){
        this.houseType=houseType;
    }
    public void setHouseElevator(Integer houseElevator){
        this.houseElevator=houseElevator;
    }
    public void setHouseBalcony(Integer houseBalcony){
        this.houseBalcony=houseBalcony;
    }
    public void setHouseRent(Integer houseRent){
        this.houseRent=houseRent;
    }
    public void setHouseAddressId(Integer houseAddressId){
        this.houseAddressId=houseAddressId;
    }
    public void setHouseFurnitureId(Integer houseFurnitureId){
        this.houseFurnitureId=houseFurnitureId;
    }
    public void setHousePublishTime(Date housePublishTime){
        this.housePublishTime=housePublishTime;
    }
    public void setHousePicturePath(String housePicturePath){
        this.housePicturePath=housePicturePath;
    }
    public void setHouseLeaseState(Integer houseLeaseState){
        this.houseLeaseState=houseLeaseState;
    }
    public void setHouseDecorationDegree(Integer houseDecorationDegree){
        this.houseDecorationDegree=houseDecorationDegree;
    }

}