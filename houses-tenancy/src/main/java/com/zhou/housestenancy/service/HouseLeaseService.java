package com.zhou.housestenancy.service;

import com.zhou.housestenancy.bean.HouseLease;

import java.util.List;

public interface HouseLeaseService {
    List<HouseLease> getHouseMsg(Integer currentPage , Integer pageSize);

    HouseLease getHouseLease(Integer houseLeaseId);

    int addHouseLease(HouseLease houseLease);

    int deleteHouseLease(Integer houseLeaseId);

    int updateHouseLease(HouseLease houseLease);
}
