package com.zhou.blogeurekaconsumer.proxy;

import com.zhou.bean.BlogComment;
import com.zhou.bean.BlogDetail;
import com.zhou.blogeurekaconsumer.proxy.impl.ProviderBlogCommentClientImpl;
import com.zhou.blogeurekaconsumer.proxy.impl.ProviderBlogDetailClientImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "blog-eureka-provider" ,fallback = ProviderBlogCommentClientImpl.class)
public interface ProviderBlogCommentClient {
    @PostMapping("/addBlogComment")
    String addBlogComment(@RequestBody BlogComment blogComment);

}
