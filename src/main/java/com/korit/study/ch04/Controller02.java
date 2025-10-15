package com.korit.study.ch04;

import java.util.Scanner;

public class Controller02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름: ");
        String name = scanner.nextLine();

        switch (name) { //switch()해당 숫자의 case로 이동하여 그 위치에서 시작한다.
            case "오민석":
                System.out.println("1");
            case "육민석":
                System.out.println("2");
            case "칠민석":
                System.out.println("3");
                break;
            default:
                System.out.println("나머지");

        }
    }
}
