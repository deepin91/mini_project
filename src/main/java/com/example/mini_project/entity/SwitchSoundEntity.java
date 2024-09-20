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
    @JoinColumn(name = "b_writer", referencedColumnName = "b_writer", nullable = false)
    private BoardEntity boardEntity;


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
}
