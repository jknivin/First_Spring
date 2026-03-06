package com.spring.Spring.service;

import com.spring.Spring.DTO.TodoRequestDTO;
import com.spring.Spring.DTO.TodoResponseDTO;
import com.spring.Spring.model.Todo;
import com.spring.Spring.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    public TodoRepository repo;

    public TodoResponseDTO createTask(TodoRequestDTO dto){

        Todo todo = new Todo();
        todo.setTask(dto.getTask());

        Todo saved = repo.save(todo);

        return new TodoResponseDTO(
            saved.getId(),
            saved.getTask()
        );
    }

    public Page<TodoResponseDTO> getTasks(int page , int size){
        Pageable pageable = PageRequest.of( page, size);
        return repo.findAll(pageable)
                .map(t -> new TodoResponseDTO(
                        t.getId(),
                        t.getTask()
                ));

    }
}
