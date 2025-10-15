package com.korit.study.ch06;

public class prob04 {
    public static void main(String[] args) {
        int result = calculate(5, 10, 15, 20);
        System.out.println("결과: " + result);
    }
        public static int add(int a, int b) { return a + b; }
        public static int multiply(int a, int b) { return a * b; }
        public static int subtract(int a, int b) { return a - b; }

        public static int calculate(int a, int b, int c, int d) {
//        int addResult = add(a, b);
//        int mulrresult = multiply(addResult, c);
//        int subResult = subtract(mulrresult, d);
        return  subtract(multiply(add (a, b), c), d);
        }

}
