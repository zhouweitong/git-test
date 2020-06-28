package com.zhou.zwteurekaconsumer.proxy;

import com.zhou.zwteurekaconsumer.proxy.impl.ProviderUserControllerClientImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "zwt-eureka-provider",fallback = ProviderUserControllerClientImpl.class)
public interface ProviderUserControllerClient {
    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public String login(@RequestParam("username") String username , @RequestParam("password") String password);


}
