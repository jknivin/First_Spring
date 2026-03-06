package com.spring.Spring.DTO;

import lombok.Data;
import lombok.Getter;

import java.security.PrivateKey;
import java.time.LocalDateTime;

@Getter
public class ErrorResponse {

    private final LocalDateTime time;
    private final  int code;
    private final String message;

    public ErrorResponse(int code , String message){
        this.time = LocalDateTime.now();
        this.code = code;
        this.message = message;
    }

}
