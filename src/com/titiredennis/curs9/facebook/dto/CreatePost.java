package com.titiredennis.curs9.facebook.dto;

import java.util.UUID;

public class CreatePost {
    private String titlu;
    private String descriere;
    private String dataCreare;
    private UUID ownerId;

    public CreatePost(String titlu, String descriere, String dataCreare, UUID ownerId) {
        this.titlu = titlu;
        this.descriere = descriere;
        this.dataCreare = dataCreare;
        this.ownerId = ownerId;
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
}
