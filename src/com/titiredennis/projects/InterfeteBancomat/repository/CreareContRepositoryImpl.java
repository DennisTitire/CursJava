package com.titiredennis.projects.InterfeteBancomat.repository;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;

public class CreareContRepositoryImpl implements CreareContRepository {

    @Override
    public void creareCont(ContClient contClient) {
        contClient.setPin("0000");
        contClient.setSumaInainteDeTranzactie(0);
        System.out.println("Contul a fost creat cu succes!");
        System.out.println("Aveti in cont suma de = " + contClient.getSumaInainteDeTranzactie() + " RON");
        System.out.println("Pinul dumneavoastra este = " + contClient.getPin());
        contClient.istoric.add("Creare cont");
    }
}
