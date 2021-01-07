package com.titiredennis.curs9.facebook.service;

import com.titiredennis.curs9.facebook.dto.CreateProfile;
import com.titiredennis.curs9.facebook.dto.EditProfile;
import com.titiredennis.curs9.facebook.model.Profile;

import java.util.UUID;

public interface ProfileService {

    UUID createProfile(CreateProfile profile);

    void editProfile(UUID id, EditProfile profile);

    void deleteProfile(UUID id);

    Profile getProfile(UUID id);
}
