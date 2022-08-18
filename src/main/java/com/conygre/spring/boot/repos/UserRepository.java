package com.conygre.spring.boot.repos;

import com.conygre.spring.boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
//    Get user balance
    @Query("SELECT funds FROM User WHERE email_address= :email")
    Double getUserBalanceByEmail(@Param("email") String email);
//    Update user balance
//    Set user balance

}
