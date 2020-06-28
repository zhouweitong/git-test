package com.zhou.housestenancy.mapper;

import com.zhou.housestenancy.bean.HouseContract;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface HouseContractMapper {
    int save (HouseContract houseContract);

    int update (HouseContract houseContract);

    List<HouseContract> list(@Param("houseContractId") Integer houseContractId);

    int delete (Integer houseContractId);
    
}
