package com.example.citrus_design.Servie_Data_Class;

import com.google.gson.annotations.SerializedName;

public class ServiceDetails {

    private String active;
    private String duration;
    private String icon;
    private String id;
    private String name;
    private String order;
    private String partner_img;
    private String partner_name;
    private String price;
    private String price_category;
    private String status;
    private String top_img;

    private Additional additional;
    private DocsReq docs_req;

    @SerializedName("post-page")
    private PostPage post_page;

    @SerializedName("pre-req")
    private preReq pre_req;

    private  Steps steps;

    private What what;
    private Who who;


    public ServiceDetails() {
    }


    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
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

    public String getPartner_img() {
        return partner_img;
    }

    public void setPartner_img(String partner_img) {
        this.partner_img = partner_img;
    }

    public String getPartner_name() {
        return partner_name;
    }

    public void setPartner_name(String partner_name) {
        this.partner_name = partner_name;
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

    public String getTop_img() {
        return top_img;
    }

    public void setTop_img(String top_img) {
        this.top_img = top_img;
    }

    public Additional getAdditional() {
        return additional;
    }

    public void setAdditional(Additional additional) {
        this.additional = additional;
    }

    public DocsReq getDocs_req() {
        return docs_req;
    }

    public void setDocs_req(DocsReq docs_req) {
        this.docs_req = docs_req;
    }

    public PostPage getPost_page() {
        return post_page;
    }

    public void setPost_page(PostPage post_page) {
        this.post_page = post_page;
    }

    public preReq getPre_req() {
        return pre_req;
    }

    public void setPre_req(preReq pre_req) {
        this.pre_req = pre_req;
    }

    public Steps getSteps() {
        return steps;
    }

    public void setSteps(Steps steps) {
        this.steps = steps;
    }

    public What getWhat() {
        return what;
    }

    public void setWhat(What what) {
        this.what = what;
    }

    public Who getWho() {
        return who;
    }

    public void setWho(Who who) {
        this.who = who;
    }
}
