package com.geulter.story.entity;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
public class RelayEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long relayEntryId;

    private String relayEntryContent;

    private ZonedDateTime relayEntryCreatedAt;

    private int relayEntryDepth;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "root_post_id", nullable = false)
    private RootPost rootPost;

    @OneToOne
    @JoinColumn(name = "relay_entry_parent_id", nullable = false)
    private RelayEntry relayEntry;

}
