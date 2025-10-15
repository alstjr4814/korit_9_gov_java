package com.korit.study.ch06;

import java.util.Date;

public class prob01 {

    public static void main(String[] args) {
        hello();
        good(" 오민석");
        int result = square(3);
        Date now = new Date();
        System.out.println(now.getHours()); //현재시간을 리턴해와라
        System.out.println(now.getMinutes()); //현재분을 리턴해와라

        System.out.println(now);
        System.out.println(result);
        System.out.println(add(23, 23));
        System.out.println(add(2.3, 2.3));
        printInfo("오민석");
//        printInfo(26);
        printInfo("오민석");
        System.out.println("------");

        printInfo("오민석", 26);
        System.out.println("------");

        printInfo("오민석", 26, "한국해양대학교");
    }

    public static void hello(){ //hello는 메서드이름
        System.out.println("안녕하세요.");
    }

    public static void good(String name){
        System.out.println("안녕하세요," + name + "님");
    }

    public static int square(int number) {
        return number * number;
    }

    public static String inNowTime(int hours, int minites){

        Date now = new Date();
        int nowHours =  now.getHours(); //현재시간을 리턴해와라
        int nowMinutes = now.getMinutes();
        return hours == nowHours && minites == nowMinutes ?  "현재 시간입니다.": "현재 시간이 아닙니다.";
    }
//연습문제2
    public static int add(int a, int b) {
        return a + b;
    }

    // 실수 2개를 더하는 함수를 오버로딩으로 작성하세요
    public static  double add(double a,  double b) {
        return  (int)(a + b);
    }

    // 정수 3개를 더하는 함수를 오버로딩으로 작성하세요
    public static  int add( int a,  int b,  int c) {
        return a + b + c;
    }
//    //연습문제 2-2
//    public static void printInfo(String name) {
//        System.out.println("이름: " + name);
//    }
//    public static void printInfo(int age) {
//        System.out.println("나이: " + age);
//    }
//연습문제 2-2
// 이름만 출력하는 함수
public static void printInfo(String name) {
    System.out.println("이름: " + name);
}

    // 이름과 나이를 출력하는 함수 (오버로딩)
    public static void printInfo(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    // 이름, 나이, 학교를 출력하는 함수 (오버로딩)
    public static void printInfo(String name, int age, String school) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("학교: " + school);
    }

//연습문제 3-1
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void checkTemperatureConversion(double celsius) {
    }

}
