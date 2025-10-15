package com.korit.study.ch04;

import java.util.Scanner;

public class Controller03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOpen = true;

        while (isOpen) { //if는 한번만 실행이 되는거고 while같은 경우 트루일시 반복해서 실행이 된다.
            System.out.println("문을 열고 들어왔습니다.");
            System.out.println("문을 닫으시겠습니까?(y / n)");
            String cmd = scanner.nextLine();
            isOpen = !"y".equals(cmd); //문자열 y가 equals과 같니? 즉 같으면 !true(false)구나 하면서 실행이 종료된다.


        }
        System.out.println("문을 닫고 나왔습니다.");

        while (true) { //if는 한번만 실행이 되는거고 while같은 경우 트루일시 반복해서 실행이 된다.
            System.out.println("문을 열고 들어왔습니다.");
            System.out.println("문을 닫으시겠습니까?(y / n)");
            String cmd = scanner.nextLine();
            if (!"y".equals(cmd)) {
                ; //문자열 y가 equals과 같니? 즉 같으면 !true(false)구나 하면서 실행이 종료된다.
                break;
            }
            System.out.println("2222");
        }

        while (true) {
            System.out.println("첫번째 반복 y/n");
            String cmd = scanner.nextLine();
            if ("y".equals(cmd)) { //해당 cmd에 n이 들어오면 false로 else로 가 끝나버리고 y일 경우 밑에 while문으로 들어간다.
                while (true) {
                    System.out.println("두번째 반복 y/n");
                    String cmd2 = scanner.nextLine();
                    if ("n".equals((cmd2))) {
                        break;
                    }
                }
            } else {
                System.out.println("종료");
                break;
            }
        }
    }
}
//while은 특정조건에서 for은 조건문에서 사용이 된다.
// 쉽게 말해 while(isOpen) 부분이 false이면 종료된다.
