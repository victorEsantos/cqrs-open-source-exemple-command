package com.example.command.user.domain;

import java.util.UUID;

public class UserBuilder {

    protected UUID id;

    protected String name;

    protected String cpf;

    protected String email;

    public User build() {
        return new User(this);
    }

    public UserBuilder id(UUID id) {
        this.id = id;
        return this;
    }

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }
}
