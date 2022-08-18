package com.conygre.spring.boot.services;

import com.conygre.spring.boot.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository dao;

    @Transactional(propagation = Propagation.REQUIRED)
    public Double getUserBalanceByEmail(String email) {
        return dao.getUserBalanceByEmail(email);
    }
}
