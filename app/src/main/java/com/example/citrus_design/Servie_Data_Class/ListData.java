package com.example.citrus_design.Servie_Data_Class;

import com.google.gson.annotations.SerializedName;

public class ListData {

    private int order;

    @SerializedName("sub-title")
    private String sub_title;
    private String title;

    public ListData() {
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
