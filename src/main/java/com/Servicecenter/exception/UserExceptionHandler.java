package com.Servicecenter.exception;

import com.Servicecenter.exception.user.UsernameAlreadyTakenException;
import com.Servicecenter.exception.user.UsernamePasswordInvalidException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UsernameAlreadyTakenException.class)
    public ResponseEntity handleDuplicateUsername(UsernameAlreadyTakenException exception, WebRequest webRequest){
        return new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UsernamePasswordInvalidException.class)
    public  ResponseEntity handleInvalidUsernamePassword(UsernamePasswordInvalidException exception,WebRequest webRequest){
        return new ResponseEntity(exception.getMessage(),HttpStatus.BAD_REQUEST);
    }
}
