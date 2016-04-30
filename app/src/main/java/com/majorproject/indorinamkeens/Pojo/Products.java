package com.majorproject.indorinamkeens.Pojo;

/**
 * Created by Punit on 4/1/2016.
 */
public class Products {
    private int logo;
    private String productName;
    private String shopName;
    private String price;
    private String description;

    public Products(int logo, String productName, String shopName, String price, String description) {
        this.logo = logo;
        this.productName = productName;
        this.shopName = shopName;
        this.price = price;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
