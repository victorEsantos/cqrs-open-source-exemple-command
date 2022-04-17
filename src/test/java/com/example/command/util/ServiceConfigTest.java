package com.example.command.util;

import com.example.command.user.CreateUserUseCase;
import com.example.command.user.domain.UserDomainRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
//@ActiveProfiles(profiles = "test") ideal utilizar profiles para não poluir a base de dados com registros gerados nos testes
@Transactional
@Data
public class ServiceConfigTest {

    @Autowired
    protected CreateUserUseCase createUserUseCase;

    @Autowired
    protected UserDomainRepository userDomainRepository;
}
