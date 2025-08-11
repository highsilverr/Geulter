package com.geulter.story.service;

import com.geulter.story.entity.RootPost;
import com.geulter.story.entity.User;
import com.geulter.story.entity.dto.RootPostRequestDTO;
import com.geulter.story.repository.RootPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RootPostService {

    private final RootPostRepository rootPostRepository;

    public RootPost createRootPost(RootPostRequestDTO dto, User user){
        return RootPost.of(
                dto.getTitle(),
                dto.getContent(),
                dto.getRootPostWriter(),
                user
        );
    }
}
