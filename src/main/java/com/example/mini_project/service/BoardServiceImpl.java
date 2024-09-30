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


//package com.example.mini_project.service;  // 서비스 패키지에 포함된 클래스입니다.
//
//        import com.example.mini_project.dto.BoardDto;  // BoardDto 클래스를 가져옵니다 (데이터 전송 객체).
//        import com.example.mini_project.entity.BoardEntity;  // BoardEntity 클래스를 가져옵니다 (DB와 매핑된 엔티티).
//        import com.example.mini_project.repository.BoardRepository;  // BoardRepository를 가져옵니다 (DB 작업을 위한 Repository).
//        import org.springframework.beans.factory.annotation.Autowired;  // 의존성 주입을 위한 어노테이션.
//        import org.springframework.stereotype.Service;  // 이 클래스가 서비스 클래스임을 명시.
//
//        import java.util.List;  // List 자료구조를 사용하기 위해 가져옵니다.
//        import java.util.stream.Collectors;  // 스트림 API를 사용해 컬렉션을 처리하기 위해 가져옵니다.
//
//@Service  // 이 클래스가 서비스 계층임을 나타내는 어노테이션입니다. Spring에서 빈(Bean)으로 관리됩니다.
//public class BoardServiceImpl implements BoardService {  // BoardService 인터페이스를 구현한 클래스입니다.
//
//    @Autowired  // 의존성 주입(DI)을 통해 BoardRepository 인스턴스를 자동으로 주입합니다.
//    private BoardRepository boardRepository;  // DB와 상호작용하기 위한 Repository 객체.
//
//    @Override  // 인터페이스에 정의된 메서드를 실제로 구현.
//    public List<BoardDto> getBoardByTitle(String bTitle) {
//        // 제목에 특정 문자열이 포함된 게시물들을 DB에서 가져옵니다.
//        List<BoardEntity> boardEntities = boardRepository.findByBTitleContaining(bTitle);
//        // DB에서 가져온 BoardEntity 리스트를 DTO 리스트로 변환하는 과정.
//        return boardEntities.stream()  // 스트림을 통해 리스트 요소를 하나씩 처리합니다.
//                .map(board -> {  // BoardEntity 객체를 BoardDto로 변환합니다.
//                    BoardDto dto = new BoardDto();  // 새롭게 BoardDto 객체를 생성.
//                    dto.setBIdx(board.getBIdx());  // 게시물 번호를 DTO에 설정 (Entity에서 가져옴).
//                    dto.setBTitle(board.getBTitle());  // 게시물 제목을 DTO에 설정.
//                    dto.setBContents(board.getBContents());  // 게시물 내용을 DTO에 설정.
//                    dto.setBViews(board.getBViews());  // 게시물 조회수를 DTO에 설정.
//                    dto.setBCreatedDt(board.getBCreatedDt());  // 게시물 작성일시를 DTO에 설정.
//
//                    // 작성자 정보(userId)를 DTO에 설정. userEntity가 null이 아닌 경우에만 설정.
//                    if (board.getUserEntity() != null) {
//                        dto.setBWriter(board.getUserEntity().getUserId());  // 작성자의 userId를 DTO에 설정.
//                    } else {
//                        dto.setBWriter("Unknown");  // 작성자가 없을 경우 "Unknown"을 설정.
//                    }
//
//                    dto.setBFile(board.getBFile());  // 게시물의 첨부 파일(bFile)을 DTO에 설정.
//                    return dto;  // 변환된 BoardDto 객체를 반환.
//                })
//                .collect(Collectors.toList());  // 변환된 DTO 리스트를 하나의 리스트로 수집해 반환.
//    }
//}
