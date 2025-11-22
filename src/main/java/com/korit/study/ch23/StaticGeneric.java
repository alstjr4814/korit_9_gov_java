package korit_9_gov_java.src.main.java.com.korit.study.ch23;

public class StaticGeneric {

    public static <T> void print(T data) {
        System.out.println(data);
    }

    public static <R extends String> void print(R data) {
        System.out.println(data);
    }

}
