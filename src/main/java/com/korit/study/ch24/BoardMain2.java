package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.List;

public class BoardMain2 {
    public static void main(String[] args) {
        List<Board> boards = new ArrayList<>();
        boards.add(new Board());
        boards.get(0).setTitle("게시판 제목1");
        boards.get(0).setWriter(new Writer("김준일", 32));
        boards.get(0).setContent("게시판 내용1");
        boards.get(0).setComments(new ArrayList<>());
        boards.get(0).getComments().add(new Comment(new Writer("김준이", 31), "댓글 내용1"));
        boards.get(0).getComments().add(new Comment(new Writer("김준삼", 31), "댓글 내용2"));

        boards.add(new Board());
    }
}












