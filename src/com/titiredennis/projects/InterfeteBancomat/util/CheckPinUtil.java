package com.titiredennis.projects.InterfeteBancomat.util;

import java.util.Scanner;

public class CheckPinUtil {

    public boolean verificarePin(String pin, String pinIntrodus) {
        int incercari = 2;
        Scanner scanner = new Scanner(System.in);
        while (incercari >= 0) {
            if (pinIntrodus.equals(pin)) {
                return true;
            } else {
                System.out.printf("Mai aveti %d incercari ", incercari);
                System.out.println();
                pinIntrodus = scanner.next();
                incercari--;
            }
        }
        System.out.println("Ati depasit numarul de incercari!");
        return false;
    }
}
