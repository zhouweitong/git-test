package com.zhou.housestenancy.service.impl;

import com.zhou.housestenancy.bean.House;
import com.zhou.housestenancy.mapper.HouseMapper;
import com.zhou.housestenancy.service.HouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class HouseServiceImpl implements HouseService {
    @Resource
    private HouseMapper houseMapper;

    @Override
    public List<House> getHouse(Integer houseLeaseState, Integer currentPage, Integer pageSize) {
        Integer start = null;
        if(pageSize!=null){
            start = (currentPage-1)*pageSize;
        }
        return this.houseMapper.get(houseLeaseState,start,pageSize);
    }

    @Override
    public List<House> getHouseByEvery(House house, Integer currentPage, Integer pageSize) {
        Integer start = null;
        if(pageSize!=null){
            start = (currentPage-1)*pageSize;
        }
        return this.houseMapper.getHouse(house,start,pageSize);
    }

    @Override
    public int addHouse(House house) {
        return this.houseMapper.save(house);
    }

    @Override
    public int updateHouse(Integer houseId, String housePublishTime) {
        return this.houseMapper.update(houseId,housePublishTime);
    }
}
