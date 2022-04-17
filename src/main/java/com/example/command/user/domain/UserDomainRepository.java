package com.example.command.user.domain;

import java.util.List;
import java.util.UUID;

public interface UserDomainRepository {
    void save(User user);
    User findById(UUID id);
    List<User> findAll();
}
