package com.titiredennis.curs9.facebook.dto;

public class EditProfile {

    private final String avatar;
    private final String nume;

    public EditProfile(String avatar, String nume) {
        this.avatar = avatar;
        this.nume = nume;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getNume() {
        return nume;
    }
}
