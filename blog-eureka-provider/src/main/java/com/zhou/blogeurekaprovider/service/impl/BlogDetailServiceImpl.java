package com.zhou.blogeurekaprovider.service.impl;

import com.zhou.bean.BlogDetail;
import com.zhou.blogeurekaprovider.mapper.BlogDetailMapper;
import com.zhou.blogeurekaprovider.service.BlogDetailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("blogDetailService")
public class BlogDetailServiceImpl implements BlogDetailService{
    @Resource
    private BlogDetailMapper blogDetailMapper;
    @Value("${server.port}")
    private String port;

    @Override
    public List<BlogDetail> getAllBlogDetail() {
        System.out.println(port);
        return this.blogDetailMapper.list();
    }
}
