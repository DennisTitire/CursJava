package com.titiredennis.curs9.facebook.controller;

import com.titiredennis.curs9.facebook.dto.CreateProfile;
import com.titiredennis.curs9.facebook.dto.EditProfile;
import com.titiredennis.curs9.facebook.model.Profile;
import com.titiredennis.curs9.facebook.service.ProfileService;
import com.titiredennis.curs9.facebook.service.ProfileServiceImpl;
import java.util.UUID;

public class ProfileControllerImpl implements ProfileController {

    private final ProfileService profileService;

    public ProfileControllerImpl() {
        profileService = new ProfileServiceImpl();
    }

    public UUID createProfile(CreateProfile profile) {
        return profileService.createProfile(profile);
    }

    public void editProfile(UUID id, EditProfile editProfile) {
        profileService.editProfile(id, editProfile);
    }

    public void deleteProfile(UUID id) {
        profileService.deleteProfile(id);
    }

    public Profile getProfile(UUID id) {
        return profileService.getProfile(id);
    }
}
