package com.titiredennis.projects.InterfeteBancomat;

import com.titiredennis.projects.InterfeteBancomat.controller.ContClientController;
import com.titiredennis.projects.InterfeteBancomat.controller.ContClientControllerImpl;
import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import com.titiredennis.projects.InterfeteBancomat.util.CheckPinUtil;
import com.titiredennis.projects.InterfeteBancomat.util.ComandaProgramUtil;
import com.titiredennis.projects.InterfeteBancomat.util.MeniuUtil;

import java.util.Scanner;

public class Bancomat {
    String comandaIntrodusa = "";
    ContClient contClient = new ContClient();
    ContClientController contClientController = new ContClientControllerImpl();
    CheckPinUtil checkPinUtil = new CheckPinUtil();
    ComandaProgramUtil comandaProgramUtil = new ComandaProgramUtil();
    MeniuUtil meniuUtil = new MeniuUtil();

    public void startBancomat() {
        System.out.println("Bine ati venit la ING! \nIntroduceti 'creare' pentru a va crea un cont!");
        Scanner scanner = new Scanner(System.in);
        comandaIntrodusa = scanner.next();
        if (comandaIntrodusa.equals("creare")) {
            contClientController.creareCont(contClient);
            System.out.println("Introduceti codul pin. Aveti in total 3 incercari!");
            String pin = contClient.getPin();
            String pinIntrodus = scanner.next();
            if (checkPinUtil.verificarePin(pin, pinIntrodus)) {
                while (!comandaIntrodusa.toLowerCase().equals("quit")) {
                    meniuUtil.meniu();
                    comandaProgramUtil.comandaProgram();
                }
            }
        } else {
            System.out.println("Comanda introdusa este gresita!");
        }
    }
}
