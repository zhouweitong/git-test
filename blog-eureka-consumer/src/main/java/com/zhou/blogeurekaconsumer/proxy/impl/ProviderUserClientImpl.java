package com.zhou.blogeurekaconsumer.proxy.impl;

import com.zhou.bean.BlogComment;
import com.zhou.bean.User;
import com.zhou.blogeurekaconsumer.proxy.ProviderBlogCommentClient;
import com.zhou.blogeurekaconsumer.proxy.ProviderUserClient;
import org.springframework.stereotype.Component;

@Component
public class ProviderUserClientImpl implements ProviderUserClient {


    @Override
    public User getUser(String userName, String password) {
        return null;
    }
}

