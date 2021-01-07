package com.titiredennis.curs14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {


        // OOP
        // Functional Programming --> programare pe functii

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        /*
        f(x) = 3x+7;

        f(numarDinLista) = System.out.println("Am numarul " + numarDinLista);
         */

        // forEach --> primeste input si nu intoarce nimic
        myList.stream().forEach(numarDinLista -> System.out.println("Am numarul " + numarDinLista));

        System.out.println("------------------");
        // map --> primeste input si intoarce output
        // f(x) = x * 2;
        myList.stream().map(numarDinLista -> numarDinLista * 2).forEach(numarInmultit -> System.out.println(numarInmultit));

        System.out.println("------------------");

        myList.stream().map(numarDinLista -> "Numarul " + numarDinLista).forEach(nr -> System.out.println(nr));

        System.out.println("------------------");

        List<Persoana> persoane = new ArrayList<>();
        persoane.add(new Persoana("Gigi", 23));
        persoane.add(new Persoana("Vasile", 70));
        persoane.add(new Persoana("Ion", 34));

        // Afisam numele persoanelor
        persoane.stream().map(persoana -> persoana.getNume()).forEach(nume -> System.out.println(nume));

        System.out.println("------------------");

        // Afisam varsta persoanelor
        persoane.stream().map(persoana -> persoana.getVarsta()).forEach(nume -> System.out.println(nume));

        System.out.println("------------------");


        // filter
        // primeste un input si intoarce un boolean
        persoane.stream()
                .filter(persoana -> persoana.getVarsta() < 65)
                .map(persoanaCareNuELaPensie -> persoanaCareNuELaPensie.getNume())
                .forEach(nume -> System.out.println(nume));

        System.out.println("------------------");

        persoane.stream()
                .filter(persoana -> persoana.getNume().startsWith("I"))
                .map(persoanaCareIncepeCuI -> persoanaCareIncepeCuI.getNume())
                .forEach(nume -> System.out.println(nume));

        System.out.println("------------------");

        // collect
        // Colectam un stream intr-o colectie (list/set)
        List<String> numelePersoanelor = persoane.stream()
                .map(persoana -> persoana.getNume())
                .collect(Collectors.toList());

        System.out.println(numelePersoanelor);

        System.out.println("------------------");

        List<Integer> varstelePersoanelor = persoane.stream()
                .map(persoana -> persoana.getVarsta())
                .collect(Collectors.toList());

        System.out.println(varstelePersoanelor);

        System.out.println("------------------");

        varstelePersoanelor.stream().sorted().forEach(x -> System.out.println(x));


        Optional<String> poateUnString = Optional.of("lalal"); // monada

        if (getCeva().isPresent()) {
            System.out.println(getCeva().get());
        } else {
            System.out.println("Nu Exista");
        }


        Optional<Integer> unInt;
        Optional<Persoana> persoana;


        unInt = Optional.of(1);
        unInt = Optional.empty();

        persoana = Optional.of(new Persoana("Gigi", 3));
        persoana = Optional.empty();

        String asd = "lalala";


        System.out.println("-----------");
        System.out.println("OPTIONAL");
        System.out.println("-----------");

        /*
        persoane.add(new Persoana("Gigi", 23));
        persoane.add(new Persoana("Vasile", 70));
        persoane.add(new Persoana("Ion", 34));
         */
        persoane.stream()
                .filter(persoana1 -> persoana1.getVarsta() < 100)
                .findAny()
                .stream()
                .forEach(persoanaMinora -> System.out.println(persoanaMinora));


        System.out.println("-----------");

        List<Integer> integers = Arrays.asList(1, 4, 6, 2, 4, 2, 4, 6, 4, 7, 5);

        List<Integer> integersDistincte = integers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(integersDistincte);

        System.out.println(integersDistincte.stream().mapToInt(x -> x).sum());

        System.out.println("-----------");

        /*
        Interfetele cu o singura metoda neimplementata ----> interfete functionale
         */
        new Thread(() -> System.out.println("Sunt intr-un Thread")).start();


        Adunare adunare = (a, b) -> a + b;
    }

    public static Optional<String> getCeva() {
        if (false) {
            return Optional.of("asdf");
        } else {
            return Optional.empty();
        }
    }
}
