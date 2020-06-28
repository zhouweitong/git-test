package com.zhou.blogeurekaprovider.mapper;

import com.zhou.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User get(@Param("userName") String userName , @Param("password") String password);
}
