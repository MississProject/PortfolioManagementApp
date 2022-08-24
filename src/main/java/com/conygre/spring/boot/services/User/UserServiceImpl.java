package com.conygre.spring.boot.services.User;

import com.conygre.spring.boot.entities.User;
import com.conygre.spring.boot.repos.User.UserRepository;

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

    @Override
    public void setUserBalanceByEmail(Double balance, String email) {
        dao.setUserBalanceByEmail(balance, email);
    }

    @Override
    public User getUserByEmail(String email) {
        return dao.getUserByEmail(email);
    }
}
