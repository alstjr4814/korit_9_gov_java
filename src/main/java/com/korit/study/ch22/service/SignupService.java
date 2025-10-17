package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.util.PasswordEncoder;

import java.util.Objects;

public class SignupService {
    // 1. instance static 변수 정의
    private static SignupService instance;
    private UserRepository userRepository;

    // 클래스에서만 생성이 가능하도록 셋팅
    private SignupService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SignupService getInstance() {
        if(Objects.isNull(instance)) {
            instance = new SignupService(UserRepository.getInstans());
        }
        return instance;
    }

    public boolean isValidDuplicatedUsername(String username) {
        User foundUser = userRepository.findByusername(username);
        if (Objects.isNull(foundUser)) {
            return true;
        }
        return false;
    }
//  null인지 빈 공간이 있는지 확인하는 코드
    public boolean isValidPassword(String password) {
        return !Objects.isNull(password) && !password.isBlank();
    }

    public boolean isValidConfirmPassword(String password, String confirmpassword) {
        if (Objects.isNull(password) || Objects.isNull(confirmpassword)) {
            return false;
        }
        return password.equals(confirmpassword);
    }
//
    public void signup(SignupDto signupDto) {
//        User newUser = new User(0, signupDto.getUsername(), PasswordEncoder.encode(signupDto.getPassword()));
        userRepository.insert(signupDto.toUser());
    }



}
