package com.geulter.story.entity;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
public class RootPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rootPostId;

    private String title;

    private String content;

    private ZonedDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
