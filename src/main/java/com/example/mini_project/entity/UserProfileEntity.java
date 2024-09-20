package com.example.mini_project.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "user_profile")
public class UserProfileEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userProfileIdx;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private UserEntity userEntity; // users 테이블의 user_id와 매핑

    private String userNickname;

    private String userInfo;

    private String profileImg;

//    private int bIdx;

    @ManyToOne
    @JoinColumn(name = "b_idx", foreignKey = @ForeignKey(name = "FK_board_b_idx"), nullable = false)
    private BoardEntity boardEntity; //'b_idx'로 자동 매핑, Board 엔티티와의 외래 키



    // Getter & Setter
    public Integer getUserProfileIdx() {
        return userProfileIdx;
    }

    public void setUserProfileIdx(Integer userProfileIdx) {
        this.userProfileIdx = userProfileIdx;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public BoardEntity getBoardEntity() {
        return boardEntity;
    }

    public void setBoardEntity(BoardEntity boardEntity) {
        this.boardEntity = boardEntity;
    }
}

