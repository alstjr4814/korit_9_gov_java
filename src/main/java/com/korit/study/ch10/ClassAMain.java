package com.korit.study.ch10;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.name = "오민석"; //a.name = a라는 인스턴스가 가지고 있는 주소에 변수를 참조해라
        a.age = 26;

        ClassB b = new ClassB("오민석", 26); // 생성자(ClassB 즉 클래스명)에게 매개변수로 값을 전달한다.
        System.out.println(b.name);
        System.out.println(b.age);

        ClassC c = new ClassC("오민석", 26, "영도구");
        ClassC d = new ClassC();//해당 클래스는 매개변수에 이름, 나이 둘 중 하나만 들어가도 된다(오버로딩 한 상태라)
//        ClassC c = new ClassC( 26);
//        ClassC c = new ClassC("오민석");
    }
}

