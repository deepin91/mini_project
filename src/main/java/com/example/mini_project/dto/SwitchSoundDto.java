package com.example.mini_project.dto;

import com.example.mini_project.entity.BoardEntity;
import com.example.mini_project.entity.TagsEntity;

public class SwitchSoundDto {
    private Integer ssIdx;
    private Integer tagsIdx;
    private String bWriter;
    private String bFile;


    // Getter & Setter
    public Integer getSsIdx() {
        return ssIdx;
    }
    public void setSsIdx(Integer ssIdx) {
        this.ssIdx = ssIdx;
    }

    public Integer getTagsIdx() {
        return tagsIdx;
    }
    public void setTagsIdx(Integer tagsIdx) {
        this.tagsIdx = tagsIdx;
    }

    public String getBWriter() {
        return bWriter;
    }
    public void setBWriter(String bWriter) {
        this.bWriter = bWriter;
    }

    public String getBFile(){
        return bFile;
    }
    public void setBFile(String bFile){
        this.bFile = bFile;
    }
}
