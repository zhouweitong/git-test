package com.zhou.bean;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable{
    private Integer id;

    private String productName;

    private Date productDate;

    private Integer productSum;

    private String productDesc;

    private Double productPrice;

    public Product(Integer id, String productName, Date productDate, Integer productSum, String productDesc, Double productPrice) {
        this.id = id;
        this.productName = productName;
        this.productDate = productDate;
        this.productSum = productSum;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
    }

    public Product() {
    }

    public Product(String productName, Date productDate, Integer productSum, String productDesc, Double productPrice) {
        this.productName = productName;
        this.productDate = productDate;
        this.productSum = productSum;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public Integer getProductSum() {
        return productSum;
    }

    public void setProductSum(Integer productSum) {
        this.productSum = productSum;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
}
