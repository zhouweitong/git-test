package com.zhou.productseurekaprovider.controller;

import com.zhou.bean.Qualities;
import com.zhou.productseurekaprovider.service.QualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QualityController {
    @Autowired
    private QualityService qualityService;

    @RequestMapping(value = "/addQuality",method = RequestMethod.POST)
    public String addQuality(@RequestBody Qualities qualities){
        this.qualityService.addQuality(qualities);
        return "success";
    }
}
