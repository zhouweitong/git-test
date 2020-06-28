package com.zhou.housestenancy.mapper;

import com.zhou.housestenancy.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> getUser(@Param(value = "userName") String userName,
                       @Param(value = "userId") Integer userId,
                       @Param("userTel")String userTel,
                       @Param("userAddress")String userAddress,
                       @Param("userGender")Integer userGender,
                       @Param("start")Integer start,
                       @Param("size")Integer size);

    int addUser(User user);

    int update(User user);

}
