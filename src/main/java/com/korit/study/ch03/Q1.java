package com.korit.study.ch03;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생 이름을 입력하세요: ");
        String name = scanner.next();
        System.out.println("나이를 입력하세요: ");
        String age = scanner.next();
        System.out.println("학년을 입력하세요: ");
        String grade = scanner.next();
        System.out.println("국어 점수를 입력하세요: ");
        int korean = scanner.nextInt();
        System.out.println("영어 점수를 입력하세요: ");
        int english = scanner.nextInt();
        System.out.println("수학 점수를 입력하세요: ");
        int math = scanner.nextInt();
        System.out.println("자기소개를 입력하세요:");
        String self = scanner.next();
        double average = (korean + english + math) / 3.0;

        System.out.println("=== 학생 정보 ===");
        System.out.println("이름:" + name);
        System.out.println("나이:" + age);
        System.out.println("성적:");
        System.out.println("국어:" + korean);
        System.out.println("영어:" + english);
        System.out.println("수학:" + math);
        System.out.println("평균:" + average);
        System.out.println("자기소개:" + self);


    }
}
