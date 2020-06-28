package com.zhou.housestenancy.mapper;

import com.zhou.housestenancy.bean.House;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
@Component
public interface HouseMapper {
    public List<House> get(@Param("houseLeaseState") Integer houseLeaseState, @Param("start")Integer start ,
                           @Param("size")Integer size);

    List<House>getHouse(@Param("house")House house,@Param("start")Integer start,@Param("size")Integer size);

    int save(House house);

    int update(@Param("houseId") Integer houseId, @Param("housePublishTime") String housePublishTime);
    
}
