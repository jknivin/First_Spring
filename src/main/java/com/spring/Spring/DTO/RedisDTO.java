package com.spring.Spring.DTO;

import lombok.Data;
import lombok.Getter;

@Data
public class RedisDTO {

    private String key;
    private String value;
    private int min;

}
