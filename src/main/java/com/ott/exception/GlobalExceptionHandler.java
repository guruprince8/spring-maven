package com.ott.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// https://devwithus.com/exception-handling-spring-boot-rest-api/
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        List<String> details = new ArrayList<String>();
        details.add(resourceNotFoundException.getMessage());
        APIError apiError = new APIError(LocalDateTime.now(), HttpStatus.BAD_REQUEST,"Resource Not Found",details);
        return  new ResponseEntity<Object>(apiError,apiError.getStatus());
    }
}
