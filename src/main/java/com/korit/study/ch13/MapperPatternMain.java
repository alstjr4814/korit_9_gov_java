package com.korit.study.ch13;

public class MapperPatternMain { //mapperpattern = 클라이언에서 받은객체를 데이터베이스에보낼객체 바꾸는 방법
    public static void main(String[] args) {

//        Mapper Pattern
        클라이언에서받은객체 a = new 클라이언에서받은객체();
        a.username = "test1234";
        a.password = "1q2w3e4r";
        a.fullname = "김준일";
        a.email = "alstjr4814@naver.com";

        데이터베이스에보낼객체 b = new 데이터베이스에보낼객체(); //a에 있는 객체들을 b로 옮김
        b.username = a.username;
        b.password = a.password;
        b.name = a.fullname;
        b.email = a.email;

        데이터베이스에보낼객체 c = a.to();
    }
}
