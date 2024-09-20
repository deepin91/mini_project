package com.example.mini_project.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "switch")
public class SwitchEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sIdx;

    private String sBrand;
    private String sName;
    private String sType;
    private String sSpring;
    private String sOperatingForce;
    private String sPins;


    // Getter & Setter
    public Integer getSIdx() {
        return sIdx;
    }

    public void setSIdx(Integer sIdx) {
        this.sIdx = sIdx;
    }

    public String getSBrand() {
        return sBrand;
    }

    public void setSBrand(String sBrand) {
        this.sBrand = sBrand;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public String getSType() {
        return sType;
    }

    public void setSType(String sType) {
        this.sType = sType;
    }

    public String getSSpring() {
        return sSpring;
    }

    public void setSSpring(String sSpring) {
        this.sSpring = sSpring;
    }

    public String getSOperatingForce() {
        return sOperatingForce;
    }

    public void setSOperatingForce(String sOperatingForce) {
        this.sOperatingForce = sOperatingForce;
    }

    public String getSPins() {
        return sPins;
    }

    public void setSPins(String sPins) {
        this.sPins = sPins;
    }
}
