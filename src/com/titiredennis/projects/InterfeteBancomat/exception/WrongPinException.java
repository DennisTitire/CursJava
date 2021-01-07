package com.titiredennis.projects.InterfeteBancomat.exception;

public class WrongPinException extends Exception {

    public WrongPinException() {
        super("Pinul este gresit!");
    }
}
