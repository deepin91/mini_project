package com.example.mini_project.dto;

public class UserDto {
    private String userId;
    private String userName;
    private String userNickname;
    private String userEmail;
    private String userPhoneNumber;
    //DTO에서는 클라이언트:서버에 전달할 내용(정말 필요한 내용만, 개인정보는 빼고)만 적음. 그래서 password 없는 이유임.


    // Getter & Setter
    public String getUserId(){
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserNickname(){
        return userNickname;
    }
    public void setUserNickname(String userNickname){
        this.userNickname = userNickname;
    }

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }
    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }
}
