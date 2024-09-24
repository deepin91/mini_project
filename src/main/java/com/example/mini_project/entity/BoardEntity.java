package com.example.mini_project.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "board")
public class BoardEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bIdx;

    private String bTitle;
//    private String bWriter;
    private String bContents;

    @ManyToOne
    @JoinColumn(name = "b_writer", referencedColumnName = "user_id", insertable = false, updatable = false)
    private UserEntity userEntity; // 'user_nickname' -> 'user_id'로 매핑 (외래 키 관계)

    private Integer bViews;
    private LocalDateTime bCreatedDt;
    private String bFile;

    //외래키 관계 설정 : ManyToOne

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

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
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

    public void setBImg(String bFile) {
        this.bFile = bFile;
    }

}
