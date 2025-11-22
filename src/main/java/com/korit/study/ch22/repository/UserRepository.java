package korit_9_gov_java.src.main.java.com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

public interface UserRepository {
    void insert(User user);
    User findByUsername(String username);
}
