package com.example.mini_project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tags")
public class TagsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tagsIdx;

    private String tags;


    // Getter & Setter
    public Integer getTagsIdx(){
        return tagsIdx;
    }
    public void setTagsIdx(Integer tagsIdx) {
        this.tagsIdx = tagsIdx;
    }

    public String getTags(){
        return tags;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }
}
