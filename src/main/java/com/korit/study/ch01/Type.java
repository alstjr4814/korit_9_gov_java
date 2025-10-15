package com.korit.study.ch01;

import java.util.Date;

/**
 *
 */
public class Type {
    public static void main(String[] args){

//      논리 자료형
        boolean open;
        open = true; //최초의 대입을 하는것이 초기화
        System.out.println(open);
        open = false;
        System.out.println(open);

//      문자 자료형
        char lastName = '오';
        System.out.println(lastName);
//        char firstName = '준일';

//      문자열 자료형
        String firstName = "민석";
        System.out.println(firstName);
        String contents1 = "안녕하세요. \n오민석입니다.";
                System.out.println(contents1);
        String contents2 = """
                안녕하세요.
                오민석입니다.
                """;
        System.out.println(contents2);

        double avg = 89.33;
        System.out.println(avg);
        int number = 100000;
        System.out.println(number);
        long nowTime = new Date().getTime();
        System.out.println(nowTime);
        long longNumber = 220000001;
        System.out.println(longNumber);

//        상수
        final String uploadPath = "~/upload/image"; //경록가 바뀌면 안될 당시
        final String UPLOAD_PATH = "~/upload/image"; //상수명이 대문자로 되어 있으면 바꾸면 안된다는 것

    }
}

