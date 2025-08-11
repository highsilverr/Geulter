package com.geulter.story.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

    public static RootPost of(String title, String content, String rootPostWriter, User user){
        return builder()
                .title(title)
                .content(content)
                .createdAt(ZonedDateTime.now())
                .rootPostWriter(rootPostWriter)
                .user(user)
                .build();
    }
}
