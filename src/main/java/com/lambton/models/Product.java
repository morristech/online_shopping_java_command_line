package com.lambton.models;

import com.lambton.utils.IDisplay;

public class Product implements IDisplay {
    private int productId = 0;
    private String productName;
    private double productPrice;

    public Product(String productName, double productPrice) {
        productId++;
        this.productName = productName;
        this.productPrice = productPrice;
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

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String display() {
        return "\n\r\tProduct ID: " + productId
                + "\n\tProduct Name: " + productName
                + "\n\tPrice for unit: " + productPrice;
    }
}
