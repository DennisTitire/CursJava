package com.titiredennis.projects.InterfeteBancomat.repository;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import com.titiredennis.projects.InterfeteBancomat.exception.NotEnoughMoneyException;

import java.util.Scanner;
import java.util.UUID;

public class RetragereContRepositoryImpl implements RetragereContRepository {

    @Override
    public void retragereCont(ContClient contClient) throws NotEnoughMoneyException {
        System.out.println("Introduceti suma de bani pe care doriti sa ii retrageti din cont \nDoar multipli de 5,10,50...");
        Scanner scanner = new Scanner(System.in);
        float numerarIntrodus = scanner.nextInt();
        if (numerarIntrodus < contClient.getSumaInainteDeTranzactie()) {
            contClient.setSumaDupaTranzactie(contClient.getSumaInainteDeTranzactie() - numerarIntrodus);
            TranzactiiRepository tranzactiiRepository = new TranzactiiRepositoryImpl("Retragere", contClient.getSumaInainteDeTranzactie(), contClient.getSumaDupaTranzactie(), numerarIntrodus, true);
            contClient.tranzactiiRepositoryMap.put(UUID.randomUUID(), tranzactiiRepository);
            contClient.istoric.add("Retragere");
            contClient.setSumaInainteDeTranzactie(contClient.getSumaDupaTranzactie());
            System.out.println("Soldul curent dupa retragere este: " + contClient.getSumaDupaTranzactie() + " RON");
        } else {
                System.out.println("Tranzactia nu a putut fi realizata deoarece soldul dumneavoastra este mic!");
                TranzactiiRepository tranzactiiRepository = new TranzactiiRepositoryImpl("Retragere", contClient.getSumaInainteDeTranzactie(), contClient.getSumaDupaTranzactie(), numerarIntrodus, false);
                contClient.tranzactiiRepositoryMap.put(UUID.randomUUID(), tranzactiiRepository);
                contClient.istoric.add("Retragere");
                System.out.println("Soldul curent dupa retragere este: " + contClient.getSumaDupaTranzactie() + " RON");
                throw new NotEnoughMoneyException();
        }
    }
}
