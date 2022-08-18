package com.conygre.spring.boot.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    // @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="email_address")
    private String emailAddress;

    @Column(name="user_name") private String userName;
    @Column(name="funds") private Double funds;

    public User() {
    }

    public User(String emailAddress, String userName, Double funds) {
        this.emailAddress = emailAddress;
        this.userName = userName;
        this.funds = funds;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getFunds() {
        return funds;
    }

    public void setFunds(Double funds) {
        this.funds = funds;
    }
}
