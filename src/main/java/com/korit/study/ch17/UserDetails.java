package korit_9_gov_java.src.main.java.com.korit.study.ch17;

public interface UserDetails {

    public abstract String getUsername();
    public abstract String getPassword();
    public abstract GrantedAuthority[] getAuthorities();
}
