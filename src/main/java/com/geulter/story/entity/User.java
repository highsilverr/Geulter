package com.geulter.story.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private Long userId;

    private String userName;

    private String userNickname;

    private String userPassword;
}
