package com.geulter.story.repository;

import com.geulter.story.entity.RootPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RootPostRepository extends JpaRepository<RootPost, Long> {
}
