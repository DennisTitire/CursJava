package com.titiredennis.curs4.targauto;

public class Masina {
    String marca;
    String model;
    int anFabricatie;
    int numarKilometrii;
    String culoare;
    String proprietar;
    boolean esteSecondHand;
    boolean esteVanduta = false;
    float pretCumparare;
    float pretVanzare = 0f;

    Masina(String marca, String model, int anFabricatie, int numarKilometrii, String culoare, String proprietar, boolean esteSecondHand, float pretCumparare) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.numarKilometrii = numarKilometrii;
        this.culoare = culoare;
        this.proprietar = proprietar;
        this.esteSecondHand = esteSecondHand;
        this.pretCumparare = pretCumparare;
    }

    /*
    Constructor folosit pentru masini noi
     */
    Masina(String marca, String model, String culoare, float pretCumparare) {
        this(marca, model, 2020, 0, culoare, "", false, pretCumparare);
    }

    /*
    Constructor folosit pentru masini second hand
     */
    Masina(String marca, String model, int anFabricatie, int numarKilometrii, String culoare, String proprietar, float pretCumparare) {
        this(marca, model, anFabricatie, numarKilometrii, culoare, proprietar, true, pretCumparare);
    }

    float getProfit() {
        return pretVanzare - pretCumparare;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", numarKilometrii=" + numarKilometrii +
                ", culoare='" + culoare + '\'' +
                ", proprietar='" + proprietar + '\'' +
                ", esteSecondHand=" + esteSecondHand +
                ", esteVanduta=" + esteVanduta +
                ", pretCumparare=" + pretCumparare +
                ", pretVanzare=" + pretVanzare +
                '}';
    }
}
