package com.titiredennis.curs9.facebook.repository;

import com.titiredennis.curs9.facebook.model.Profile;

import java.util.UUID;

public interface ProfileRepository {

    UUID createProfile(Profile profile);

    void editProfile(Profile profile);

    void deleteProfile(UUID id);

    Profile getProfile(UUID id);
}
