package com.zhou.housestenancy.bean;

public class Menu{
    //id
    private Integer menuId;
    //菜单名称
    private String menuName;
    //关联显示地址
    private String menuAddress;

    public Integer getMenuId(){
        return menuId;
    }
    public String getMenuName(){
        return menuName;
    }
    public String getMenuAddress(){
        return menuAddress;
    }
    public void setMenuId(Integer menuId){
        this.menuId=menuId;
    }
    public void setMenuName(String menuName){
        this.menuName=menuName;
    }
    public void setMenuAddress(String menuAddress){
        this.menuAddress=menuAddress;
    }

}