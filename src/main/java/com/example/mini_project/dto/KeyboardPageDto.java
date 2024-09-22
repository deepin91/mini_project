package com.example.mini_project.dto;

public class KeyboardPageDto {
    private Integer kbpIdx;
    private String kbpBrand;
    private String kbpLayout;
    private String kbpImg;


    //Getter & Setter
    public Integer getKbpIdx() {
        return kbpIdx;
    }

    public void setKbpIdx(Integer kbpIdx) {
        this.kbpIdx = kbpIdx;
    }

    public String getKbpBrand(){
        return kbpBrand;
    }

    public void setKbpBrand(String kbpBrand) {
        this.kbpBrand = kbpBrand;
    }

    public String getKbpLayout(){
        return kbpLayout;
    }

    public void setKbpLayout(String kbpLayout) {
        this.kbpLayout = kbpLayout;
    }

    public String getKbpImg(){
        return kbpImg;
    }

    public void setKbpImg(String kbpImg) {
        this.kbpImg = kbpImg;
    }
}
