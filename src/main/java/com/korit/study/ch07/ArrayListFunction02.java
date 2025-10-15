package com.korit.study.ch07;

import java.util.Scanner;

/*
문제: 복권 번호 6개를 입력(1~45, 중복 허용) 받아 배열에 순서대로 저장하고,
입력할 때마다 현재까지 저장된 번호를 출력한다.
*/
public class ArrayListFunction02 {

    public static void printLotteryAll(int[] lottery) {
        if (lottery.length == 0) {
            System.out.println("등록된 번호가 없습니다.");
        } else {
            for (int i = 0; i < lottery.length; i++) {
                System.out.println("번호(" + i + "): " + lottery[i]);
            }
        }
    }

    public static int[] addToArray(int value, int[] currentArray) {
        int[] newArray = new int[currentArray.length + 1];
        for (int i = 0; i < currentArray.length; i++) {
            newArray[i] = currentArray[i];
        }
        newArray[newArray.length - 1] = value; // 마지막 칸에 새 값
        return newArray;
    }

    public static int inputLottery(Scanner scanner) {
        System.out.print("번호입력(1~45, 중복 허용): ");
        int n = scanner.nextInt();
        // 너무 어렵게 안 가고, 간단하게 범위만 체크
        while (n < 1 || n > 45) {
            System.out.print("1~45만 가능합니다. 다시 입력: ");
            n = scanner.nextInt();
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lottery = new int[0];

        printLotteryAll(lottery);

        // 이해하기 쉽게 반복 호출 방식 유지 (6번)
        lottery = addToArray(inputLottery(scanner), lottery);
        printLotteryAll(lottery);

        lottery = addToArray(inputLottery(scanner), lottery);
        printLotteryAll(lottery);

        lottery = addToArray(inputLottery(scanner), lottery);
        printLotteryAll(lottery);

        lottery = addToArray(inputLottery(scanner), lottery);
        printLotteryAll(lottery);

        lottery = addToArray(inputLottery(scanner), lottery);
        printLotteryAll(lottery);

        lottery = addToArray(inputLottery(scanner), lottery);
        printLotteryAll(lottery);

        lottery = addToArray(inputLottery(scanner), lottery);
        printLotteryAll(lottery);

        scanner.close();
    }
}
