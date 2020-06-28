package com.zhou.housestenancy.controller;

import com.zhou.housestenancy.bean.House;
import com.zhou.housestenancy.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
@RestController
@RequestMapping("/house")
public class HouseController {
    @Autowired
    private HouseService houseService;


    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @GetMapping("/getHouse")
    public List<House> getHouse(@RequestParam(value = "houseLeaseState",required = false) Integer houseLeaseState,
                                @RequestParam(value = "currentPage",required = false)Integer currentPage,
                                @RequestParam(value = "pageSize",required = false)Integer pageSize) {
        return this.houseService.getHouse(houseLeaseState,currentPage,pageSize);
    }

    @GetMapping("/getHouseByEvery")
    public List<House> getHouseByEvery(House house,
                                       @RequestParam(value = "currentPage",required = false)Integer currentPage,
                                       @RequestParam(value = "pageSize",required = false)Integer pageSize) {
        //House house = new House(houseArea,houseFloor,houseOrientations,houseType,houseElevator,houseBalcony,houseRent,houseLeaseState);
        return this.houseService.getHouseByEvery(house,currentPage,pageSize);
    }


    @PostMapping("/addHouse")
    public String addHouse(House house) {
        String msg = null;
        if(this.houseService.addHouse(house)==1){
            msg = "success";
        }else{
            msg = "error";
        }
        return msg;
    }

    @PostMapping("/updateHouse")
    public int updateHouse(@RequestParam(value = "houseId" ) Integer houseId,
                           @RequestParam(value = "housePublishTime" ,required = false)String housePublishTime) throws ParseException {
        //Date parse = simpleDateFormat.parse(housePublishTime);
        return this.houseService.updateHouse(houseId,housePublishTime);
    }

    @PostMapping("/lease")
    public String lease(House house,
                        @RequestParam(value = "currentPage",required = false)Integer currentPage,
                        @RequestParam(value = "pageSize",required = false)Integer pageSize){
        List<House> houses = this.getHouseByEvery(house, currentPage, pageSize);
        String msg = null;
        House house1 = houses.get(0);
        if(house1.getHousePublishTime()!=null&&house1.getHouseLeaseState()==1){
            msg = "可以租赁";
        }else{
            msg = "不可租赁";
        }
        return msg;
    }

}
