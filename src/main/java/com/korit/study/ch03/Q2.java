package com.korit.study.ch03;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stock = 0;
        int price = 0;
        int addressCode = 0;

        System.out.print("고객 ID를 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("상품 코드를 입력하세요: ");
        String code = scanner.nextLine();
        System.out.print("상품명을 입력하세요: ");
        String pdname = scanner.nextLine();
        System.out.print("수량을 입력하세요: ");
        int pdcode = scanner.nextInt();
        System.out.print("단가를 입력하세요: ");
        int unitprice = scanner.nextInt();
        System.out.print("우편번호를 입력하세요: ");
        int postalCode = scanner.nextInt();
        scanner.nextLine(); //int 뒤에는 nextlin 허공에 작성
        System.out.print("배송주소를 입력하세요: ");
        String dladress = scanner.nextLine();
        int 단가 = pdcode * unitprice;

//        System.out.println(String.format("""
//                """));
        System.out.println("=== 주문 확인서 ===");
        System.out.println("고객 ID:" + name);
        System.out.println("상품코드:" + code);
        System.out.println("상품명:" + pdname);
        System.out.println("단가:" + 단가);
        System.out.println("배송정보:");
        System.out.println("우편번호:" + postalCode );
        System.out.println("주소:" + dladress);
        System.out.println("배송비:" + "무료 (3만원 이상 구매)" );
        System.out.println("총 결제 금액:" + pdcode + "원 *" + unitprice + "개 =" + 단가 );




    }
}