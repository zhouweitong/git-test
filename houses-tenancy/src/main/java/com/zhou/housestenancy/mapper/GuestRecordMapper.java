package com.zhou.housestenancy.mapper;

import com.zhou.housestenancy.bean.GuestRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface GuestRecordMapper {

    List<GuestRecord> get();

    int delete(@Param("guestRecordId") Integer guestRecordId);

    int save(GuestRecord guestRecord);
}
