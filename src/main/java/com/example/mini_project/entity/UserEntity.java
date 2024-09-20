package com.example.mini_project.entity;


import jakarta.persistence.*;

import java.io.Serializable;

//entity클래스에서는 카멜표기법을 사용하는 것이 좋음
//DB에서 스네이크 표기법을 사용하는 경우, @Column 어노테이션 사용해서 entity필드와 db 컬럼 매핑 가능
@Entity
@Table(name = "users")
public class UserEntity implements Serializable {
    // UserEntity 클래스가 Serializable 인터페이스를 구현하고 있다는 의미
    // Serializable 인터페이스는 자바 객체를 직렬화(웹 애플리케이션에서 세션에 객체를 저장하거나 네트워크를 통해 전송하는 경우에 필요
    // 직렬화 : 복잡한 객체(데이터)를 연속된 데이터 형태로 변환하는 과정 (자바 객체를 저장하거나 전송할 수 있도록 쉽게 1차원 데이터로 변환하는 과정)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    @Column(nullable = false)
    private String userPw;

    @Column(nullable = false)
    private String userName;

    @Column(unique = true, nullable = false, length = 100)
    private String userNickname;

    @Column(unique = true, nullable = false, length = 50)
    private String userEmail;

    @Column(nullable = false, length = 20)
    private String userPhoneNumber;


    // Getter & Setter
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
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

//@Column을 사용해서 하는 방법도 있지만 이 어노테이션을 사용 시 제약조건을 다 명시해줘야함.
// 더 상세하게 설정 가능하지만, 그만큼 나중에 수정 시 더 복잡해짐
// spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl 입력하고
// 그래서 application.properties파일에 위 코드(Naming Strategy) 기입 후 entity파일에서는 카멜표기법으로 사용.
// 저렇게 쓰면 Naming Strategy가 적용되어 필드 이름이 카멜표기법으로 작성되어 userId필드는 user_id 컬럼으로 자동 매핑됨.
