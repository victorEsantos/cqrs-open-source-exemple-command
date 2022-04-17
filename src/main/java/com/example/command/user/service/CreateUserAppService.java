package com.example.command.user.service;

import com.example.command.user.CreateUserUseCase;
import com.example.command.user.domain.User;
import com.example.command.user.domain.UserDomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateUserAppService implements CreateUserUseCase {

    private final UserDomainRepository repository;

    @Override
    public UUID handle(CreateUserCommand cmd) {
        var user = User
                .builder()
                .id(cmd.getId())
                .name(cmd.getName())
                .email(cmd.getEmail())
                .cpf(cmd.getCpf())
                .build();

        repository.save(user);

        return user.getId();

    }
}
