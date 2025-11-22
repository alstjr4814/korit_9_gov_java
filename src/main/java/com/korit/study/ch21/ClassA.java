package korit_9_gov_java.src.main.java.com.korit.study.ch21;

public class ClassA {

    public void run() {
        Singleton.getInstance().changeData();
        Singleton.getInstance().deleteData();
    }
}
