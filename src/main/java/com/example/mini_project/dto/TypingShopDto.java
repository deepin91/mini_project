package com.example.mini_project.dto;

public class TypingShopDto {
    private Integer tsIdx;
    private String tsName;
    private String tsAddress;
    private String tsNumber;


    // Getter & Setter
    public Integer getTsIdx(){
        return tsIdx;
    }
    public void setTsIdx(Integer tsIdx){
        this.tsIdx = tsIdx;
    }

    public String getTsName(){
        return tsName;
    }
    public void setTsName(String tsName) {
        this.tsName = tsName;
    }

    public String getTsAddress(){
        return tsAddress;
    }
    public void setTsAddress(String tsAddress){
        this.tsAddress = tsAddress;
    }

    public String getTsNumber(){
        return tsNumber;
    }
    public void setTsNumber(String tsNumber) {
        this.tsNumber = tsNumber;
    }
}
