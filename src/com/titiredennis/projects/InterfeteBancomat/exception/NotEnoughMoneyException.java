package com.titiredennis.projects.InterfeteBancomat.exception;

public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException() {
        super("Nu ai suficienti bani in cont pentru a face extragerea! \nVa multumim! :D ");
    }

}
