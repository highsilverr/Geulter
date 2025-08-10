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

    // 글쓴이 이름 (비회원도 고려)
    private String rootPostWriter;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = true)
    private User user;

}
