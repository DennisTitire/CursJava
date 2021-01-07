package com.titiredennis.curs9.facebook.service;

import com.titiredennis.curs9.facebook.dto.CreatePost;
import com.titiredennis.curs9.facebook.dto.EditPost;
import com.titiredennis.curs9.facebook.dto.EditProfile;
import com.titiredennis.curs9.facebook.model.Post;

import java.util.UUID;

public interface PostService {

    UUID createPost(CreatePost createPost);

    void editPost(UUID id, EditPost editPost);

    void deletePost(UUID id);

    Post getPost(UUID id);
}
