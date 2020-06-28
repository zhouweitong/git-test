package com.zhou.productseurekaconsumer.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhou.bean.Product;
import com.zhou.productseurekaconsumer.service.ProductService;
import com.zhou.productseurekaconsumer.util.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @InitBinder
    public void initBinder(WebDataBinder binder){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class,new CustomDateEditor(simpleDateFormat,true));
    }

    @RequestMapping(value = "/getRecordCount" ,method = RequestMethod.GET)
    public String getRecordCount(@RequestParam("productName") String productName){
        int recordCount = this.productService.getRecordCount(productName);
        Map<String, Object> map = new HashMap<>();
        map.put("opsMsg","success");
        map.put("recordCount",recordCount);
        return JSONObject.toJSONString(map);
    }

    @RequestMapping(value = "/addProduct" ,method = RequestMethod.POST)
    public Vo addProduct(@RequestParam("productName") String productName,
                           @RequestParam("productDate") Date productDate,
                           @RequestParam("productSum") Integer productSum,
                           @RequestParam("productDesc") String productDesc,
                           @RequestParam("productPrice") Double productPrice) {

        Product product = new Product(productName,productDate, productSum,productDesc,productPrice);
        String msg = this.productService.addProduct(product);
        Vo vo = new Vo();
        vo.setState(msg);
        return vo;

    }

    @RequestMapping(value = "/getProduct" ,method = RequestMethod.GET)
    public Vo getProduct(@RequestParam(value = "productName" ,required = false) String productName,
                         @RequestParam("currentPage") Integer currentPage,
                         @RequestParam("pageSize") Integer pageSize) {
        List<Product> products = this.productService.getProduct(productName, currentPage, pageSize);
        Vo<Product> vo = new Vo<>();
        vo.setListT(products);
        return vo;

    }
}

