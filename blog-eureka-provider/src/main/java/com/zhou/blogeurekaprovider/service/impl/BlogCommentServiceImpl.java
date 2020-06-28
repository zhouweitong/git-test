package com.zhou.blogeurekaprovider.service.impl;

import com.zhou.bean.BlogComment;
import com.zhou.blogeurekaprovider.mapper.BlogCommentMapper;
import com.zhou.blogeurekaprovider.service.BlogCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BlogCommentServiceImpl implements BlogCommentService{
    @Resource
    private BlogCommentMapper blogCommentMapper;
    @Override
    public String addBlogComment(BlogComment blogComment) {
        this.blogCommentMapper.save(blogComment);
        return "success";
    }
}
