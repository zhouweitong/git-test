package com.zhou.blogeurekaconsumer.controller;

import com.zhou.bean.BlogComment;
import com.zhou.bean.BlogDetail;
import com.zhou.blogeurekaconsumer.service.BlogCommentService;
import com.zhou.blogeurekaconsumer.service.BlogServiceDetail;
import com.zhou.blogeurekaconsumer.util.RedisUtil;
import com.zhou.blogeurekaconsumer.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/blogComment")
public class BlogCommentController {

    @Autowired
    private BlogCommentService blogCommentService;



    @RequestMapping("/addBlogComment")
    public String addBlogComment(@RequestParam("blogId") Integer blogId,
                                 @RequestParam("content") String content,
                                 @RequestParam(value = "createUser",required = false) Integer createUser,
                                 HttpServletRequest request
                                 ) {
        BlogComment blogComment = new BlogComment(blogId,content,0,new Date());
        return this.blogCommentService.addBlogComment(blogComment,request);
    }

}
