package com.zhou.housestenancy.bean;

public class HouseAddress{
    //
    private Integer houseAddressId;
    //地址
    private String address;
    //描述信息
    private String info;

    public Integer getHouseAddressId(){
        return houseAddressId;
    }
    public String getAddress(){
        return address;
    }
    public String getInfo(){
        return info;
    }
    public void setHouseAddressId(Integer houseAddressId){
        this.houseAddressId=houseAddressId;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setInfo(String info){
        this.info=info;
    }

}