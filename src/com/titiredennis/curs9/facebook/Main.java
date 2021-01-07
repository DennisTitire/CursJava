package com.titiredennis.curs9.facebook;

import com.titiredennis.curs9.facebook.controller.PostController;
import com.titiredennis.curs9.facebook.controller.PostControllerImpl;
import com.titiredennis.curs9.facebook.controller.ProfileController;
import com.titiredennis.curs9.facebook.controller.ProfileControllerImpl;
import com.titiredennis.curs9.facebook.dto.CreatePost;
import com.titiredennis.curs9.facebook.dto.CreateProfile;
import com.titiredennis.curs9.facebook.dto.EditPost;
import com.titiredennis.curs9.facebook.repository.PostRepositoryImpl;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ProfileController profileController = new ProfileControllerImpl();

        CreateProfile gigi = new CreateProfile("logo1", 23, "Gigi");
        CreateProfile alexandra = new CreateProfile("Lele", 23, "Trandafir Alexandra");
        CreateProfile maria = new CreateProfile("logo2", 40, "Maria");
        UUID gigiId = profileController.createProfile(gigi);
        UUID alexandraId = profileController.createProfile(alexandra);
        UUID mariaId = profileController.createProfile(maria);

        System.out.println(profileController.getProfile(gigiId));
        System.out.println(profileController.getProfile(alexandraId));
        System.out.println(profileController.getProfile(mariaId));

        System.out.println(PostRepositoryImpl.getInstance());

        PostController postController = new PostControllerImpl();

        CreatePost gigiPost = new CreatePost("Acesta este postul meu!", "Bla bla bla", "20.11.2020", gigiId);
        UUID gigiPostId = postController.createPost(gigiPost);
        CreatePost alexandraPost = new CreatePost("I HATE DENNIS BUT I LOVE HIS PENNIS", " ASA DA", "20.11.2020", alexandraId);
        UUID alexandraPostId = postController.createPost(alexandraPost);
        CreatePost mariaPost = new CreatePost("Hahaha", "nice", "20.11.2020", mariaId);
        UUID mariaPostId = postController.createPost(mariaPost);

        EditPost gigiEditPost = new EditPost("Edited Post GIGI", "Edited Post GIGI!!!!!!", "20.11.2020", gigiId);

        postController.deletePost(mariaPostId);

        System.out.println(postController.getPost(gigiPostId));
        System.out.println(postController.getPost(alexandraPostId));
        System.out.println(postController.getPost(mariaPostId));

    }
}