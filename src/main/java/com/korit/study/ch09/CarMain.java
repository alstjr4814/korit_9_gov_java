package com.korit.study.ch09;

public class CarMain {

    static class Car {
        String model;
        String color;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "소나타";
        c1.color = "검정색";

        Car c2 = new Car();
        c2.model = "아반떼";
        c2.color = "파랑색";

        Car c3 = new Car();
        System.out.println(c3.model);

        int a = 10;
        System.out.println(a);

    }

}
