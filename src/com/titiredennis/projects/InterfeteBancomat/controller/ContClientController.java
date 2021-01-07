package com.titiredennis.projects.InterfeteBancomat.controller;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;

public interface ContClientController {

    void creareCont(ContClient contClient);

    void alimentareCont(ContClient contClient);

    void retragereCont(ContClient contClient);

    void schimbarePin(ContClient contClient);

    void soldCurent(ContClient contClient);

    void tranzactii(ContClient contClient);
}
