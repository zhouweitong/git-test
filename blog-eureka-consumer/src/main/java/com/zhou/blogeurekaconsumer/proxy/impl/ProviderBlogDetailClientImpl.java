package com.zhou.blogeurekaconsumer.proxy.impl;

import com.zhou.bean.BlogDetail;
import com.zhou.blogeurekaconsumer.proxy.ProviderBlogDetailClient;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProviderBlogDetailClientImpl implements ProviderBlogDetailClient {

    @Override
    public List<BlogDetail> getAllBlogDetail() {
        return null;
    }
}
