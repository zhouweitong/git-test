package com.zhou.housestenancy.service;

import com.zhou.housestenancy.bean.House;

import java.util.List;

public interface HouseService {
    List<House> getHouse(Integer houseLeaseState,Integer currentPage,Integer pageSize);

    List<House> getHouseByEvery(House house,Integer currentPage,Integer pageSize);

    int addHouse(House house);

    int updateHouse(Integer houseId,String housePublishTime);
}
