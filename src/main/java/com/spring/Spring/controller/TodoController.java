package com.spring.Spring.controller;

import com.spring.Spring.DTO.ApiResponse;
import com.spring.Spring.DTO.TodoRequestDTO;
import com.spring.Spring.DTO.TodoResponseDTO;
import com.spring.Spring.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@CrossOrigin
public class TodoController {

    @Autowired
    public TodoService todo;

    @PostMapping
    public TodoResponseDTO AddTask(@RequestBody TodoRequestDTO task){
        return todo.createTask(task);
    }

    @GetMapping
    public ResponseEntity<ApiResponse<Page<TodoResponseDTO>>> GetTask(@RequestParam int page , @RequestParam int size){
        return ResponseEntity.ok(
                new ApiResponse<>(200,"task fetched successfully",todo.getTasks(page, size)));
    }

}
