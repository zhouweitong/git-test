package com.zhou.blogeurekaconsumer.controller;

import com.zhou.bean.BlogDetail;
import com.zhou.blogeurekaconsumer.service.BlogServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blogDetail")
public class BlogDetailController {

    @Autowired
    private BlogServiceDetail blogServiceDetail;

    @GetMapping("/getAllBlogDetail")
    public List<BlogDetail> getAllBlogDetail() {
        return this.blogServiceDetail.getAllBlogDetail();
    }

}
