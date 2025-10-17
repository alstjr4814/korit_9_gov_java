package com.korit.study.ch22.service;

import com.korit.study.ch22.repository.UserRepository;

import java.util.Objects;

public class SignupService {
    // 1. instance static 변수 정의
    private static SignupService instance;
    private UserRepository userRepository;

    private SignupService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SignupService getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SignupService(UserRepository.getInstance());
        }
        return instance;
    }

    public boolean validDuplicatedUsername(String username) {
        return true;
    }
}
