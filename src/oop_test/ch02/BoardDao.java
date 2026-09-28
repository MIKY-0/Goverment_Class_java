package oop_test.ch02;

import oop_test.ch01.Member;

public class BoardDao {
    public void insertPost(Board board) {
        System.out.println(board.getTitle() + " - 게시글이 DB에 등록되었습니다.");
    }
}
