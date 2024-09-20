package com.example.mini_project.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "keycaps")
public class KeycapsEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
