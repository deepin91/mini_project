package com.example.mini_project.dto;

public class KeycapsDto {
    private Integer keycapsIdx;
    private String keycapsType;
    private String keycapsPrinting;
    private String keycapsImg;


    //Getter & Setter
    public Integer getKeycapsIdx(){
        return keycapsIdx;
    }

    public void setKeycapsIdx(Integer keycapsIdx) {
        this.keycapsIdx = keycapsIdx;
    }

    public String getKeycapsType(){
        return keycapsType;
    }

    public void setKeycapsType(String keycapsType) {
        this.keycapsType = keycapsType;
    }

    public String getKeycapsPrinting(){
        return keycapsPrinting;
    }

    public void setKeycapsPrinting(String keycapsPrinting) {
        this.keycapsPrinting = keycapsPrinting;
    }

    public String getKeycapsImg(){
        return keycapsImg;
    }

    public void setKeycapsImg(String keycapsImg) {
        this.keycapsImg = keycapsImg;
    }
}
