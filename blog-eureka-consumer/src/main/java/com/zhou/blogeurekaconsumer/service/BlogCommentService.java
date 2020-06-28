package com.zhou.blogeurekaconsumer.service;

import com.zhou.bean.BlogComment;

import javax.servlet.http.HttpServletRequest;

public interface BlogCommentService {
    String addBlogComment(BlogComment blogComment,HttpServletRequest request);
}
