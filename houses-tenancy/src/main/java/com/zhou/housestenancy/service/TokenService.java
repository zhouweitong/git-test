package com.zhou.housestenancy.service;

import com.zhou.housestenancy.bean.Loginer;

public interface TokenService {
    String generateToken(String userAgentStr,String username);

    void save(String token, Loginer loginer);
}
