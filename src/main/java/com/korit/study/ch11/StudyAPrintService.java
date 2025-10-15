package com.korit.study.ch11;

public class StudyAPrintService {

    void printInfoAll(Study study) {
        printInfoSubject(study.subject);
        printInfoStudents(study.students); // ← 오타 수정: printInfosTudents -> printInfoStudents
    }

    void printInfoSubject(Subject subject) {
        System.out.println("[과목정보]");
        System.out.println("과목명:" + subject.name);
        printInfoTeacher(subject.teacher);
    }

    void printInfoTeacher(Teacher teacher){
        System.out.println("[선생정보]");      // ← 닫는 대괄호 추가
        System.out.println("선생이름:" + teacher.name);
        System.out.println("선생나이:" + teacher.age); // ← 콜론 통일
    }

    void printInfoStudents(Student[] students){
        System.out.println("[학생정보 전체조회]");
        for (Student student : students) {
            printInfoStudent(student); // ← 중첩 메서드 밖으로 분리해서 호출
        }
    }

    // ← 여기로 분리 (자바는 메서드 안에 메서드 정의 불가)
    void printInfoStudent(Student student) {
        System.out.println("[학생정보]");
        System.out.println("학번:" + student.id);     // ← 콜론 통일
        System.out.println("학생이름:" + student.name);
        System.out.println("학생나이:" + student.age);
    }

}
