package com.titiredennis.curs7.demografic;// IMUTALILITATE -> creezi un obiect si nu ii mai schimbi continutul. -> nu ai setteri, campuri private , FINAL pe clasa.public abstract class Delimitare {    private final String nume;    private final Integer populatie;    Delimitare(String  nume, Integer populatie) {        this.nume = nume;        this.populatie = populatie;    }    public String getNume() {        return nume;    }    public Integer getPopulatie() {        return populatie;    }    abstract void limba();    public String toString() {        return "nume: " + nume + "; " + "populatie" + populatie;    }}