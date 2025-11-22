package korit_9_gov_java.src.main.java.com.korit.study.ch12;

public class Comment {
    int id;
    String contents;
    Writer writer;

    Comment(int id, String contents, Writer writer) {
        this.id = id;
        this.contents = contents;
        this.writer = writer;
    }
}
