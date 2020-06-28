package com.zhou.productseurekaprovider.service;

import com.zhou.bean.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {
    int getRecordCount(String productName);

    void addProduct(Product product);

    List<Product> getProduct(@Param("productName")String productName,
                       @Param("currentPage")int currentPage,
                       @Param("size")int size);
}
