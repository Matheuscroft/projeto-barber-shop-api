package com.matheus.projeto_barber_shop_angular.exception;

public class PhoneInUseException extends RuntimeException {

    public PhoneInUseException(String message) {
        super(message);
    }

}