package com.titiredennis.projects.InterfeteBancomat.service;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import com.titiredennis.projects.InterfeteBancomat.exception.NotEnoughMoneyException;
import com.titiredennis.projects.InterfeteBancomat.repository.RetragereContRepository;
import com.titiredennis.projects.InterfeteBancomat.repository.RetragereContRepositoryImpl;

public class RetragereContServiceImpl implements RetragereContService {

    public RetragereContRepository retragereContRepository;

    public RetragereContServiceImpl() {
        retragereContRepository = new RetragereContRepositoryImpl();
    }

    @Override
    public void retragereCont(ContClient contClient) throws NotEnoughMoneyException {
        retragereContRepository.retragereCont(contClient);
    }
}
