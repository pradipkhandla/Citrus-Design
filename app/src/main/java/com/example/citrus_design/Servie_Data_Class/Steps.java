package com.example.citrus_design.Servie_Data_Class;

import java.util.List;

public class Steps {

    private List<ListData> list;

    private String title;


    public Steps() {
    }

    public List<ListData> getList() {
        return list;
    }

    public void setList(List<ListData> list) {
        this.list = list;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
