package com.titiredennis.curs9.facebook.repository;

import com.titiredennis.curs9.facebook.dto.EditPost;
import com.titiredennis.curs9.facebook.model.Post;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PostRepositoryImpl implements PostRepository {

    private static PostRepositoryImpl postRepository;

    public static PostRepositoryImpl getInstance() {
        if (postRepository == null) {
            System.out.println("Cream Post Repository Impl");
            postRepository = new PostRepositoryImpl();
            return postRepository;
        } else {
            System.out.println("Il avem deja. Doar il returnam!");
            return postRepository;
        }
    }

    public PostRepositoryImpl() {
    }

    Map<UUID, Post> posts = new HashMap<>();

    @Override
    public UUID createPost(Post post) {
        posts.put(post.getId(), post);
        return post.getId();
    }

    @Override
    public void editPost(Post post) {
        posts.put(post.getId(), post);
    }

    @Override
    public void deletePost(UUID id) {
        posts.remove(id);
    }

    @Override
    public Post getPost(UUID id) {
        return posts.get(id);
    }


}
