package com.korit.study.ch05;

public class Array01 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int[] nums = {1, 2, 3}; //정수와 정수배열은 다르다. 즉 묶어서 배열에 넣어야한다.
        int[] nums2 = new int[] {1, 2, 3, 0, 0}; //new int[] 해당 대괄호안에는 공간의 크기를 결정한다. ;
                        //중괄호안에 1,2,3을 바로 두면 3개의 공간에 3개의 값이 저장이 되고 만약 4,5인덱스에 공간을 일단 비워두고 싶다면 new int[]을 하고 해당 중괄호 처럼 4,5에 0을 기입한다
        int[] nums3 = new int[3]; //빈공간3개를 만든거다 ; 회사에서는 이거 쓴다.
                nums3[0] = 1;
                nums3[1] = 2;
                nums3[2] = 3; //빈공간에 1,2,3을 이렇게 넣어야 nums와 똑같으 결과값을 가진다.

        System.out.println(new int[] {1, 2, 3}[0]); //0번 인덱스를 출력해라
//        System.out.println({1, 2, 3}[0]);

        for (int i = 0; i < 3; i++){
            System.out.println(nums[i]);
        }

        String[] namse = new String[] {"오민석","육민석","칠민석"};
        for (int i = 0; i < 3; i++){
            System.out.println("이름: " + namse[i]);
        }

        for (int num : new int[] {1, 2, 3, 4}) {
            System.out.println(num);
        }
    }
}