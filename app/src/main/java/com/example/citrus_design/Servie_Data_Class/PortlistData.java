package com.example.citrus_design.Servie_Data_Class;

import com.google.gson.annotations.SerializedName;

public class PortlistData {


    @SerializedName("auto-select")
    private String auto_select;

    private String name;

    @SerializedName("sub-name")
    private String sub_name;


    public PortlistData() {
    }

    public String getAuto_select() {
        return auto_select;
    }

    public void setAuto_select(String auto_select) {
        this.auto_select = auto_select;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }
}
