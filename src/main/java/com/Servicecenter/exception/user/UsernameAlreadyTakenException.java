package com.Servicecenter.exception.user;

public class UsernameAlreadyTakenException extends RuntimeException{
    public UsernameAlreadyTakenException(String message) {
        super(message);
    }
}
