package com.korit.study.ch08;
//        이름을 입력했을때 등록되어 있는 사람인지 아닌지 ,  수정을 들어갔을때 이름을 입력하고 기존에 있던 이름이면 철회

import java.util.Scanner;

public class Array04 { //클래스의 이름이 생성자이며 나만의 자료형을 만드는 과정; 클래스: 내가 원하는 재료들을 조합해서 커스텀
//    class로 찍어낸 객체(인스턴스) ; 생성자를 호출하면 메모리에 객체가 만들어지고 객체안에는 데이터가 있다.하지만 각객체안에는 다른 데이터들이 있을 수 있다.
//    ex) car mycar = new car(); 차례대로 클래스이름(생성자) , 변수명, 새로운객체; 객체는 데이터와 메서드를 담고있다.
//    클래스 = 메서드라하면(데이터와 메서드); 함수 = 객체에서 얘기하는 것
    public  static  String[] names = new String[0];

    public static void main(String[] args) {
        //추가(Create), 조회(Read), 수정(Update), 삭제(Delate) CRUD
        System.out.println("[ 이름 관리 시스템]");

        showMainMenuview();
    }
    public  static void showMainMenuview() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false; //false가 (!isExit)로 들어가 반복문이 실행된다
        while (!isExit) { //true일때동안 동작한다
            System.out.println("1. 이름 추가");
            System.out.println("2. 이름 조회");
            System.out.println("3. 이름 수정");
            System.out.println("4. 이름 삭제");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            int selectedNumber = scanner.nextInt();
            scanner.nextLine();

            if (selectedNumber == 0){
                isExit = true; //0이 입력되면 true가 (!isExit)로 전달돼서 false가 되어 동작이 중지된다.
            } else if (selectedNumber == 1) {
                registerName();;
            }
        }

    }
    public static void registerName() {
        Scanner scanner = new Scanner(System.in);
        String newName = null;
        while (true) {
            System.out.println("[이름 추가 기능]");
            System.out.println("이름 입력:");
            newName = scanner.nextLine();
            if (findByName(newName) == null) { //findbyname으로 newname이 넘어가 존재여부 검사하여 null이면 break로 루프 탈출
                break;
            }
            System.out.println("이미 존재하는 이름입니다. 다시 입력하세요.");
        }

        add(newName); //break가 되고 여기서 바로 저장이 된다.
        System.out.println("<< 이름 추가 완료. >>");
    }

    public static String findByName(String name){ //이름이 배열에 있는지 없는지 확인하는 함수
        for (String n : names) { //names 배열에 들어있는 값을 앞에서부터 하나씩 꺼내서, 그 순간 ‘n’이라는 변수에 넣고, 반복문 블록을 실행해라.
            if (n.equals(name)) {
                return n;

            }
        }
        return null;
    }

    public static void add(String name) {
        String[] newArray = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            newArray[i] = names[i]; //즉 newarray는 한칸 더 크니, 마지막 1칸을 비워둔 채 기존 것만 복사하려는 것
        }
        newArray[newArray.length - 1] = name; //배열 인덱스는 0부터 시작하니까, 마지막 인덱스 = 길이 - 1
        names = newArray; //names를 새 배열로 바꿔치기 (재활용 준비 완료).
    }
    public static void showNameList() {
        Scanner scanner = new Scanner(System.in);
        int size = 4;
        while (true) {
            System.out.println("사용자 정보 조회");
            System.out.println("뒤로가려면 0을 입력하세요.");
            System.out.printf("페이지 번호 입력(1 ~ %d): ", getLastPage(size));
            int selectedPage = scanner.nextInt();
            scanner.nextLine();

            if (selectedPage == 0) {
                break;
            } else if (selectedPage > getLastPage(size)) {
                System.out.println("해당 페이지를 찾을 수 없습니다.");
            } else {
                String[] namesOfPagination = pagination(selectedPage, size);
                for (int i = 0; i < namesOfPagination.length; i++) {
                    System.out.printf("%d. %s\n", i + 1, namesOfPagination[i]);
                }
                System.out.println();
            }
        }

    }

    public static int getLastPage(int size) {
        return names.length % size == 0 ? names.length / size : names.length / size + 1;
    }

    public static String[] pagination(int page, int size) {
        int startIndex = (page - 1) * size; // (1 - 1) * 10 => 0, (2 - 1) * 10 => 10
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        int paginationArraySize = isLast && names.length % size != 0 ? names.length % size : size;
        String[] paginationArray = new String[paginationArraySize];
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = names[i];
        }
        return paginationArray;
    }
}

