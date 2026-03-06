package com.spring.Spring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "todo")
@Setter
@Getter
@NoArgsConstructor@AllArgsConstructor
public class Todo extends BaseEntity {

    @Id
    @GeneratedValue()
    @UuidGenerator
    private UUID id;

    private String task;

}
