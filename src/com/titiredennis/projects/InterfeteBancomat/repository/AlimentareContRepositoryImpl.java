package com.titiredennis.projects.InterfeteBancomat.repository;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import java.util.Scanner;
import java.util.UUID;

public class AlimentareContRepositoryImpl implements AlimentareContRepository {

    float soldClient;
    public TranzactiiRepository tranzactiiRepository;

    @Override
    public void alimentareCont(ContClient contClient) {
        float sumaInainteDeTranzactie = contClient.getSumaInainteDeTranzactie();
        System.out.println("Introduceti suma de bani pe care doriti sa o depuntei \nDoar multipli de 5,10,50...");
        Scanner scanner = new Scanner(System.in);
        float numerarIntrodus = scanner.nextInt();

        contClient.setSumaDupaTranzactie(sumaInainteDeTranzactie + numerarIntrodus);
        tranzactiiRepository = new TranzactiiRepositoryImpl("Alimentare", contClient.getSumaInainteDeTranzactie(), contClient.getSumaDupaTranzactie(), numerarIntrodus, true);
        contClient.tranzactiiRepositoryMap.put(UUID.randomUUID(), tranzactiiRepository);
        contClient.setSumaInainteDeTranzactie(contClient.getSumaDupaTranzactie());
        contClient.istoric.add("Alimentare");
        System.out.println("Soldul curent dupa alimentare este: " + contClient.getSumaDupaTranzactie() + " RON");
    }
}
