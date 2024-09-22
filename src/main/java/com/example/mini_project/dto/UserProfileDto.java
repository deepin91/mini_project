package com.example.mini_project.dto;

public class UserProfileDto {
    private Integer userProfileIdx;
    private String userId;
    private String userNickname;
    private String userInfo;
    private String profileImg;
    private String userPhoneNumber;
    private Integer bIdx;


    // Getter & Setter
    public Integer getUserProfileIdx() {
        return userProfileIdx;
    }

    public void setUserProfileIdx(Integer userProfileIdx) {
        this.userProfileIdx = userProfileIdx;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public Integer getBIdx() {
        return bIdx;
    }

    public void setBIdx(Integer bIdx) {
        this.bIdx = bIdx;
    }
}
