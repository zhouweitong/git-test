package com.zhou.housestenancy.service.impl;

import com.zhou.housestenancy.bean.User;
import com.zhou.housestenancy.mapper.UserMapper;
import com.zhou.housestenancy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getUser(String userName,
                              Integer userId,
                              String userTel,
                              String userAddress,
                              Integer userGender,
                              Integer currentPage,
                              Integer pageSize) {
        Integer start = null;
        if(pageSize!=null){
            start = (currentPage-1)*pageSize;
        }
        return this.userMapper.getUser(userName,userId,userTel,userAddress,userGender,start,pageSize);
    }

    @Override
    public int addUser(User user) {
        return this.userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return this.userMapper.update(user);
    }
}
