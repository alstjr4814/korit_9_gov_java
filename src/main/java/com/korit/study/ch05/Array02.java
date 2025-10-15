package com.korit.study.ch05;

public class Array02 {
    public static void main(String[] args) {
        int[][] nums = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[] num2 = nums[1];
        int num = num2[2];
        System.out.println(nums[1][1]);
        System.out.println(num);

        int nums3 = new int[][] { {1,2,3}, {4,5,6}, {7,8,9} }[1][1];
        int[] nums4 = new int[][] { {1,2,3}, {4,5,6}, {7,8,9} }[1];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
                System.out.println(nums4[0]);
//                [] = 행을 받을라면, [][] = 전체를 받을라면,  = 값(정수)을 받을라면
//                대괄호를 변수뒤에든 자료형뒤에든 붙여도 된다 하지만 자료형 뒤에 붙이는걸 권장

            }
        }
    }
}
