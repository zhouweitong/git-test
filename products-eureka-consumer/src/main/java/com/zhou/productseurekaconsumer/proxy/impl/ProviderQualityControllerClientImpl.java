package com.zhou.productseurekaconsumer.proxy.impl;

import com.zhou.bean.Product;
import com.zhou.bean.Qualities;
import com.zhou.productseurekaconsumer.proxy.ProviderProductControllerClient;
import com.zhou.productseurekaconsumer.proxy.ProviderQualityControllerClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProviderQualityControllerClientImpl implements ProviderQualityControllerClient{

    @Override
    public String addQuality(Qualities qualities) {
        return "error";
    }
}
