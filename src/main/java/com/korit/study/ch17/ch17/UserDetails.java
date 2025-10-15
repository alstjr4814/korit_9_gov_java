package com.korit.study.ch17.ch17;

public interface UserDetails {

    String getUsername();
    String getPassword();
    GrantedAuthority[] getAuthorities();

}
