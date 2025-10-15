package com.korit.study.ch02;

import com.sun.source.tree.StringTemplateTree;

public class Operator01 {
    public static void main(String[] args) {
//        산술연산
        int n1 = 10;
        int n2 = 5;
        int r1 = n1 + n2;
        System.out.println(r1);
//        문자열 더하기
        String text1 = "문자열";
        String text2 = "합치기";
        String text3 = text1 + text2;
        System.out.println(text3);
        System.out.println("문자열2" + "" + "합칙기2" + text1 + ":"+ r1);
//        연산으로 인한 캐스팅
        double n3 = 2.1;
        int n4 = 10;
        System.out.println(n3 + n4); //해당 자료형이 합쳐지면 자연스럽게 큰 자료형이 더블로 계산이 된다
        String n5 = "" + 2.1;
        double n6 = 10.12;
        String n7 = n5 + n6;
        System.out.println(n7);
        System.out.println(10 + 'a'); //a는 아스키코드로 97을 의미하는데 캐릭터자료형은 int자료형 하위로 107이 출력이 된다.
        System.out.println((char) ('a' + 10));
        System.out.println("" + 'a' + 'b'); //""문자열이 추가가 되면서 문자열이 상위가 되어 문자가 출력이 되고 ""이 빠지면 아스키코드합이 출력된다
//        ""이 앞에 있으면 ab가 출력되고 ""이 뒤에 있으면 197이 출력된다.
        System.out.println('a' +  ('b' + ""));

        int n8 = 10;
        int n9 = 4;
        int n10 = n8 % n9;
        System.out.println(n10);


    }
}
