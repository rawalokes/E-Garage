package com.Servicecenter.exception;

import com.Servicecenter.exception.bike.BikeAlreadyBookedException;
import com.Servicecenter.exception.bike.BikeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class BikeExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BikeNotFoundException.class)
    public ResponseEntity<Object> handleBikeNotAvailable(BikeNotFoundException bikeNotFoundException, WebRequest webRequest){
        return new ResponseEntity<Object>(bikeNotFoundException.getMessage(),HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BikeAlreadyBookedException.class)
    public ResponseEntity<Object> handleBikeAlreadyBookedException(BikeAlreadyBookedException bikeAlreadyBookedException,WebRequest webRequest){
        return new ResponseEntity<>(bikeAlreadyBookedException.getMessage(),HttpStatus.CONFLICT);
    }
}
