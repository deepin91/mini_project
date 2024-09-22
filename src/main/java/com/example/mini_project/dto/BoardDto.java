package com.example.mini_project.dto;

import java.time.LocalDateTime;

public class BoardDto {
    private Integer bIdx;
    private String bTitle;
    private String bContents;
    private String bWriter;
    private Integer bViews;
    private LocalDateTime bCreatedDt;
    private String bFile;


    //Getter & Setter
    public Integer getBIdx() {
        return bIdx;
    }
    public void setBIdx(Integer bIdx) {
        this.bIdx = bIdx;
    }

    public String getBTitle() {
        return bTitle;
    }
    public void setBTitle(String bTitle) {
        this.bTitle = bTitle;
    }

    public String getBContents() {
        return bContents;
    }
    public void setBContents(String bContents) {
        this.bContents = bContents;
    }

    public String getBWriter() {
        return bWriter;
    }
    public void setBWriter(String bWriter) {
        this.bWriter = bWriter;
    }

    public Integer getBViews() {
        return bViews;
    }
    public void setBViews(Integer bViews) {
        this.bViews = bViews;
    }

    public LocalDateTime getBCreatedDt() {
        return bCreatedDt;
    }
    public void setBCreatedDt(LocalDateTime bCreatedDt) {
        this.bCreatedDt = bCreatedDt;
    }

    public String getBFile() {
        return bFile;
    }
    public void setBFile(String bFile) {
        this.bFile = bFile;
    }

}
