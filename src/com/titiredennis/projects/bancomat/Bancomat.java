package com.titiredennis.projects.bancomat;import java.util.*;public class Bancomat {    private String pinIntrodus;    private String pin = "0000";    private float numerarIntrodus;    private String comandaIntrodusa = "";    private final boolean contCreat = false;    private final String creare = "creare";    private final String alimentare = "alimentare";    private final String retragere = "retragere";    private final String schimbare = "schimbare";    private final String sold = "sold";    private final String tranzactii = "tranzactii";    private final String istoric = "istoric";    private final String quit = "quit";    private String tipTranzactie = "";    private boolean tranzactieSucces = true;    private float sumaInainteDeTranzactie = 100;    private float sumaDupaTranzactie;    private final List<String> istoricList = new ArrayList<>();    private final HashMap<UUID, Tranzactie> tranzactieHashMap = new HashMap<>();    Tranzactie alimentareTranzactie = new Alimentare(tipTranzactie, sumaInainteDeTranzactie, sumaDupaTranzactie, numerarIntrodus, tranzactieSucces);    Tranzactie retragereTranzactie = new Retragere(tipTranzactie, sumaInainteDeTranzactie, sumaDupaTranzactie, numerarIntrodus, tranzactieSucces);    Scanner scanner = new Scanner(System.in);    public void startBancomat() {        System.out.println("Bine ati venit la ING! \nIntroduceti 'creare' pentru a va crea un cont! ");        comandaIntrodusa = scanner.next();        if (comandaIntrodusa.equals(creare)) {            creareCont();            System.out.println("Introduceti pinul!");            pinIntrodus = scanner.next();            if (isCorrect(pinIntrodus, pin)) {                while (!comandaIntrodusa.toLowerCase().equals(quit)) {                    meniu();                    comandaProgram();                }            } else {                System.out.println("Pin introdus gresit!");                System.out.println("Quit!");            }        } else {            System.out.println("Comanda introdusa gresita! Reincercati!");        }    }    private boolean isCorrect(String pinIntrodus, String pin) {        return pinIntrodus.equals(pin);    }    private void meniu() {        System.out.println("\n1. Alimentare");        System.out.println("2. Retragere");        System.out.println("3. Sold Curent");        System.out.println("4. Schimbare pin");        System.out.println("5. Istoric");        System.out.println("6. Tranzactii");        System.out.println("7. Quit");    }    private void comandaProgram() {        System.out.println("Introduceri comanda dorita!");        Scanner scanner = new Scanner(System.in);        comandaIntrodusa = scanner.next();        if (comandaIntrodusa.toLowerCase().equals(alimentare)) {            alimentareCont();            istoricList.add(alimentare);        } else if (comandaIntrodusa.toLowerCase().equals(retragere)) {            retragereNumerar();            istoricList.add(retragere);        } else if (comandaIntrodusa.toLowerCase().equals(sold)) {            soldCurent();            istoricList.add(sold);        } else if (comandaIntrodusa.toLowerCase().equals(schimbare)) {            schimbarePin();            istoricList.add(schimbare);        } else if (comandaIntrodusa.toLowerCase().equals(tranzactii)) {            tranzactii();            istoricList.add(tranzactii);        } else if (comandaIntrodusa.toLowerCase().equals(istoric)) {            istoricMenu();        } else {            System.out.println("Comanda introdusa nu este recunoscuta! Reincearca!");            comandaIntrodusa.equals(quit);        }    }    private void alimentareCont() {        System.out.println("Introduceti suma de bani pe care doriti sa o depuntei \nDoar multipli de 5,10,50...");        Scanner scanner = new Scanner(System.in);        numerarIntrodus = scanner.nextInt();        tipTranzactie = alimentare;        if (numerarIntrodus < sumaInainteDeTranzactie) {            sumaDupaTranzactie = sumaInainteDeTranzactie + numerarIntrodus;            alimentareTranzactie.setTipTranzactie(tipTranzactie);            alimentareTranzactie.setSumaInainteTranzactie(sumaInainteDeTranzactie);            alimentareTranzactie.setSumaDupaTranzactie(sumaDupaTranzactie);            alimentareTranzactie.setSumaDiferenta(numerarIntrodus);            alimentareTranzactie.setTranzactieSucces(tranzactieSucces);            tranzactieHashMap.put(UUID.randomUUID(), alimentareTranzactie);            System.out.println("Soldul curent dupa alimentare este: " + sumaDupaTranzactie);            sumaInainteDeTranzactie = sumaDupaTranzactie;        } else {            tranzactieSucces = false;            sumaInainteDeTranzactie = sumaDupaTranzactie;            alimentareTranzactie.setTipTranzactie(alimentare);            alimentareTranzactie.setTipTranzactie(tipTranzactie);            alimentareTranzactie.setSumaInainteTranzactie(sumaInainteDeTranzactie);            alimentareTranzactie.setSumaDupaTranzactie(sumaDupaTranzactie);            alimentareTranzactie.setSumaDiferenta(numerarIntrodus);            alimentareTranzactie.setTranzactieSucces(tranzactieSucces);            tranzactieHashMap.put(UUID.randomUUID(), alimentareTranzactie);            System.out.println("Quit!\nDeoarece suma introdusa este mai mare decat cea din cont!");        }    }    private void retragereNumerar() {        System.out.println("Introduceti suma de bani pe care doriti sa ii retrageti din cont \nDoar multipli de 5,10,50...");        Scanner scanner = new Scanner(System.in);        numerarIntrodus = scanner.nextInt();        tipTranzactie = retragere;        if (numerarIntrodus < sumaInainteDeTranzactie) {            sumaDupaTranzactie = sumaInainteDeTranzactie - numerarIntrodus;            retragereTranzactie.setTipTranzactie(tipTranzactie);            retragereTranzactie.setSumaInainteTranzactie(sumaInainteDeTranzactie);            retragereTranzactie.setSumaDupaTranzactie(sumaDupaTranzactie);            retragereTranzactie.setSumaDiferenta(numerarIntrodus);            retragereTranzactie.setTranzactieSucces(tranzactieSucces);            tranzactieHashMap.put(UUID.randomUUID(), retragereTranzactie);            System.out.println("Soldul curent dupa retragere este: " + sumaDupaTranzactie);            sumaInainteDeTranzactie = sumaDupaTranzactie;        } else {            tranzactieSucces = false;            sumaInainteDeTranzactie = sumaDupaTranzactie;            retragereTranzactie.setTipTranzactie(tipTranzactie);            retragereTranzactie.setSumaInainteTranzactie(sumaInainteDeTranzactie);            retragereTranzactie.setSumaDupaTranzactie(sumaDupaTranzactie);            retragereTranzactie.setSumaDiferenta(numerarIntrodus);            retragereTranzactie.setTranzactieSucces(tranzactieSucces);            tranzactieHashMap.put(UUID.randomUUID(), retragereTranzactie);            System.out.println("Quit!\nDeoarece suma introdusa este mai mare decat cea din cont!");        }    }    private void schimbarePin() {        System.out.println("Introduceti pinul curent:");        Scanner scanner = new Scanner(System.in);        pinIntrodus = scanner.next();        if (pinIntrodus.equals(pin)) {            System.out.println("Introduceti noul pin: ");            String pinNou1 = scanner.next();            System.out.println("Reintroduceti noul pin: ");            String pinNou2 = scanner.next();            if (pinNou1.equals(pinNou2)) {                pin = pinNou2;            } else {                System.out.println("Nu ati introdus corect pinul! Reincercati");            }        } else {            System.out.println("Nu ati introdus corect pinul! Reincercati");        }    }    private void quit() {        System.out.println("Va multumim!");        comandaIntrodusa = "quit";    }    private void soldCurent() {        System.out.println("Introduceti pin-ul:");        Scanner scanner = new Scanner(System.in);        pinIntrodus = scanner.next();        if (pinIntrodus.equals(pin)) {            System.out.println("soldul dumneavoastra este: " + sumaDupaTranzactie);        } else {            System.out.println("Pinul dumneavoastra este gresit!");        }    }    private void creareCont() {        if (!contCreat) {            System.out.println("Contul a fost creat cu succes!");            System.out.println("Aveti in cont suma de = " + sumaInainteDeTranzactie);            System.out.println("Pinul dumneavoastra este = " + pin);        } else {            System.out.println("Nu aveti cont creat!");            quit();        }    }    private void istoricMenu() {        if (comandaIntrodusa.equals(istoric)) {            System.out.println(istoricList);        }    }    private void tranzactii() {        System.out.println(tranzactieHashMap);    }}