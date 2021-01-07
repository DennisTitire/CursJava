package com.titiredennis.projects.InterfeteBancomat;

import com.titiredennis.projects.InterfeteBancomat.exception.WrongPinException;

public class Main {
    public static void main(String[] args){
        Bancomat bancomat = new Bancomat();
        bancomat.startBancomat();
    }
}
