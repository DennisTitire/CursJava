package com.titiredennis.curs9.facebook.service;

import com.titiredennis.curs9.facebook.dto.CreatePost;
import com.titiredennis.curs9.facebook.dto.EditPost;
import com.titiredennis.curs9.facebook.dto.EditProfile;
import com.titiredennis.curs9.facebook.model.Post;
import com.titiredennis.curs9.facebook.repository.PostRepository;
import com.titiredennis.curs9.facebook.repository.PostRepositoryImpl;

import java.util.UUID;

public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl() {
        postRepository = PostRepositoryImpl.getInstance();
    }

    @Override
    public UUID createPost(CreatePost createPost) {
        Post post = new Post(createPost.getTitlu(), createPost.getDescriere(), createPost.getDataCreare(), createPost.getOwnerId());
        return postRepository.createPost(post);
    }

    @Override
    public void editPost(UUID id, EditPost editPost) {
        Post post = postRepository.getPost(id);
        post.setTitlu(editPost.getTitlu());
        post.setDescriere(editPost.getDescriere());
    }

    @Override
    public void deletePost(UUID id) {
        postRepository.deletePost(id);
    }

    @Override
    public Post getPost(UUID id) {
        return postRepository.getPost(id);
    }
}
