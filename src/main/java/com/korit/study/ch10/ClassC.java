package com.korit.study.ch10;
//이름과 나이를 받을 수 있게
public class ClassC {
    String name;
    int age;
    String address;

     //생성자 오버로딩
    //함수를 정의할때 이름을 동일하게 할 수 있는 조건, 매개변수 타입, 갯수, 자리위치가 다르면

    ClassC(){

    }

    ClassC(String name, int age){
        this.name = name;
        this.age = age;
    }

    ClassC(String name){
        this.name = name;
    }

    ClassC(int age){
        this.age = age;
    }

    ClassC(String name, int age, String adress){
        this.name = name;
        this.age = age;
        this.address = adress;
    }
}
