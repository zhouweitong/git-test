package com.zhou.blogeurekaprovider.controller;

import com.zhou.bean.BlogComment;
import com.zhou.blogeurekaprovider.service.BlogCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogCommentController {
    @Autowired
    private BlogCommentService blogCommentService;

    @PostMapping("/addBlogComment")
    public String addBlogComment(@RequestBody BlogComment blogComment) {
        this.blogCommentService.addBlogComment(blogComment);
        return "success";
    }
}
