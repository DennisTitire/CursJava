package com.titiredennis.curs9.facebook.controller;

import com.titiredennis.curs9.facebook.dto.CreatePost;
import com.titiredennis.curs9.facebook.dto.EditPost;
import com.titiredennis.curs9.facebook.dto.EditProfile;
import com.titiredennis.curs9.facebook.model.Post;
import com.titiredennis.curs9.facebook.service.PostService;
import com.titiredennis.curs9.facebook.service.PostServiceImpl;

import java.util.UUID;

public class PostControllerImpl implements PostController{

    private final PostService postService;

    public PostControllerImpl() {
        postService = new PostServiceImpl();
    }

    @Override
    public UUID createPost(CreatePost createPost) {
        return postService.createPost(createPost);
    }

    @Override
    public void editPost(UUID id, EditPost editPost) {
        postService.editPost(id, editPost);
    }

    @Override
    public void deletePost(UUID id) {
        postService.deletePost(id);
    }

    @Override
    public Post getPost(UUID id) {
        return postService.getPost(id);
    }


}
