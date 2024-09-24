package com.example.mini_project.service;

import com.example.mini_project.dto.BoardDto;

import java.util.List;

public interface BoardService {
//    List<BoardDto> getBoardByTitle(String bTitle);
//    List<BoardDto> getBoardByTitle(Integer bIdx);

    List<BoardDto> getBoardByTitle(String bTitle);
//    List<BoardDto> getBoardByTitle();
//    List<BoardDto> getBoardByTitle(String bTitle);
//    BoardDto getBoardDetails(Integer bIdx);
}
//메서드명 규칙: findBy + 엔티티 필드명 + 검색 조건(Containing)