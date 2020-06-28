package com.zhou.housestenancy.controller;

import com.zhou.housestenancy.bean.GuestRecord;
import com.zhou.housestenancy.service.GuestRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/guestRecord")
public class GuestRecordController {
    @Autowired
    private GuestRecordService guestRecordService;

    @RequestMapping("/getGuestRecordAll")
    public List<GuestRecord> getGuestRecordAll() {
        return this.guestRecordService.getGuestRecordAll();
    }

    @RequestMapping("/deleteGuestRecord")
    public int deleteGuestRecord(Integer guestRecordId) {
        return this.guestRecordService.deleteGuestRecord(guestRecordId);
    }

    @PostMapping("/addGuestRecord")
    public int addGuestRecord(GuestRecord guestRecord) {
        return this.guestRecordService.addGuestRecord(guestRecord);
    }
}
