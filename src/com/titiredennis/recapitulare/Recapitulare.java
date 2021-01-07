package com.titiredennis.recapitulare;

/*

   Incapsulare - get set private final
   Mostenire - extends
   Abstractizarea - mutarea cod pentru a fi mai usor de citit
   Polimorfismul - O clasa poate sa aibe ca tip parintele
   final se poate folosi la clase ( una final nu poate fi extinsa  !! )
   Overloading(overlode) - aceeasi metoda cu diferiti parametri
   Overwrithing

    Public - poate fi vazut peste tot
    Private doar in calasa in care ezista
    Protected - doar in celasi pachet
    Default - vazute in acelasi pachet
    Static - se refera la clasa (o pot intalni doar la clasa)

    Nu isi pastreaza ordinea!!!
        List -
        Set - nu contine duplicate
        Map - este o inlantuire de chei, valori (chei unice) si putem avea ca cheie "null"
        Collection - ArrayList si Set


    Interfetele:
    Contin doar metode neimplementate (fara body)
    Nu contin campuri (variabile globare), dar contine constante
    Pot fi implementate mai multe interfete intr-o clasa
    Campurile pot fi accesate doar in copil
    Dupa java 8, interfetele pot avea metode implementate, folosint "default"

    SOLID:


*/

public class Recapitulare {
    public static void main(String[] args) {
        // Se apeleaza un constructor "Object"
        Object obiect = new Object();
        Animal animal = new Animal(23);
        Pisica pisica = new Pisica();




    }
}
