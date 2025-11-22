package korit_9_gov_java.src.main.java.com.korit.study.ch14;

public class SigninDto {
    String username;
    String password;

    public SigninDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "SigninDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
