package com.titiredennis.recapitulare;

public class Animal {

    // O clasa abstracta poate contine o metoda abstracta care sa le-o dea copiilor si nu poate fi instantiata
    // O clasa este o schita a unui obiect
    // Incapsularea facem toate campurile private si facem setter si getter (pentru a ascunde schestii)

    private int varsta;
    private String specie;
    private String carnivor;

    // Constructor default fara parametri vine automat

    Animal(int varsta) {
        this.varsta = varsta;
    }

    Animal() {
        this(20);
    }
}
