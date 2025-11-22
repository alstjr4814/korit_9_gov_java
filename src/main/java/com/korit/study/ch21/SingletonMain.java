package korit_9_gov_java.src.main.java.com.korit.study.ch21;

public class SingletonMain {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
//        Singleton singleton = new Singleton("test");

        a.run();
        b.run();
        c.run();

    }
}
