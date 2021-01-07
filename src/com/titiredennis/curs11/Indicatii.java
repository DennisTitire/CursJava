package com.titiredennis.curs11;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Indicatii {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("1");
        String a = list.get(3);
        a.isEmpty();
        File file = new File("text.txt");

    }
    /*
Exceptii:

    Unchecked - la rulare

    ArrayIndexOutOfBoundsException -->  int[] a->n(lungimea) => a[n+1];
    NullPointerException --> String a;    a.ceva => a == null

    Compilare -> inainte de a rula programul. (javac)

    Rulare -> rularea programului (java class name)
    
    Checked - la compilare

    FileNotFoundException -> daca incercam sa cititm un fisier care nu exista
    2 metode de a trata exceptiile
    1. Sa o handle-uim unde este aruncata
    2. sa o aruncam mai departe
    

*/
}
