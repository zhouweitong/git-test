package com.zhou.housestenancy.bean;

public class Role{
    //id
    private Integer roleId;
    //角色名称
    private String roleName;

    public Integer getRoleId(){
        return roleId;
    }
    public String getRoleName(){
        return roleName;
    }
    public void setRoleId(Integer roleId){
        this.roleId=roleId;
    }
    public void setRoleName(String roleName){
        this.roleName=roleName;
    }

}