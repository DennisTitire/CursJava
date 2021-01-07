package com.titiredennis.curs9.facebook.model;

import java.util.UUID;

public class Post {
    private UUID id;
    private String titlu;
    private String descriere;
    private String dataCreare;
    private UUID ownerId;

    public Post(String titlu, String descriere, String dataCreare, UUID owner) {
        this.id = UUID.randomUUID();
        this.titlu = titlu;
        this.descriere = descriere;
        this.dataCreare = dataCreare;
        this.ownerId = owner;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getDataCreare() {
        return dataCreare;
    }

    public void setDataCreare(String dataCreare) {
        this.dataCreare = dataCreare;
    }

    public UUID getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", titlu='" + titlu + '\'' +
                ", descriere='" + descriere + '\'' +
                ", dataCreare='" + dataCreare + '\'' +
                ", ownerId=" + ownerId +
                '}';
    }
}
