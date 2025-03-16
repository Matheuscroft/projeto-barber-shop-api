package com.matheus.projeto_barber_shop_angular.exception;

public class EmailInUseException extends RuntimeException {

    public EmailInUseException(String message) {
        super(message);
    }

}