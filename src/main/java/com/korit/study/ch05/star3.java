package com.korit.study.ch05;

public class star3 {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 2; j++) {
                System.out.print("*");
            }


            for (int j = 0; j < (i < 2 ? i : i < n - 1 ? i : n - 1 - i); j++) {
                System.out.print(" ");
            }


            for (int j = 0; j > i - 2; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
