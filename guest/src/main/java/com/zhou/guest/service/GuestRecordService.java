package com.zhou.guest.service;

import com.zhou.guest.bean.GuestRecord;

import java.util.List;

public interface GuestRecordService {
    GuestRecord get(Integer id);

    List<GuestRecord> list();

    void add(GuestRecord guestRecord);

    void update(GuestRecord guestRecord);

    void delete(Integer id);

}
