package com.zhou.blogeurekaconsumer.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zhou.bean.BlogComment;
import com.zhou.bean.BlogDetail;
import com.zhou.bean.User;
import com.zhou.blogeurekaconsumer.proxy.ProviderBlogCommentClient;
import com.zhou.blogeurekaconsumer.proxy.ProviderBlogDetailClient;
import com.zhou.blogeurekaconsumer.service.BlogCommentService;
import com.zhou.blogeurekaconsumer.service.BlogServiceDetail;
import com.zhou.blogeurekaconsumer.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Service
public class BlogCommentServiceImpl implements BlogCommentService{
    @Autowired
    private ProviderBlogCommentClient providerBlogCommentClient;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public String addBlogComment(BlogComment blogComment, HttpServletRequest request) {
        String token = request.getHeader("token");
        User user = redisUtil.get(token);
        if(user!=null){
            Integer id = user.getId();
            blogComment.setCreateUser(id);
            return this.providerBlogCommentClient.addBlogComment(blogComment);
        }else{
            return "评论失败";
        }
    }
}
