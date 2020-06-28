package com.zhou.housestenancy.service;

import com.zhou.housestenancy.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    public List<User> getUser(String userName,
                              Integer userId,
                              String userTel,
                              String userAddress,
                              Integer userGender,
                              Integer currentPage,
                              Integer PageSize);

    int addUser(User user);

    int updateUser(User user);

}
