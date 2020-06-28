package com.zhou.productseurekaconsumer.service.impl;

import com.zhou.bean.Product;
import com.zhou.productseurekaconsumer.proxy.ProviderProductControllerClient;
import com.zhou.productseurekaconsumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProviderProductControllerClient providerProductControllerClient;

    @Override
    public int getRecordCount(String productName) {
        return this.providerProductControllerClient.getRecordCount(productName);
    }

    @Override
    public String addProduct(Product product) {
        return this.providerProductControllerClient.addProduct(product);
    }

    @Override
    public List<Product> getProduct(String productName, int currentPage, int size) {
        return this.providerProductControllerClient.getProduct(productName,currentPage,size);
    }
}
