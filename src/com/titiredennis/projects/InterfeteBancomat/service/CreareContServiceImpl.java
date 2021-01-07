package com.titiredennis.projects.InterfeteBancomat.service;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import com.titiredennis.projects.InterfeteBancomat.repository.CreareContRepository;
import com.titiredennis.projects.InterfeteBancomat.repository.CreareContRepositoryImpl;

public class CreareContServiceImpl implements CreareContService {

    private CreareContRepository creareContRepository;

    public CreareContServiceImpl() {
        creareContRepository = new CreareContRepositoryImpl();
    }

    @Override
    public void creareCont(ContClient contClient) {
        creareContRepository.creareCont(contClient);
    }
}
