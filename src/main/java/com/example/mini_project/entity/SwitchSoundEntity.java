package com.example.mini_project.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "switch_sound")
public class SwitchSoundEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ssIdx;

    @ManyToOne
    @JoinColumn(name = "tags_idx", referencedColumnName = "tags_idx", nullable = false)
    private TagsEntity tagsEntity;

    @ManyToOne
    @JoinColumn(name = "b_idx", referencedColumnName = "b_idx", nullable = false)
    private BoardEntity boardEntity;
//    private String bWriter;
//    private String bFile; 이미 boardEntity에 해당내용 다 있으니 안 써도 됨. 쓰면 중복.


    // Getter & Setter
    public Integer getSsIdx() {
        return ssIdx;
    }
    public void setSsIdx(Integer ssIdx) {
        this.ssIdx = ssIdx;
    }

    public TagsEntity getTagsEntity() {
        return tagsEntity;
    }
    public void setTagsEntity(TagsEntity tagsEntity) {
        this.tagsEntity = tagsEntity;
    }

    public BoardEntity getBoardEntity() {
        return boardEntity;
    }
    public void setBoardEntity(BoardEntity boardEntity) {
        this.boardEntity = boardEntity;
    }

//    public String getBWriter(){
//        return bWriter;
//    }
//    public void setBWriter(String bWriter){
//        this.bWriter = bWriter;
//    }
//
//    public String getBFile(){
//        return bFile;
//    }
//    public void setBFile(String bFile){
//        this.bFile = bFile;
//    }
}
