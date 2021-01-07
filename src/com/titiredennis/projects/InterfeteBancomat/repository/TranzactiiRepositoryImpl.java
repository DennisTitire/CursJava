package com.titiredennis.projects.InterfeteBancomat.repository;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;

public class TranzactiiRepositoryImpl implements TranzactiiRepository {

    private float sumaInainteDeTranzactie;
    private float sumaDupaTranzactie;
    private float numerarIntrodus;
    private boolean tranzactieSucces;
    private String tipTranzactie = "";

    public TranzactiiRepositoryImpl(String tipTranzactie, float sumaInainteDeTranzactie, float sumaDupaTranzactie, float numerarIntrodus, boolean tranzactieSucces) {
        this.tipTranzactie = tipTranzactie;
        this.sumaInainteDeTranzactie = sumaInainteDeTranzactie;
        this.sumaDupaTranzactie = sumaDupaTranzactie;
        this.numerarIntrodus = numerarIntrodus;
        this.tranzactieSucces = tranzactieSucces;
    }

    public TranzactiiRepositoryImpl() {
    }

    @Override
    public void tranzactii(ContClient contClient) {
        contClient.istoric.add("Tranzactii");
        System.out.println(contClient.tranzactiiRepositoryMap);
    }

    @Override
    public String toString() {
        return "Tranzactii{" +
                "tipTranzactie='" + tipTranzactie +
                ", sumaInainteDeTranzactie=" + sumaInainteDeTranzactie +
                ", sumaDupaTranzactie=" + sumaDupaTranzactie +
                ", numerarIntrodus=" + numerarIntrodus +
                ", tranzactieSucces=" + tranzactieSucces + '\'' +
                '}';
    }
}
