package com.titiredennis.projects.InterfeteBancomat.service;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import com.titiredennis.projects.InterfeteBancomat.repository.AlimentareContRepository;
import com.titiredennis.projects.InterfeteBancomat.repository.AlimentareContRepositoryImpl;

public class AlimentareContServiceImpl implements AlimentareContService {

    private AlimentareContRepository alimentareContRepository;

    public AlimentareContServiceImpl() {
        alimentareContRepository = new AlimentareContRepositoryImpl();
    }

    @Override
    public void alimentareCont(ContClient contClient) {
        alimentareContRepository.alimentareCont(contClient);
    }
}
