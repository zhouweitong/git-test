package com.zhou.productseurekaconsumer.proxy.impl;

import com.zhou.bean.Product;
import com.zhou.productseurekaconsumer.proxy.ProviderProductControllerClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProviderProductControllerClientImpl implements ProviderProductControllerClient{
    @Override
    public int getRecordCount(String productName) {
        return 999999999;
    }

    @Override
    public String addProduct(Product product) {
        return "error";

    }

    @Override
    public List<Product> getProduct(String productName, Integer currentPage, Integer pageSize) {
        Product product  = new Product();
        product.setProductName("错误");
        List<Product> list = new ArrayList<>();
        list.add(product);
        return list;
    }


}
