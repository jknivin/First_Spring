package com.spring.Spring.controller;

import com.spring.Spring.DTO.ApiResponse;
import com.spring.Spring.service.AgeService;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/age")
public class AgeController {

    private final AgeService service;

    public AgeController(AgeService service){
        this.service = service;
    }

    @GetMapping("/{age}")
    public ResponseEntity<ApiResponse<String>> checkAge(@PathVariable @Min(0) @Max(80) int age){
        return ResponseEntity.ok(service.checkAge(age));
    }

}
