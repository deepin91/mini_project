package com.example.mini_project.dto;

public class LoginDto {

    private String userId;
    private String userPw;


    // getter & setter
    public String getUserId(){
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw(){
        return userPw;
    }
    public void setUserPw(String userPw){
        this.userPw = userPw;
    }
}
