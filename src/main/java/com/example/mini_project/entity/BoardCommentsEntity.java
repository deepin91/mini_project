package com.example.mini_project.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "board_comments")
public class BoardCommentsEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bcIdx;

    private String bcComments;

    @ManyToOne
    @JoinColumn(name = "bc_writer", referencedColumnName = "user_id", nullable = false)
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "b_idx", foreignKey = @ForeignKey(name = "FK_board_b_idx"), nullable = false)
    private BoardEntity boardEntity;



    // @JoinColumn - 단일 컬럼 외래키를 (매핑)설정할 때 사용 : 한 개의 컬럼을 기준으로 다른 테이블과의 관계를 설정할 때 사용 1:1
    // @JoinColumns - 복합 외래키(다중 컬럼)를 매핑할 때 사용. 두 개 이상의 컬럼을 결합 > 외래키 구성 시 사용
    // =지금 board_comments 테이블에선  board테이블의 b_idx를 현재 테이블의 b_idx로 쓰는 외래키 하나와
    // users 테이블의 user_id를 참조해(가져와) board_comments의 user_nickname로 쓰려하는거니까 각각 1게씩 이라 @JoinColumn을 쓰고

    // 만약 foreign key(b_idx) references board(b_idx),
    //     foreign key(user_nickname, user_name) references users(user_id) 이런식으로
    // users 테이블의 user_id를 user_nickname, user_name 이 두 컬럼에 쓰고자 할 때는 @JoinColumns 를 사용한다.


    //Getter & Setter
    public Integer getBcIdx() {
        return bcIdx;
    }

    public void setBcIdx(Integer bcIdx) {
        this.bcIdx = bcIdx;
    }

    public String getBcComments() {
        return bcComments;
    }

    public void setBcComments(String bcComments) {
        this.bcComments = bcComments;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public BoardEntity getBoardEntity() {
        return boardEntity;
    }

    public void setBoardEntity(BoardEntity boardEntity) {
        this.boardEntity = boardEntity;
    }
}

