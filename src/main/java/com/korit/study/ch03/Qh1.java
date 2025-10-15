package com.korit.study.ch03;

import java.util.Scanner;

public class Qh1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 이름을 입력하세요: ");
        String name = scanner.next();
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        System.out.print("학년을 입력하세요: ");
        int grade = scanner.nextInt();
        System.out.println("국어 점수를 입력하세요: ");
        double korean = scanner.nextDouble();
        System.out.println("영어 점수를 입력하세요: ");
        double english = scanner.nextDouble();
        System.out.println("수학 점수를 입력하세요: ");
        double math = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("자기소개를 입력하세요:");
        String self = scanner.nextLine();
        double total = korean + english + math;
        double average = total / 3;
        String gra = average >= 95 ? "A+":
                average >= 90 ? "A":
                        average >= 85 ? "B+":
                                average >= 80 ? "B":
                                        average >= 75 ? "c+":
                                                average >= 70 ? "c":
                                                        average >= 65 ? "d+":
                                                                average >= 60 ? "d": "f";

        System.out.println("=== 학생 .+정보 ===");
        System.out.println("이름:" + name);
        System.out.println("나이:" + age + "(대학교 4학년)");
        System.out.println("성적:");
        System.out.println("국어:" + korean);
        System.out.println("영어:" + english);
        System.out.println("수학:" + math);
        System.out.println("평균:" + average +"(학점:)" + gra);
        System.out.println("자기소개:" + self);
    }
}