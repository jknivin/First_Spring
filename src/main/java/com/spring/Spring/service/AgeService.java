package com.spring.Spring.service;

import com.spring.Spring.DTO.ApiResponse;
import com.spring.Spring.exception.AgeLimitException;
import org.springframework.stereotype.Service;

@Service
public class AgeService {

    public ApiResponse<String> checkAge(int age) throws AgeLimitException {
        if(age < 18 ){
            System.out.println("i am been called becaue the age is "+ age);
            throw new AgeLimitException("Min age required is 18");
        }
        System.out.println("im eligible");
        return new ApiResponse<>(200,"You are eligible",null);
    }

}
