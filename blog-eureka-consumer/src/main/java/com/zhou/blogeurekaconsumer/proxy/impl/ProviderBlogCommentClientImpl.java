package com.zhou.blogeurekaconsumer.proxy.impl;

import com.zhou.bean.BlogComment;
import com.zhou.bean.BlogDetail;
import com.zhou.blogeurekaconsumer.proxy.ProviderBlogCommentClient;
import com.zhou.blogeurekaconsumer.proxy.ProviderBlogDetailClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProviderBlogCommentClientImpl implements ProviderBlogCommentClient {


    @Override
    public String addBlogComment(BlogComment blogComment) {
        return "error";
    }
}

