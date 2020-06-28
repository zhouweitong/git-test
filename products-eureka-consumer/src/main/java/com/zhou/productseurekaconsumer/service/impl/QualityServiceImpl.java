package com.zhou.productseurekaconsumer.service.impl;

import com.zhou.bean.Qualities;
import com.zhou.productseurekaconsumer.proxy.ProviderQualityControllerClient;
import com.zhou.productseurekaconsumer.service.QualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("qualityService")
public class QualityServiceImpl implements QualityService {
    @Autowired
    private ProviderQualityControllerClient providerQualityControllerClient;
    @Override
    public String addQuality(Qualities qualities) {

        return this.providerQualityControllerClient.addQuality(qualities);
    }
}
