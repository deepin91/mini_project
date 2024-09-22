package com.example.mini_project.dto;

import java.time.LocalDateTime;

public class NoticeDto {
    private Integer nIdx;
    private String nWriter;
    private String nTitle;
    private String nContents;
    private LocalDateTime nCreateDt;
    private String nImg;
    private char nDeletedYn;


    // Getter & Setter
    public Integer getNIdx() {
        return nIdx;
    }

    public void setNIdx(Integer nIdx) {
        this.nIdx = nIdx;
    }

    public String getNWriter() {
        return nWriter;
    }

    public void setNWriter(String nWriter) {
        this.nWriter = nWriter;
    }

    public String getNTitle() {
        return nTitle;
    }

    public void setNTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public String getNContents() {
        return nContents;
    }

    public void setNContents(String nContents) {
        this.nContents = nContents;
    }

    public LocalDateTime getNCreateDt() {
        return nCreateDt;
    }

    public void setNCreateDt(LocalDateTime nCreateDt) {
        this.nCreateDt = nCreateDt;
    }

    public String getNImg() {
        return nImg;
    }

    public void setNImg(String nImg) {
        this.nImg = nImg;
    }

    public char getNDeletedYn() {
        return nDeletedYn;
    }

    public void setNDeletedYn(char nDeletedYn) {
        this.nDeletedYn = nDeletedYn;
    }
}
