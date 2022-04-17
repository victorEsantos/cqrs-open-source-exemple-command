package com.example.command.user.service;


import com.example.command.util.ServiceConfigTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static com.example.command.user.CreateUserUseCase.CreateUserCommand;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Service Test - Create new User")
class CreateUserAppServiceTest extends ServiceConfigTest {

    @Test
    void deveCriarUmNovoUser() {
        var cmd = CreateUserCommand
                .builder()
                .id(UUID.randomUUID())
                .name("Name321")
                .cpf("59773679020")
                .email("user@gmail.com")
                .build();

        var userId = createUserUseCase.handle(cmd);

        //CUIDADO ao usar @GeneratedValue AUTO no dominio, este teste não funcionará como esperado
        var userCreated = userDomainRepository.findById(userId);

        assertNotNull(userCreated);
    }
}
