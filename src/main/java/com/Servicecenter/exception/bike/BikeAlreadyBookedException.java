package com.Servicecenter.exception.bike;

public class BikeAlreadyBookedException extends RuntimeException{
    public BikeAlreadyBookedException(String message) {
        super(message);
    }
}
