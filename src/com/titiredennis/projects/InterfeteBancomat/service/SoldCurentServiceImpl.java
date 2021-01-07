package com.titiredennis.projects.InterfeteBancomat.service;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import com.titiredennis.projects.InterfeteBancomat.repository.SoldCurentRepository;
import com.titiredennis.projects.InterfeteBancomat.repository.SoldCurentRepositoryImpl;

public class SoldCurentServiceImpl implements SoldCurentService {

    private SoldCurentRepository soldCurentRepository;

    public SoldCurentServiceImpl() {
        soldCurentRepository = new SoldCurentRepositoryImpl();
    }

    @Override
    public void soldCurent(ContClient contClient) {
        soldCurentRepository.soldCurent(contClient);
    }
}
