package com.zhou.guest.service.impl;

import com.zhou.guest.bean.GuestRecord;
import com.zhou.guest.mapper.GuestRecordMapper;
import com.zhou.guest.service.GuestRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("guestRecordService")
public class GuestRecordServiceImpl implements GuestRecordService{
    @Resource
    private GuestRecordMapper guestRecordMapper;

    @Override
    public GuestRecord get(Integer id) {
        return this.guestRecordMapper.get(id);
    }

    @Override
    public List<GuestRecord> list() {
        return this.guestRecordMapper.list();
    }

    @Override
    public void add(GuestRecord guestRecord) {
        this.guestRecordMapper.add(guestRecord);

    }

    @Override
    public void update(GuestRecord guestRecord) {
        this.guestRecordMapper.update(guestRecord);

    }

    @Override
    public void delete(Integer id) {
        this.guestRecordMapper.delete(id);

    }
}
