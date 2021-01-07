package com.titiredennis.projects.InterfeteBancomat.repository;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import java.util.Scanner;

public class SoldCurentRepositoryImpl implements SoldCurentRepository {

    @Override
    public void soldCurent(ContClient contClient) {
        System.out.println("Introduceti pin-ul:");
        Scanner scanner = new Scanner(System.in);
        String pinIntrodus = scanner.next();
        String pin = contClient.getPin();
        if (pinIntrodus.equals(pin)) {
            System.out.println("Soldul dumneavoastra este: " + contClient.getSumaDupaTranzactie() + " RON");
            contClient.istoric.add("Sold curent");
        } else {
            System.out.println("Pinul dumneavoastra este gresit!");
        }
    }
}