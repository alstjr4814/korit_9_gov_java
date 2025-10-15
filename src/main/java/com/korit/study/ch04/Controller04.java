package com.korit.study.ch04;

public class Controller04 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { //초기문, 조건문, 후처리문; 증감식 조건문에 유리함
            System.out.println(i);
        }

        int i = 0; //for와 while에 i라는 변수를 두번 선언했다.
        while (i < 5) { //while문 같은경우에는 변수가 밖에 선언되고 for문은 안에 선언된다는 차이점
            System.out.println(i);
            i++; //while문에서는 증감연산자를 꼭 넣어야 한다.
        }
        //2에서 100사이의 숫자 중 4의 배수만 출력해라
        for(int a = 2; a < 100; a++){
            if (a % 4 == 0)
            System.out.println(a);
        }
        // i가 20번 반복할건데 0부터 시작해서 i=홀수, i=짝수 인지 판별하는 코드
        for(int b = 0; b <=20; b++){
            if(b % 2 == 0){
                System.out.println(b + "= 짝수");
            }else{
                System.out.println(b + "= 홀수");}
        }
        for(int c = 0; c <=20; c++) {
            int n = c + 1;
            System.out.printf("%,d = %s\n", n , n % 2 == 0 ? "짝" : "홀");

        if (n % 2 == 0) {
            System.out.println(n + "= 짝");
            continue; //만약 나머지연산이 0이 아니라면 false로 밑에 soud가 출력이 된다.
        }             //
            System.out.println(n + " = 홀");
        }


    }
}
// class안에 main이 main안에 for과 while이 있는데 for안에서만 사용되는 i라는 변수가
// 있고  while에서만 쓰는 i라는 변수가 있어서 i라는 변수를 두개 쓸 수 있다.
// 즉 지역변수를 볼 줄 알아야 한다.
//해당 내용을 이해할라면 스택과 큐에 대해서 이해를 해야 한다.

