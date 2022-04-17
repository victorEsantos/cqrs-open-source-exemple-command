package com.example.command.user.domain;

import com.example.command.infra.domain.DomainEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.UUID;

import static java.util.Objects.isNull;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "user_tb")
public class User extends DomainEntity {

    private static final long serialVersionUID = 3891491994329325184L;

    @Id
    private UUID id;

    @NotNull
    private String name;

    @CPF
    private String cpf;

    @Email
    private String email;

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public User(UserBuilder builder) {
        this.id = isNull(builder.id) ? UUID.randomUUID() : builder.id;
        this.name = builder.name;
        this.cpf = builder.cpf;
        this.email = builder.email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (cpf != null ? !cpf.equals(user.cpf) : user.cpf != null) return false;
        return email != null ? email.equals(user.email) : user.email == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cpf != null ? cpf.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
