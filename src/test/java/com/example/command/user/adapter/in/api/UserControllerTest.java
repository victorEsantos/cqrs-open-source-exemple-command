package com.example.command.user.adapter.in.api;

import com.example.command.util.ControllerConfigIt;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static com.example.command.user.CreateUserUseCase.CreateUserCommand;
import static com.example.command.util.TUtils.toJson;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class UserControllerTest extends ControllerConfigIt {

    @Autowired
    private MockMvc mock;

    @Test
    void deveCriarComSucessoUmaInstanciaDeUserViaController() throws Exception {
        var cmd = CreateUserCommand
                .builder()
                .id(UUID.randomUUID())
                .name("Name321")
                .cpf("59773679020")
                .email("user@gmail.com")
                .build();

        when(createUserAppService.handle(cmd)).thenReturn(UUID.randomUUID());

        mock.perform(request(HttpMethod.POST, UserController.PATH)
                        .contentType(MediaType.APPLICATION_JSON_VALUE).content(toJson(cmd)))
                .andExpect(status().is2xxSuccessful());

        verify(createUserAppService).handle(cmd);

    }
}