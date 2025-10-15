package com.korit.study.ch08;

public class Array02 {
    public static void main(String[] args) {
        String[] 사원ID = {"E1001", "E1002", "E1003", "E1004"};
        String[] 이름   = {"김민준", "이서연", "박지훈", "최예나"};
        String[] 부서   = {"영업팀", "마케팅팀", "개발팀", "인사팀"};
        String[] 직급   = {"사원", "대리", "과장", "차장"};

        String name = "이서연";

        int foundIndex = -1; //이름이 같으면 그이름에 인덱스를 파운드에 대입해라
        for( int i = 0; i < 이름.length; i++){ //탐색에 있어서 중복된값이 있을시 해당인덱스를 찾으면 먼저 찾은 인덱스를 가진다
            if (이름[i] == name) {
                foundIndex = i;
                break; //선형탐색을 한다고 하면 무조건 break를 건다 (하나의 데이터를 찾는다고하면)
            }
        }

        printInfo(사원ID, 이름, 부서, 직급, foundIndex); //배열들을 모두 넘겨주고 출력하고자하는 인덱스번호를 입력
    }

    public static void printInfo(String[] 사원ID,
                                 String[] 이름,
                                 String[] 부서,
                                 String[] 직급,
                                 int index) {

//        String text = String.format("""
//                사원ID: %s
//                이름: %s
//                부서: %s
//                직급: %s
//                """,
//                사원ID[index], 이름[index], 부서[index], 직급[index]);
//
//        System.out.print(text);

        System.out.printf("""
                사원ID: %s
                이름: %s
                부서: %s
                직급: %s
                """,
                사원ID[index], 이름[index], 부서[index], 직급[index]);
    }
}
