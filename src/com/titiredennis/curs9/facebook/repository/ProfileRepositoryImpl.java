package com.titiredennis.curs9.facebook.repository;

import com.titiredennis.curs9.facebook.model.Profile;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProfileRepositoryImpl implements ProfileRepository {

    Map<UUID,Profile> profiles = new HashMap<>();

    public UUID createProfile(Profile profile) {
        profiles.put(profile.getId(), profile);
        return profile.getId();
    }

    public void editProfile(Profile profile) {
        profiles.put(profile.getId(), profile);
    }

    public void deleteProfile(UUID id) {
        profiles.remove(id);
    }

    public Profile getProfile(UUID id) {
        return profiles.get(id);
    }
}
