package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.User;

public interface UserService {
    Double getUserBalanceByEmail(String email);
}
