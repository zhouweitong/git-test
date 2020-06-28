package com.zhou.productseurekaconsumer.controller;

import com.zhou.bean.Qualities;
import com.zhou.productseurekaconsumer.service.QualityService;
import com.zhou.productseurekaconsumer.util.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/quality")
public class QualityController {
    @Autowired
    private QualityService qualityService;

    @RequestMapping(value = "/addQuality",method = RequestMethod.POST)
    public Vo addQuality(Qualities qualities){
        String quality = this.qualityService.addQuality(qualities);
        Vo vo = new Vo();
        vo.setState(quality);
        return vo;
    }
}
