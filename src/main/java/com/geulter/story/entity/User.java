package com.geulter.story.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private String userId;

    private String userName;

    private String userPassword;
}
