package com.zhou.blogeurekaprovider.controller;

import com.zhou.bean.BlogDetail;
import com.zhou.blogeurekaprovider.service.BlogDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogDetailController {
    @Autowired
    private BlogDetailService blogDetailService;

    @RequestMapping(value = "/getAllBlogDetail",method = RequestMethod.GET)
    public List<BlogDetail> getAllBlogDetail() {
        return this.blogDetailService.getAllBlogDetail();
    }

}
