package com.zhou.housestenancy.controller;

import com.zhou.housestenancy.bean.HouseLease;
import com.zhou.housestenancy.service.HouseLeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/houseLease")
public class HouseLeaseController {
    @Autowired
    private HouseLeaseService houseLeaseService;


    @GetMapping("/getHouseMsg")
    public List<HouseLease> getHouseMsg(Integer currentPage , Integer pageSize) {
        return this.houseLeaseService.getHouseMsg(currentPage,pageSize);
    }

    @GetMapping("/getHouseLease")
    public HouseLease getHouseLease(Integer houseLeaseId) {
        return houseLeaseService.getHouseLease(houseLeaseId);
    }

    @PostMapping("/addHouseLease")
    public int addHouseLease(HouseLease houseLease) {
        return this.houseLeaseService.addHouseLease(houseLease);
    }

    @PostMapping("/deleteHouseLease")
    public int deleteHouseLease(Integer houseLeaseId) {
        return this.houseLeaseService.deleteHouseLease(houseLeaseId);
    }

    @PostMapping("/updateHouseLease")
    public int updateHouseLease(HouseLease houseLease) {
        return this.houseLeaseService.updateHouseLease(houseLease);
    }
}
