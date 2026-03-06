package com.spring.Spring.controller;

import com.spring.Spring.DTO.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("/")
    public ResponseEntity<ApiResponse<String>> getOrders(){
        return ResponseEntity.ok(new ApiResponse<>(200,"order fetched successfult" , "the orders"));
    }

    @GetMapping("/id")
    public ResponseEntity<ApiResponse<String>> getOrders(int id){
        return ResponseEntity.ok(new ApiResponse<>(200,"order fetched successfult" , "the order by id"+id));
    }    
} 
