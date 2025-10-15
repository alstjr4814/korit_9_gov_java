package com.korit.study.ch04;

import java.util.Scanner;

public class Controller65 {
    public static void main(String[] args) {
        //중첩 반복
        for (int i = 0; i < 5; i++){
            System.out.println("1 = " + i);
            for (int j = 0; j < i; j++){
                System.out.println("j = " + j);
            }
        }

        /*구구단*/
        Scanner scanner = new Scanner(System.in);
        int startDan = 0;
        int endDan = 0;
        startDan = scanner.nextInt();
        endDan = scanner.nextInt();

        for (int i = 0; i < endDan - startDan; i++) {
            int num1 = (endDan - i);
            System.out.printf("%,d단\n", num1);
            for (int j = 0; j < 9; j++) {
                int num2 = 9 - j;
                int result = num1 * num2;
                System.out.printf("%d * %d =%d\n",num1,num2,result);

            }
        }

        scanner.close();
    }
}
