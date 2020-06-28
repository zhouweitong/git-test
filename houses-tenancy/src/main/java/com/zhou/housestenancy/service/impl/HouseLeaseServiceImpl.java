package com.zhou.housestenancy.service.impl;

import com.zhou.housestenancy.bean.HouseLease;
import com.zhou.housestenancy.mapper.HouseLeaseMapper;
import com.zhou.housestenancy.service.HouseLeaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class HouseLeaseServiceImpl implements HouseLeaseService {

    @Resource
    private HouseLeaseMapper houseLeaseMapper;

    @Override
    public List<HouseLease> getHouseMsg(Integer currentPage , Integer pageSize) {
        Integer start = (currentPage-1)*pageSize;
        return this.houseLeaseMapper.list(start,pageSize);
    }

    @Override
    public HouseLease getHouseLease(Integer houseLeaseId) {
        return this.houseLeaseMapper.get(houseLeaseId);
    }

    @Override
    public int addHouseLease(HouseLease houseLease) {
        return this.houseLeaseMapper.save(houseLease);
    }

    @Override
    public int deleteHouseLease(Integer houseLeaseId) {
        return this.houseLeaseMapper.delete(houseLeaseId);
    }

    @Override
    public int updateHouseLease(HouseLease houseLease) {
        return this.houseLeaseMapper.update(houseLease);
    }
}
