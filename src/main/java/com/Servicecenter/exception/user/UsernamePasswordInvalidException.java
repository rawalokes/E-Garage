package com.Servicecenter.exception.user;

public class UsernamePasswordInvalidException extends RuntimeException{
    public UsernamePasswordInvalidException(String message) {
        super(message);
    }
}
