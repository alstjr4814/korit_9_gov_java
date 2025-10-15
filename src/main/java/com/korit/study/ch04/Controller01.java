package com.korit.study.ch04;

public class Controller01 {
    public static void main(String[] args) {
        int num = 10;

        String text = num > 5 ? "5보다 큽니다." : "5이하 입니다.";
        System.out.println(text);

        if (num > 5) { //삼항과 명령문의 차이: 연산과 멸령실행은 구분되어야 한다.
            System.out.println("5보다 큽니다.");
        } else {
            System.out.println("5이하 입니다.");
        }

        int score = 85;

        if (score > 50) System.out.println("50보다 큽니다.");
        else System.out.println("50이하 입니다."); //if와 else 둘 다 출력값이 하나일 경우 중괄호가 없어도 실행이 가능하다.

        if (score >= 95) {
            System.out.println("A+");
        } else if (score >= 90) { //else는 하나의 명령어일 경우 {}을 사용 안한다.
            System.out.println("A");
        } else if (score >= 85) {
            System.out.println("B+");
        } else {
            
            System.out.println("B");
        }

    }
}
