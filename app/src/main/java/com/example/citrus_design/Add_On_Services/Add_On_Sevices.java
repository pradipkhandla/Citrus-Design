package com.example.citrus_design.Add_On_Services;

import com.google.gson.annotations.SerializedName;

public class Add_On_Sevices {

    private String active;
    private String description;
    private String duration;
    private String icon;
    private String id;
    private String name;
    private String order;
    private String price;
    @SerializedName("price-category")
    private String price_category;
    private String status;

    @SerializedName("view-details")
    private View_details view_details;

    public Add_On_Sevices() {
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice_category() {
        return price_category;
    }

    public void setPrice_category(String price_category) {
        this.price_category = price_category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public View_details getView_details() {
        return view_details;
    }

    public void setView_details(View_details view_details) {
        this.view_details = view_details;
    }
}
