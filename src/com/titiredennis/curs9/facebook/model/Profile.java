package com.titiredennis.curs9.facebook.model;

import java.util.UUID;

public class Profile {
    private final UUID id;
    private String avatar;
    private int varsta;
    private String nume;

    private Profile(UUID id, String avatar, int varsta, String nume) {
        this.id = id;
        this.avatar = avatar;
        this.varsta = varsta;
        this.nume = nume;
    }

    public Profile(String avatar, int varsta, String nume) {
        this(UUID.randomUUID(), avatar, varsta, nume);
    }

    public UUID getId() {
        return id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", avatar='" + avatar + '\'' +
                ", varsta=" + varsta +
                ", nume='" + nume + '\'' +
                '}';
    }
}
