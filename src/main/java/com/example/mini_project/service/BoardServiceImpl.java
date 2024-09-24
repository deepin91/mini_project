package com.example.mini_project.service;


import com.example.mini_project.dto.BoardDto;
import com.example.mini_project.entity.BoardEntity;
import com.example.mini_project.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<BoardDto> getBoardByTitle(String bTitle){
        List<BoardEntity> boardEntities = boardRepository.findByBTitleContaining(bTitle);
        return boardEntities.stream().map(board -> {
            BoardDto boardDto = new BoardDto();
            boardDto.setBIdx((board.getBIdx()));
            boardDto.setBTitle(board.getBTitle());
            boardDto.setBContents(board.getBContents());
            boardDto.setBViews(board.getBViews());
            boardDto.setBCreatedDt(board.getBCreatedDt());

            if(board.getUserEntity() != null){
                boardDto.setBWriter(board.getUserEntity().getUserId());
            } else {
                boardDto.setBWriter("Unknown");
            }

            boardDto.setBFile((board.getBFile()));
            return boardDto;
        }).collect(Collectors.toList());
    }
}
