package com.titiredennis.curs9.facebook.repository;

import com.titiredennis.curs9.facebook.dto.EditPost;
import com.titiredennis.curs9.facebook.model.Post;

import java.util.UUID;

public interface PostRepository {

    UUID createPost(Post post);

    void editPost(Post post);

    void deletePost(UUID id);

    Post getPost(UUID id);
}
