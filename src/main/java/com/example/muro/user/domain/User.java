package com.example.muro.user.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long userId;
    private String email;
    private String nickname;
    private String password;
    public Long getUserId() {
        return this.userId;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setNickname(final String nickname) {
        this.nickname = nickname;
    }

    protected User() {
    }

    public User(final Long userID, final String email, final String nickname, final String password){
        this.userId = userID;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
    }




}
