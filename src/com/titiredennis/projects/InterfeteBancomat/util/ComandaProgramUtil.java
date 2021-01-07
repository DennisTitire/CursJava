package com.titiredennis.projects.InterfeteBancomat.util;

import com.titiredennis.projects.InterfeteBancomat.controller.ContClientController;
import com.titiredennis.projects.InterfeteBancomat.controller.ContClientControllerImpl;
import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;

import java.util.Scanner;

public class ComandaProgramUtil {
    String comandaIntrodusa = "";
    ContClient contClient = new ContClient();
    ContClientController contClientController = new ContClientControllerImpl();

    public void comandaProgram() {
        System.out.println("Introduceri comanda dorita!");
        Scanner scanner = new Scanner(System.in);
        comandaIntrodusa = scanner.next();
        if (comandaIntrodusa.toLowerCase().equals("alimentare")) {
            contClientController.alimentareCont(contClient);
        } else if (comandaIntrodusa.toLowerCase().equals("retragere")) {
            contClientController.retragereCont(contClient);
        } else if (comandaIntrodusa.toLowerCase().equals("sold")) {
            contClientController.soldCurent(contClient);
        } else if (comandaIntrodusa.toLowerCase().equals("schimbare")) {
            contClientController.schimbarePin(contClient);
        } else if (comandaIntrodusa.toLowerCase().equals("tranzactii")) {
            contClientController.tranzactii(contClient);
        } else if (comandaIntrodusa.toLowerCase().equals("istoric")) {
            contClient.istoric.add("Istoric");
            System.out.println(contClient.getIstoric());
        } else if (comandaIntrodusa.toLowerCase().equals("quit")) {
            comandaIntrodusa = "quit";
        } else {
            System.out.println("Va rugam introduceti o noua comanda!");
        }
    }
}
