package com.spring.C13S1PC.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private int productId;
    private String productName;
    private String productDescriprtion;
    private double amountInStock;

    public Product() {
    }

    public Product(int productId, String productName, String productDescriprtion, double amountInStock) {
        this.productId = productId;
        this.productName = productName;
        this.productDescriprtion = productDescriprtion;
        this.amountInStock = amountInStock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescriprtion() {
        return productDescriprtion;
    }

    public void setProductDescriprtion(String productDescriprtion) {
        this.productDescriprtion = productDescriprtion;
    }

    public double getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(double amountInStock) {
        this.amountInStock = amountInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDescriprtion='" + productDescriprtion + '\'' +
                ", amountInStock=" + amountInStock +
                '}';
    }
}
