package com.majorproject.indorinamkeens.Pojo;

/**
 * Created by Punit on 4/1/2016.
 */
public class SearchOffersData {
    private String offerName;
    private String offerDescription;
    private String startDate;
    private String endDate;
    private String shopName;
    private String startTime;
    private String endTime;

    public SearchOffersData(String offerName, String offerDescription, String shopName) {
        this.offerName = offerName;
        this.offerDescription = offerDescription;
        this.shopName = shopName;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}

