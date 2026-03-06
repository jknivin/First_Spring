package com.spring.Spring.controller;

import com.spring.Spring.DTO.RedisDTO;
import com.spring.Spring.service.RedisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisController {

    public RedisService redis;

    public RedisController(RedisService redis){
        this.redis = redis;
    }

    @PostMapping("/")
    public ResponseEntity<String> addInRedis(@RequestBody RedisDTO data){
        redis.save(data);
        return ResponseEntity.ok("The Data written successfully..");
    }

    @GetMapping("/{key}")
    public ResponseEntity<String> getData(@PathVariable String key){
        return ResponseEntity.ok(redis.get(key));
    }

}
