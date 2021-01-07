package com.titiredennis.projects.InterfeteBancomat.service;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import com.titiredennis.projects.InterfeteBancomat.repository.SchimbarePinRepository;
import com.titiredennis.projects.InterfeteBancomat.repository.SchimbarePinRepositoryImpl;

public class SchimbarePinServiceImpl implements SchimbarePinService {

    private SchimbarePinRepository schimbarePinRepository;

    public SchimbarePinServiceImpl() {
        schimbarePinRepository = new SchimbarePinRepositoryImpl();
    }

    @Override
    public void schimbarePin(ContClient contClient) {
        schimbarePinRepository.schimbarePin(contClient);
    }
}
