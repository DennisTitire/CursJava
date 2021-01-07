package com.titiredennis.curs4.targauto;

import java.util.Scanner;

public class TargAuto {
    public static void main(String[] args) {

        // Masini second hand
        Masina bmw = new Masina("BMW", "X1", 2012, 100000, "alb", "Gigi", 20000.0f);
        Masina mercedes = new Masina("Mercedes", "Whatever", 2012, 100000, "alb", "Gigi", 30000.0f);
        Masina logan = new Masina("Dacia", "Logan", 2012, 100000, "alb", "Gigi", 10000.0f);

        // Masini noi
        Masina ford = new Masina("Ford", "Focus", "alb", 20000.0f);
        Masina honda = new Masina("Honda", "Civic", "alb", 20000.0f);

        bmw.marca = "asdasd";
        System.out.println(bmw.marca);
        bmw.pretCumparare = 0.f;
        Masina[] masini = {bmw, mercedes, logan, ford, honda};

        //vanzare

        System.out.println(bmw.esteVanduta);

        Scanner scanner = new Scanner(System.in);
        String marcaDeVanzare = scanner.nextLine();

        for (int i = 0; i < masini.length; i++) {
            if (masini[i].marca.equals(marcaDeVanzare)) {
                masini[i].esteVanduta = true;
            }
        }

        System.out.println(bmw.esteVanduta);

        System.out.println(bmw.toString());
        System.out.println(mercedes.toString());
        System.out.println(logan.toString());
        System.out.println(ford.toString());
        System.out.println(honda.toString());
        System.out.println();
        System.out.println();

        // Vanzare masini
        bmw.esteVanduta = true;
        bmw.pretVanzare = 30000f;
        float profitBwm = bmw.pretVanzare - bmw.pretCumparare;

        ford.esteVanduta = true;
        ford.pretVanzare = 25000f;
        float profitFord = ford.pretVanzare - ford.pretCumparare;

        // Afisare vanzari
        System.out.println("Bmw - profit " + bmw.getProfit());
        System.out.println("Ford - profit " + ford.getProfit());
    }
}
