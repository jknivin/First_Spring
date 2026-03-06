package com.spring.Spring.exception;

import com.spring.Spring.DTO.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AgeLimitException.class)
    public ResponseEntity<ErrorResponse> handleAgeLimit(AgeLimitException ex){

        return ResponseEntity.status(400).body(new ErrorResponse(400,ex.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public  ResponseEntity<ErrorResponse> handleGeneric(Exception ex){
        return ResponseEntity.status(500)
                .body(new ErrorResponse(500,ex.getMessage()));
    }

}
