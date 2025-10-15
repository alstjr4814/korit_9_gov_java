package com.korit.study.ch07; //개어렵다

import java.util.Scanner;

public class ArrayListFunction {

    public static void printNamesAll(String[] names){
        if(names.length == 0){
            System.out.println("등록된 이름이 없습니다.");
        }else {
            for(int i = 0; i < names.length; i++){
                System.out.println("이름(" + i + "): " + names[i]);
            }
        }
    }




    public static String[] addToArray(String value, String[] currentArray){
        String[] newArray = new String[currentArray.length + 1];
        for (int i = 0; i < currentArray.length; i++){
            newArray[i] = currentArray[i];
        }
        newArray[newArray.length - 1] = value; //새로운 배열에 마지마에 value만드는데
        return  newArray;
    }

public  static String inputName(){
    Scanner scanner = new Scanner(System.in);

    System.out.println(" 이름입력: ");
    return  scanner.nextLine();
}

    public  static String[] addInputNameTonames(String[] names){
        String name = inputName();
        return addToArray(name, names); //배열 함수에 names가 리턴

    }

    public static void main(String[] args) { //메인에서 시작
        String[] names = new String[0];

        printNamesAll(names);
        names = addInputNameTonames(names); //실행되면 문자열 배열을 가져온다
        printNamesAll(names); //최종적으로 printnamesall 호출
        names = addInputNameTonames(names); //실행되면 문자열 배열을 가져온다
        printNamesAll(names);
        names = addInputNameTonames(names); //실행되면 문자열 배열을 가져온다
        printNamesAll(names);
        names = addInputNameTonames(names); //실행되면 문자열 배열을 가져온다
        printNamesAll(names);


    }
}
