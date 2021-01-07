package com.titiredennis.curs9.facebook.controller;

import com.titiredennis.curs9.facebook.dto.CreateProfile;
import com.titiredennis.curs9.facebook.dto.EditProfile;
import com.titiredennis.curs9.facebook.model.Profile;
import com.titiredennis.curs9.facebook.service.ProfileService;

import java.util.UUID;

public interface ProfileController {

    UUID createProfile(CreateProfile createProfile);

    void editProfile(UUID id, EditProfile editProfile);

    void deleteProfile(UUID id);

    Profile getProfile(UUID id);
}
