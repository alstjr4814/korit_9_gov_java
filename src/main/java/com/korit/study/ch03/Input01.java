package com.korit.study.ch03;

import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Scanner s = new Scanner((inputStream));
        String str = s.nextLine();
        System.out.println("입력값: " + str);
        String address = s.nextLine(); //문자열을 받을당시에는 next보다는 nextLine이 맞다
        System.out.println("주소: " + address);
    }
}
