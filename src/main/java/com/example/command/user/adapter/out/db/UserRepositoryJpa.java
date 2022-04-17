package com.example.command.user.adapter.out.db;

import com.example.command.user.domain.User;
import com.example.command.user.domain.UserDomainRepository;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface UserRepositoryJpa extends UserDomainRepository, Repository<User, UUID> {
}
