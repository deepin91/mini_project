package com.example.mini_project.dto;

public class SwitchPageDto {
    private Integer swpIdx;
    private String swpBrand;
    private String swpType;
    private String swpImg;


    // Getter & Setter
    public Integer getSwpIdx(){
        return swpIdx;
    }
    public void setSwpIdx(Integer swpIdx) {
        this.swpIdx = swpIdx;
    }

    public String getSwpBrand(){
        return swpBrand;
    }
    public void setSwpBrand(String swpBrand) {
        this.swpBrand = swpBrand;
    }

    public String getSwpType(){
        return swpType;
    }
    public void setSwpType(String swpType) {
        this.swpType = swpType;
    }

    public String getSwpImg(){
        return swpImg;
    }
    public void setSwpImg(String swpImg) {
        this.swpImg = swpImg;
    }
}
