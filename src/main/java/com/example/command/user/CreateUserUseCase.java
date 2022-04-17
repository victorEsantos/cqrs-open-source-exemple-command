package com.example.command.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public interface CreateUserUseCase {

    UUID handle(CreateUserCommand cmd);

    @Value
    @Builder
    @ApiModel(description = "Info to create a new user")
    class CreateUserCommand {

        @ApiModelProperty(required = true)
        private final UUID id;

        @NotNull
        private final String name;

        @CPF
        private String cpf;

        @Email
        private String email;

    }
}
