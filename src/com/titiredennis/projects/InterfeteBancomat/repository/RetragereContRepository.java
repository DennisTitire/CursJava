package com.titiredennis.projects.InterfeteBancomat.repository;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import com.titiredennis.projects.InterfeteBancomat.exception.NotEnoughMoneyException;

public interface RetragereContRepository {

    void retragereCont(ContClient contClient) throws NotEnoughMoneyException;
}
