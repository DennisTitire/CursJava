package com.titiredennis.projects.InterfeteBancomat.service;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import com.titiredennis.projects.InterfeteBancomat.repository.TranzactiiRepository;
import com.titiredennis.projects.InterfeteBancomat.repository.TranzactiiRepositoryImpl;

public class TranzactiiServiceImpl implements TranzactiiService {

    private TranzactiiRepository tranzactiiRepository;

    public TranzactiiServiceImpl() {
        tranzactiiRepository = new TranzactiiRepositoryImpl();
    }

    @Override
    public void tranzactii(ContClient contClient) {
        tranzactiiRepository.tranzactii(contClient);
    }
}
