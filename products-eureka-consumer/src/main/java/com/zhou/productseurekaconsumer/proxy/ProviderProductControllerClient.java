package com.zhou.productseurekaconsumer.proxy;

import com.zhou.bean.Product;
import com.zhou.productseurekaconsumer.proxy.impl.ProviderProductControllerClientImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "products-eureka-provider" ,fallback = ProviderProductControllerClientImpl.class)
public interface ProviderProductControllerClient {

    @RequestMapping(value = "/getRecordCount",method = RequestMethod.GET)
    public int getRecordCount(@RequestParam("productName") String productName);

    @RequestMapping(value = "/addProduct",method = RequestMethod.POST)
    public String addProduct(@RequestBody Product product);

    @RequestMapping(value = "/getProduct",method = RequestMethod.GET)
    public List<Product> getProduct(@RequestParam(value = "productName" ,required = false)String productName,
                                    @RequestParam("currentPage")Integer currentPage,
                                    @RequestParam("pageSize")Integer pageSize);
}
