package com.example.citrus_design.Servie_Data_Class;

public class PostPage {

    private String[] company_type;
    private Portlist portlist;

    public PostPage() {
    }

    public String[] getCompany_type() {
        return company_type;
    }

    public void setCompany_type(String[] company_type) {
        this.company_type = company_type;
    }

    public Portlist getPortlist() {
        return portlist;
    }

    public void setPortlist(Portlist portlist) {
        this.portlist = portlist;
    }
}
