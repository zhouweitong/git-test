package com.zhou.productseurekaprovider.mapper;

import com.zhou.bean.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int count(@Param("productName")String productName);

    void save(Product product);

    List<Product> list(@Param("productName")String productName,
                       @Param("start")int start,
                       @Param("size")int size);

}
