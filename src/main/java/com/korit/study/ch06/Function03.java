package com.korit.study.ch06;
// 오버로딩 → 메서드 이름은 같지만, 매개변수의 타입이나 개수가 달라서 여러 버전을 정의하는 것.
// 매개변수(parameter): 메서드 선언할 때 괄호 안에 적는 변수 이름
// static → 객체를 만들지 않고도 실행할 수 있다
// void → 리턴값이 없다 (받을 게 없음)
public class Function03 {
    public static void main(String[] args) {
        int r1 = sum(1);
        System.out.println(r1);
        int r2 = sum(10.5);
        System.out.println(r2);
        int r3 = sum(10, 2.5);
        System.out.println(r3);
        int r4 = sum(2.5, 10);
        System.out.println(r4);
    }

    static int sum(int n) {
        return  n + 10;

    }
    static int sum(double n) {
        return (int) (n + 20);
    }

    static int sum(int n1, double n2){ //두번째에 더블이 들어오면 해당매개변수
        return (int) (n1 + n2);
    }

    static int sum(double n1, int n2) { //첫번째에 더블이 들어오면 해당매개변수
        return (int) (n1 + n2);
    }
}
