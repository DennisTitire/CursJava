package com.titiredennis.projects.InterfeteBancomat.repository;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import java.util.Scanner;

public class SchimbarePinRepositoryImpl implements SchimbarePinRepository {

    @Override
    public void schimbarePin(ContClient contClient) {
        String pin = contClient.getPin();
        System.out.println("Introduceti pinul curent:");
        Scanner scanner = new Scanner(System.in);
        String pinIntrodus = scanner.next();
        if (pinIntrodus.equals(pin)) {
            System.out.println("Introduceti noul pin: ");
            String pinNou1 = scanner.next();
            System.out.println("Reintroduceti noul pin: ");
            String pinNou2 = scanner.next();
            if (pinNou1.equals(pinNou2)) {
                contClient.setPin(pinNou2);
                contClient.istoric.add("Schimbare pin");
            } else {
                System.out.println("Nu ati introdus corect pinul! Reincercati");
            }
        } else {
            System.out.println("Nu ati introdus corect pinul! Reincercati");
        }
    }
}
