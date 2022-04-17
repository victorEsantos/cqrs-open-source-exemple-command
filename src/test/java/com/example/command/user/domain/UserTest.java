package com.example.command.user.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserTest {

    @Test
    @DisplayName("should build a user")
    void shouldBuildUser() {

        var userId = UUID.randomUUID();
        var name = "UserName";
        var email = "user@email.com";
        var cpf = "46357904015";

        var user = User
                .builder()
                .id(userId)
                .name(name)
                .email(email)
                .cpf(cpf)
                .build();

        assertNotNull(user);
        assertEquals(userId, user.getId());
        assertEquals(name, user.getName());
        assertEquals(email, user.getEmail());
        assertEquals(cpf, user.getCpf());

    }
}
