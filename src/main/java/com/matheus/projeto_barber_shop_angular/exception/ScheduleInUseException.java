package com.matheus.projeto_barber_shop_angular.exception;

public class ScheduleInUseException extends RuntimeException {

    public ScheduleInUseException(String message) {
        super(message);
    }

}