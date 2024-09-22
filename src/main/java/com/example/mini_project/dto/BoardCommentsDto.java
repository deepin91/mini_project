package com.example.mini_project.dto;

public class BoardCommentsDto {
    private Integer bcIdx;
    private String bcComments;
    private String bcWriter;
    private Integer bIdx;


//    getter & setter
public Integer getBcIdx() {
    return bcIdx;
}

    public void setBcIdx(Integer bcIdx) {
        this.bcIdx = bcIdx;
    }

    public String getBcComments() {
        return bcComments;
    }

    public void setBcComments(String bcComments) {
        this.bcComments = bcComments;
    }

    public String getBcWriter() {
        return bcWriter;
    }

    public void setBcWriter(String bcWriter) {
        this.bcWriter = bcWriter;
    }

    public Integer getBIdx() {
        return bIdx;
    }

    public void setBIdx(Integer bIdx) {
        this.bIdx = bIdx;
    }

}
