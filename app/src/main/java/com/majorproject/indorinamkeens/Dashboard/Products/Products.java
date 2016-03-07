package com.majorproject.indorinamkeens.Dashboard.Products;

import java.io.Serializable;

/**
 * Created by Shreya on 3/5/2016.
 */
public class Products implements Serializable {
    private int logo;
    private String productName, shopName, price;

    public Products(int logo, String productName, String shopName, String price) {
        this.logo = logo;
        this.productName = productName;
        this.shopName = shopName;
        this.price = price;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
