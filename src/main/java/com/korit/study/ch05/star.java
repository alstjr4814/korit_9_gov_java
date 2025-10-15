package com.korit.study.ch05;

public class star {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {           // 줄 수 (총 4줄)
            for (int j = 0; j < i + 1; j++) {   // 해당 줄에서 별 찍기
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈
        }
        for (int i = 0; i < 4; i++) {           // 줄 수 (총 4줄)
            for (int j = 0; j < 4 - i; j++) {   // 해당 줄에서 별 찍기
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈
        }

        System.out.println();
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 2; j++) {
                System.out.print("*");
            }
            System.out.print("*");


        System.out.print(i == 0 || i == n - 1 ? "" : " ");

//        for (int j = 0; j < (i < 2 ? 1 : (i < n - 1 ? i * 2 - 1 : n - 1 - i)); j++) {
//            System.out.print(" ");
//        }


        for (int j = 0; j < i - 1; j++) {
            System.out.print("*");
        }

        System.out.println();
        }

    }
}
