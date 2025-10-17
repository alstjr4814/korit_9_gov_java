package com.korit.study.ch22;

import java.util.Objects;

public class SignupMain {
    public static void main(String[] args) {
        String prevPassword = "test1234";
        String currentPassword = "test1234";
        int prevPasswordHashcode = Objects.hash(prevPassword);
        int currentPasswordHashcode = Objects.hash(currentPassword);
        int encodedPassword = prevPasswordHashcode * 10;
        System.out.println(prevPasswordHashcode);
        System.out.println(currentPasswordHashcode);
        System.out.println(encodedPassword);
        System.out.println(encodedPassword / 10);
    }
}
