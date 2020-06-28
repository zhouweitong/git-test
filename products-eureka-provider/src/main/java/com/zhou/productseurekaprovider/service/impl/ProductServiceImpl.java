package com.zhou.productseurekaprovider.service.impl;

import com.zhou.bean.Product;
import com.zhou.productseurekaprovider.mapper.ProductMapper;
import com.zhou.productseurekaprovider.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public int getRecordCount(String productName) {
        return this.productMapper.count(productName);
    }

    @Override
    public void addProduct(Product product) {
        this.productMapper.save(product);
    }

    @Override
    public List<Product> getProduct(String productName, int currentPage, int pageSize) {
        int start = (currentPage-1)*pageSize;
        return this.productMapper.list(productName,start,pageSize);
    }
}
