package com.zhou.housestenancy.controller;

import com.zhou.housestenancy.bean.HouseContract;
import com.zhou.housestenancy.service.HouseContractService;
import com.zhou.housestenancy.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/houseContract")
public class HouseContractController {
    @Autowired
    private HouseContractService houseContractService;
    @RequestMapping("/addHouseContract")
    public int addHouseContract(HouseContract houseContract) throws Exception {
        return this.houseContractService.addHouseContract(houseContract);
    }

    @RequestMapping("/updateHouseContract")
    public int updateHouseContract(HouseContract houseContract) {
        return this.houseContractService.updateHouseContract(houseContract);
    }

    @RequestMapping("/getHouseContract")
    public List<HouseContract> getHouseContract(@RequestParam(value = "houseContractId",required = false) Integer houseContractId) {
        return this.houseContractService.getHouseContract(houseContractId);
    }

    @RequestMapping("/deleteHouseContract")
    public int deleteHouseContract(Integer houseContractId) {
        return this.houseContractService.deleteHouseContract(houseContractId);
    }
}
