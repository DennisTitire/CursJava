package com.titiredennis.projects.targauto;public class Main {    public static void main(String[] args) {        // Masina second hend        Masina bmw = new Masina("BMW", "Seria 3", 2010, 123400, "Albastru", "Andrei", 9.999f);        Masina audi = new Masina("Audi", "A4", 2013, 20000, "Alb", "Marian", 23.999f);        Masina mercedes = new Masina("Mercedes-Benz", "Clasa C", 2014, 10000, "Negru", "Sergiu", 14.299f);        // Masina noua        Masina volvo = new Masina("Volvo", "XC60", 2019, "Negru", 39.999f);        Masina sandero = new Masina("Dacia", "Sandero", 2019, "Albastru", 10.999f);        System.out.println(bmw.toString());        System.out.println(audi.toString());        System.out.println(mercedes.toString());        System.out.println(volvo.toString());        System.out.println(sandero.toString());        System.out.println();        System.out.println();        //Vanzare masini (bmw, sandero)        bmw.setVanduta(true);        bmw.setPretCumparare(7.999f);        System.out.println(bmw.getProfit());        sandero.setVanduta(true);        sandero.setPretCumparare(8.999f);        System.out.println(sandero.getProfit());        float profitTotal = bmw.getProfit() + sandero.getProfit();        System.out.println("Profitul total: " + profitTotal );    }}