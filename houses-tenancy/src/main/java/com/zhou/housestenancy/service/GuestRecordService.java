package com.zhou.housestenancy.service;

import com.zhou.housestenancy.bean.GuestRecord;

import java.util.List;

public interface GuestRecordService {

    List<GuestRecord> getGuestRecordAll();

    int deleteGuestRecord(Integer guestRecordId);

    int addGuestRecord(GuestRecord guestRecord);
}
