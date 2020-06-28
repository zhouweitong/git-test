package com.zhou.productseurekaprovider.controller;

import com.zhou.bean.Product;
import com.zhou.productseurekaprovider.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/getRecordCount",method = RequestMethod.GET)
    public int getRecordCount(@RequestParam("productName") String productName){
        return this.productService.getRecordCount(productName);
    }

    @RequestMapping(value = "/addProduct",method = RequestMethod.POST)
    public String addProduct(@RequestBody Product product) {
        this.productService.addProduct(product);
        return "success";
    }

    @RequestMapping(value = "/getProduct",method = RequestMethod.GET)
    public List<Product> getProduct(@RequestParam(value = "productName" ,required = false)String productName,
                                    @RequestParam("currentPage")Integer currentPage,
                                    @RequestParam("pageSize")Integer pageSize) {
        return this.productService.getProduct(productName,currentPage,pageSize);
    }
}
