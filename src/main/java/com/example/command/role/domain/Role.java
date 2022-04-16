package com.example.command.role.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
public class Role {
    @Id
    private UUID id;

    private String name;

    private String description;
}
