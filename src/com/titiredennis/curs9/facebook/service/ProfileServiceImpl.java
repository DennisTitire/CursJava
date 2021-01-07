package com.titiredennis.curs9.facebook.service;

import com.titiredennis.curs9.facebook.dto.CreateProfile;
import com.titiredennis.curs9.facebook.dto.EditProfile;
import com.titiredennis.curs9.facebook.model.Profile;
import com.titiredennis.curs9.facebook.repository.ProfileRepository;
import com.titiredennis.curs9.facebook.repository.ProfileRepositoryImpl;

import java.util.UUID;

public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileServiceImpl() {
        profileRepository = new ProfileRepositoryImpl();
    }

    public UUID createProfile(CreateProfile createProfile) {
        Profile profile = new Profile(createProfile.getAvatar(), createProfile.getVarsta(), createProfile.getNume());
        return profileRepository.createProfile(profile);
    }

    public void editProfile(UUID id, EditProfile editProfile) {

        Profile profile = profileRepository.getProfile(id);
        profile.setAvatar(editProfile.getAvatar());
        profile.setNume(editProfile.getNume());

        profileRepository.editProfile(profile);
    }

    public void deleteProfile(UUID id) {
        profileRepository.deleteProfile(id);
    }

    public Profile getProfile(UUID id) {
        return profileRepository.getProfile(id);
    }
}
