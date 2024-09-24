package com.example.mini_project.repository;

import com.example.mini_project.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, String> {


    // 사용자 ID로 조회하는 메서드
    Optional<UserEntity> findByUserId(String userId);

    // 이메일로 사용자 조회
    Optional<UserEntity> findByUserEmail(String userEmail);

    // 이름으로 사용자 조회
    Optional<UserEntity> findByUserNameContaining(String userName);

//    Optional<UserEntity> findByUserNameContaining(String userNickname);
}
