package com.zhou.housestenancy.service.impl;


import com.zhou.housestenancy.bean.GuestRecord;
import com.zhou.housestenancy.mapper.GuestRecordMapper;
import com.zhou.housestenancy.service.GuestRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GuestRecordServiceImpl implements GuestRecordService{
    @Resource
    private GuestRecordMapper guestRecordMapper;
    @Override
    public List<GuestRecord> getGuestRecordAll() {
        return this.guestRecordMapper.get();
    }

    @Override
    public int deleteGuestRecord(Integer guestRecordId) {
        return this.guestRecordMapper.delete(guestRecordId);
    }

    @Override
    public int addGuestRecord(GuestRecord guestRecord) {
        return this.guestRecordMapper.save(guestRecord);
    }
}
