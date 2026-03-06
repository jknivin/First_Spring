package com.spring.Spring.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class TodoResponseDTO {

    private UUID id;
    private String task;

}
