package com.titiredennis.projects.InterfeteBancomat.service;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import com.titiredennis.projects.InterfeteBancomat.exception.NotEnoughMoneyException;

public interface RetragereContService {
    
    void retragereCont(ContClient contClient) throws NotEnoughMoneyException;
    
}
