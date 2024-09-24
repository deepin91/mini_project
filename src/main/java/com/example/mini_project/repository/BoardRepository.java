package com.example.mini_project.repository;

import com.example.mini_project.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {

    // 제목으로 게시물 검색
//    List<BoardEntity> findByBTitleContaining(String title);
    List<BoardEntity> findByBTitleContaining(String bTitle);
}
