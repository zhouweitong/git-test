package com.zhou.blogeurekaconsumer.proxy;

import com.zhou.bean.BlogDetail;
import com.zhou.blogeurekaconsumer.proxy.impl.ProviderBlogDetailClientImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "blog-eureka-provider" ,fallback = ProviderBlogDetailClientImpl.class)
public interface ProviderBlogDetailClient {
    @RequestMapping(value = "/getAllBlogDetail",method = RequestMethod.GET)
    public List<BlogDetail> getAllBlogDetail();

}
