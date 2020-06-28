package com.zhou.productseurekaconsumer.proxy;

import com.zhou.bean.Product;
import com.zhou.bean.Qualities;
import com.zhou.productseurekaconsumer.proxy.impl.ProviderProductControllerClientImpl;
import com.zhou.productseurekaconsumer.proxy.impl.ProviderQualityControllerClientImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "products-eureka-provider" ,fallback = ProviderQualityControllerClientImpl.class)
public interface ProviderQualityControllerClient {
    @RequestMapping(value = "/addQuality",method = RequestMethod.POST)
    public String addQuality(@RequestBody Qualities qualities);
}
