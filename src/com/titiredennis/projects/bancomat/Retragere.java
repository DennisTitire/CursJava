package com.titiredennis.projects.bancomat;

public class Retragere extends Tranzactie {

    Retragere(String tipTranzactie, float sumaInainteTranzactie, float sumaDupaTranzactie, float sumaDiferenta, boolean tranzactieSucces) {
        super(tipTranzactie, sumaInainteTranzactie, sumaDupaTranzactie, sumaDiferenta, tranzactieSucces);
    }
}
