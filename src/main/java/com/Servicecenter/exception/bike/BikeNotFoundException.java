package com.Servicecenter.exception.bike;

public class BikeNotFoundException extends RuntimeException {
    public BikeNotFoundException(String message) {
        super(message);
    }
}
