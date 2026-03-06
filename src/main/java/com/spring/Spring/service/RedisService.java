package com.spring.Spring.service;

import com.spring.Spring.DTO.RedisDTO;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    private final StringRedisTemplate redisTemplate;

    public RedisService( StringRedisTemplate redisTemplate ){
        this.redisTemplate = redisTemplate;
    }

    public void save(RedisDTO data){
        redisTemplate.opsForValue().set(data.getKey() , data.getValue(),data.getMin());
    }

    public String get(String key){
        return redisTemplate.opsForValue().get(key);
    }

}
