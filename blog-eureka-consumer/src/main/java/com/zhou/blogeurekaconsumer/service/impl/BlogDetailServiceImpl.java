package com.zhou.blogeurekaconsumer.service.impl;

import com.zhou.bean.BlogDetail;
import com.zhou.blogeurekaconsumer.proxy.ProviderBlogDetailClient;
import com.zhou.blogeurekaconsumer.service.BlogServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogDetailServiceImpl implements BlogServiceDetail{
    @Autowired
    private ProviderBlogDetailClient providerBlogDetailClient;
    @Override
    public List<BlogDetail> getAllBlogDetail() {
        return this.providerBlogDetailClient.getAllBlogDetail();
    }
}
