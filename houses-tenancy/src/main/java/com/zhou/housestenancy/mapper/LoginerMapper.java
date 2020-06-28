package com.zhou.housestenancy.mapper;

import com.zhou.housestenancy.bean.Loginer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface LoginerMapper {
    Loginer get(@Param("userName") String userName , @Param("password") String password);

    int update (@Param("loginerRoleId") Integer loginerRoleId , @Param("loginerUserId") Integer loginerUserId);
    
}
