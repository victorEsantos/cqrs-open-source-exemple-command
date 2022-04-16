package com.example.command.user.domain;

import com.example.command.role.domain.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import java.util.Set;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
public class User {
    @Id
    private UUID id;

    private String name;

    @CPF
    private String cpf;

    @Email
    private String email;

    @OneToMany
    private Set<Role> role;

}
