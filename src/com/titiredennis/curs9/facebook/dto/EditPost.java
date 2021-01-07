package com.titiredennis.curs9.facebook.dto;

import javax.swing.plaf.synth.SynthToggleButtonUI;
import java.util.UUID;

public class EditPost {
    private String titlu;
    private String descriere;
    private String dataCreare;
    private UUID idUser;

    public EditPost(String titlu, String descriere, String dataCreare, UUID idUser) {
        this.titlu = titlu;
        this. descriere = descriere;
        this.dataCreare = dataCreare;
        this.idUser = idUser;
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

    public UUID getIdUser() {
        return idUser;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }
}
