package com.zhou.guest.mapper;

import com.zhou.guest.bean.GuestRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GuestRecordMapper {
    GuestRecord get(@Param("id") Integer id);

    List<GuestRecord> list();

    void add (GuestRecord guestRecord);

    void update(GuestRecord guestRecord);

    void delete(@Param("id")Integer id);
}
