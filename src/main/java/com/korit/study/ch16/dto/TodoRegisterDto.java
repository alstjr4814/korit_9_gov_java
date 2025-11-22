package korit_9_gov_java.src.main.java.com.korit.study.ch16.dto;

import korit_9_gov_java.src.main.java.com.korit.study.ch16.entity.Todo;
import korit_9_gov_java.src.main.java.com.korit.study.ch16.entity.User;

import java.time.LocalDateTime;

public class TodoRegisterDto {
    private String contents;
    private User user;

    public TodoRegisterDto(String contents, User user) {
        this.contents = contents;
        this.user = user;
    }

    @Override
    public String toString() {
        return "TodoRegisterDto{" +
                "contents='" + contents + '\'' +
                ", user=" + user +
                '}';
    }

    public Todo toTodo() {
        return new Todo(0, contents, user, LocalDateTime.now());
    }
}
