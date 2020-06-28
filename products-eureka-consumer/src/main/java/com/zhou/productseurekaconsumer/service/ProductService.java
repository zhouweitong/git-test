package com.zhou.productseurekaconsumer.service;

import com.zhou.bean.Product;

import java.util.List;

public interface ProductService {
    int getRecordCount(String productName);

    String addProduct(Product product);

    List<Product> getProduct(String productName,int currentPage,int size);
}
