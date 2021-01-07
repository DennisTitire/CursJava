package com.titiredennis.curs9.facebook.dto;

import java.util.UUID;

public class CreateProfile {
    private final String avatar;
    private final int varsta;
    private final String nume;

    public CreateProfile(String avatar, int varsta, String nume) {
        this.avatar = avatar;
        this.varsta = varsta;
        this.nume = nume;
    }

    public String getAvatar() {
        return avatar;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

}
