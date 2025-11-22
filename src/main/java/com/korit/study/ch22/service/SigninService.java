package korit_9_gov_java.src.main.java.com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SigninDto;

public interface SigninService {
    void signin(SigninDto signinDto);
    boolean isEmpty(String str);    //공백을 포함하면 안됨
}
