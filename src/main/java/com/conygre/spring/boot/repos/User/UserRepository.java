package com.conygre.spring.boot.repos.User;

import com.conygre.spring.boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
//    Get user balance
    @Query("SELECT funds FROM User WHERE email_address= :email")
    Double getUserBalanceByEmail(@Param("email") String email);
//    Update user balance
    @Modifying
    @Transactional
    @Query("UPDATE User SET funds= :balance WHERE email_address= :email")
    void setUserBalanceByEmail(@Param("balance") Double balance, @Param("email") String email);
//    Get user
    @Query(value = "SELECT * FROM Users WHERE email_address= :email", nativeQuery = true)
    User getUserByEmail(@Param("email") String email);
}
