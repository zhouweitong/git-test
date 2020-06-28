package com.zhou.guest.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhou.guest.bean.GuestRecord;
import com.zhou.guest.service.GuestRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/guest")
public class GuestRecordController {
    @Autowired
    private GuestRecordService guestRecordService;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @RequestMapping("/get")
    public String get(Integer id) {
        GuestRecord guestRecord = this.guestRecordService.get(id);
        Map<String,Object> map = new HashMap<>();
        String format = simpleDateFormat.format(guestRecord.getGuestRecordSeeTime());
        map.put("guestDate",format);
        map.put("guest",guestRecord);
        return JSONObject.toJSONString(map);
    }

    @RequestMapping("/list")
    public String list() {
        List<GuestRecord> list = this.guestRecordService.list();
        List<String> dates = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        for(GuestRecord guestRecord:list){
            Date guestRecordSeeTime = guestRecord.getGuestRecordSeeTime();
            String format = simpleDateFormat.format(guestRecordSeeTime);
            dates.add(format);
        }
        map.put("guest",list);
        map.put("guestDate",dates);
        System.out.println(JSONObject.toJSONString(map));
        return JSONObject.toJSONString(map);
    }

    @RequestMapping("/add")
    public String add(GuestRecord guestRecord) {
        Map<String,String> map = new HashMap<>();
        this.guestRecordService.add(guestRecord);
        map.put("msg","success");
        return JSONObject.toJSONString(map);
    }

    @RequestMapping("/update")
    public String update(GuestRecord guestRecord) {
        Map<String,String> map = new HashMap<>();
        this.guestRecordService.update(guestRecord);
        map.put("msg","success");
        return JSONObject.toJSONString(map);

    }

    @RequestMapping("/delete")
    public String delete(Integer id) {
        Map<String,String> map = new HashMap<>();
        this.guestRecordService.delete(id);
        map.put("msg","success");
        return JSONObject.toJSONString(map);
    }
}
