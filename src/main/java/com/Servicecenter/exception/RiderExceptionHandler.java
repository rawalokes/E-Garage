package com.Servicecenter.exception;

import com.Servicecenter.exception.rider.RiderNotVerifiedException;
import com.Servicecenter.model.Rider;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RiderExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RiderNotVerifiedException.class)
    public ResponseEntity<Object> handleRiderNotVerifiedException(RiderNotVerifiedException riderNotVerifiedException, WebRequest webRequest){
        return new ResponseEntity(riderNotVerifiedException.getMessage(), HttpStatus.FORBIDDEN);
    }

}
