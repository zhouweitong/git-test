package com.zhou.housestenancy.service;

import com.zhou.housestenancy.bean.HouseContract;

import java.util.List;

public interface HouseContractService {
    int addHouseContract (HouseContract houseContract)throws Exception;

    int updateHouseContract (HouseContract houseContract);

    List<HouseContract> getHouseContract(Integer houseContractId);

    int deleteHouseContract (Integer houseContractId);
}
