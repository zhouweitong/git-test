package com.zhou.housestenancy.mapper;

import com.zhou.housestenancy.bean.HouseLease;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HouseLeaseMapper {
    List<HouseLease> list(@Param("start") Integer start, @Param("size")Integer size);

    HouseLease get(@Param("houseLeaseId")Integer houseLeaseId);

    int save(HouseLease houseLease);

    int delete (@Param("houseLeaseId")Integer houseLeaseId);

    int update(HouseLease houseLease);


    
}
