package com.titiredennis.projects.bancomat;

public abstract class Tranzactie {

    private String tipTranzactie;
    private float sumaInainteTranzactie;
    private float sumaDupaTranzactie;
    private float sumaDiferenta;
    private boolean tranzactieSucces;

    Tranzactie(String tipTranzactie, float sumaInainteTranzactie, float sumaDupaTranzactie, float sumaDiferenta, boolean tranzactieSucces) {
        this.tipTranzactie = tipTranzactie;
        this.sumaInainteTranzactie = sumaInainteTranzactie;
        this.sumaDupaTranzactie = sumaDupaTranzactie;
        this.sumaDiferenta = sumaDiferenta;
        this.tranzactieSucces = tranzactieSucces;
    }

    public String getTipTranzactie() {
        return tipTranzactie;
    }

    public void setTipTranzactie(String tipTranzactie) {
        this.tipTranzactie = tipTranzactie;
    }

    public float getSumaDiferenta() {
        return sumaDiferenta;
    }

    public float getSumaInainteTranzactie() {
        return sumaInainteTranzactie;
    }

    public void setSumaInainteTranzactie(float sumaInainteTranzactie) {
        this.sumaInainteTranzactie = sumaInainteTranzactie;
    }

    public float getSumaDupaTranzactie() {
        return sumaDupaTranzactie;
    }

    public void setSumaDupaTranzactie(float sumaDupaTranzactie) {
        this.sumaDupaTranzactie = sumaDupaTranzactie;
    }

    public float getSumaDiferenta(float sumaDupaTranzactie) {
        return sumaDiferenta;
    }

    public void setSumaDiferenta(float sumaDiferenta) {
        this.sumaDiferenta = sumaDiferenta;
    }

    public boolean isTranzactieSucces() {
        return tranzactieSucces;
    }

    public void setTranzactieSucces(boolean tranzactieSucces) {
        this.tranzactieSucces = tranzactieSucces;
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "tipTranzactie='" + tipTranzactie + '\'' +
                ", sumaInainteTranzactie=" + sumaInainteTranzactie +
                ", sumaDupaTranzactie=" + sumaDupaTranzactie +
                ", sumaDiferenta=" + sumaDiferenta +
                ", tranzactieSucces=" + tranzactieSucces +
                '}';
    }
}
