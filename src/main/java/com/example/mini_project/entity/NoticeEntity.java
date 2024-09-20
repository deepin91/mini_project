package com.example.mini_project.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "notice")
public class NoticeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nIdx;

    @ManyToOne
    @JoinColumn(name = "n_writer", referencedColumnName = "user_id", nullable = false)
    private UserEntity userEntity;
    private String nTitle;
    private String nContents;
    private LocalDateTime nCreatedDt;
    private String nImg; //n_img로 자동 매핑 (이미지 파일 경로 또는 이름)
    private char nDeletedYn;

    // Getter & Setter
    public Integer getnIdx(){
        return nIdx;
    }
    public void setnIdx(Integer nIdx) {
        this.nIdx = nIdx;
    }

    public UserEntity getUserEntity(){
        return userEntity;
    }
    public void setUserEntity(UserEntity userEntity){
        this.userEntity = userEntity;
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

    public LocalDateTime getNCreatedDt() {
        return nCreatedDt;
    }

    public void setNCreatedDt(LocalDateTime nCreatedDt) {
        this.nCreatedDt = nCreatedDt;
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


