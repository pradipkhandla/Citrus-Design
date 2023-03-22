package com.example.citrus_design.Servie_Data_Class;

import com.google.gson.annotations.SerializedName;

public class Data {


    @SerializedName("llp-pvt_ltd")
    public LlpPvtLtd llp_pvt_ltd;

    private String message;

    private PartnershipFirm partnership_firm;

    @SerializedName("sole-proprietor")
    private SoleProprietor sole_proprietor;


    public Data() {
    }

    public LlpPvtLtd getLlp_pvt_ltd() {
        return llp_pvt_ltd;
    }

    public void setLlp_pvt_ltd(LlpPvtLtd llp_pvt_ltd) {
        this.llp_pvt_ltd = llp_pvt_ltd;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PartnershipFirm getPartnership_firm() {
        return partnership_firm;
    }

    public void setPartnership_firm(PartnershipFirm partnership_firm) {
        this.partnership_firm = partnership_firm;
    }

    public SoleProprietor getSole_proprietor() {
        return sole_proprietor;
    }

    public void setSole_proprietor(SoleProprietor sole_proprietor) {
        this.sole_proprietor = sole_proprietor;
    }
}
