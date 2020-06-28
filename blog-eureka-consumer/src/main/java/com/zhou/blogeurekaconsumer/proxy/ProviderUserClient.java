package com.zhou.blogeurekaconsumer.proxy;

import com.zhou.bean.BlogComment;
import com.zhou.bean.User;
import com.zhou.blogeurekaconsumer.proxy.impl.ProviderBlogCommentClientImpl;
import com.zhou.blogeurekaconsumer.proxy.impl.ProviderUserClientImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "blog-eureka-provider" ,fallback = ProviderUserClientImpl.class)
public interface ProviderUserClient {
    @RequestMapping(value = "/getUser" , method = RequestMethod.GET)
    public User getUser(@RequestParam("userName") String userName, @RequestParam("password") String password);
}
