package com.titiredennis.projects.InterfeteBancomat.controller;

import com.titiredennis.projects.InterfeteBancomat.dto.ContClient;
import com.titiredennis.projects.InterfeteBancomat.exception.NotEnoughMoneyException;
import com.titiredennis.projects.InterfeteBancomat.service.*;

public class ContClientControllerImpl implements ContClientController {

    private CreareContService creareContService;
    private AlimentareContService alimentareContService;
    private RetragereContService retragereContService;
    private TranzactiiService tranzactiiService;
    private SchimbarePinService schimbarePinService;
    private SoldCurentService soldCurentService;

    public ContClientControllerImpl() {
        creareContService = new CreareContServiceImpl();
        alimentareContService = new AlimentareContServiceImpl();
        retragereContService = new RetragereContServiceImpl();
        tranzactiiService = new TranzactiiServiceImpl();
        schimbarePinService = new SchimbarePinServiceImpl();
        soldCurentService = new SoldCurentServiceImpl();
    }

    @Override
    public void creareCont(ContClient contClient) {
        creareContService.creareCont(contClient);
    }

    @Override
    public void alimentareCont(ContClient contClient) {
        alimentareContService.alimentareCont(contClient);
    }

    @Override
    public void retragereCont(ContClient contClient) {
        try {
            retragereContService.retragereCont(contClient);
        } catch (NotEnoughMoneyException notEnoughtMoneyException) {
            System.out.println(notEnoughtMoneyException.getMessage());
        }
    }

    @Override
    public void schimbarePin(ContClient contClient) {
        schimbarePinService.schimbarePin(contClient);
    }

    @Override
    public void soldCurent(ContClient contClient) {
        soldCurentService.soldCurent(contClient);
    }

    @Override
    public void tranzactii(ContClient contClient) {
        tranzactiiService.tranzactii(contClient);
    }
}
