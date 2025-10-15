package com.korit.study.ch09;

public class StudentMain {
    //2명의 학생정보를 객체를 사용하여 정의하고 출력하는 프로그램을 작성하시오.
    static class Student {
        String 이름;
        int 나이;
        boolean 성별;

        void printInfo() {
            System.out.println("학생 정보 출력");
            System.out.println("이름: " + 이름);
            System.out.println("나이: " + 나이);
            System.out.println("성별: " + 성별);
        }

        public static void main(String[] args) {
            Student st1 = new Student();
            st1.이름 = "오민석";
            st1.나이 = 26;
            st1.성별 = true;

            Student st2 = new Student();
            st2.이름 = "문수현";
            st2.나이 = 24;
            st2.성별 = false;

            info(st1.이름, st1.나이);
            info2(st1.성별);

            info(st2.이름, st2.나이);
            info2(st2.성별);

            st2.printInfo();
        }

        public static void info(String 이름, int 나이) {
            System.out.println("이름:" + 이름);
            System.out.println("나이:" + 나이);

        }

        public static void info2(boolean 성별) {
            if (성별) {
                System.out.println("성별 : 남");
            } else {
                System.out.println("성별 : 여");
            }
        }
    }
}
