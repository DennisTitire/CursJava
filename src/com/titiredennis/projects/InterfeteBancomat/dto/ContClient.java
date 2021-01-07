package com.titiredennis.projects.InterfeteBancomat.dto;

import com.titiredennis.projects.InterfeteBancomat.repository.TranzactiiRepository;

import java.util.*;

public class ContClient {

    private String pin;
    private float sumaInainteDeTranzactie;
    private float sumaDupaTranzactie;
    public Map<UUID, TranzactiiRepository> tranzactiiRepositoryMap = new HashMap<>();
    public List<String> istoric = new ArrayList<>();

    public ContClient() {
    }

    public List<String> getIstoric() {
        return istoric;
    }

    public String getPin() {
        if (pin == null) {
            setPin("0000");
        }
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public float getSumaInainteDeTranzactie() {
        return sumaInainteDeTranzactie;
    }

    public void setSumaInainteDeTranzactie(float sumaInainteDeTranzactie) {
        this.sumaInainteDeTranzactie = sumaInainteDeTranzactie;
    }

    public float getSumaDupaTranzactie() {
        return sumaDupaTranzactie;
    }

    public void setSumaDupaTranzactie(float sumaDupaTranzactie) {
        this.sumaDupaTranzactie = sumaDupaTranzactie;
    }
}
