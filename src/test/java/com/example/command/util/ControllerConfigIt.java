package com.example.command.util;

import com.example.command.user.service.CreateUserAppService;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
//@ActiveProfiles(profiles = "test")
@AutoConfigureMockMvc
public class ControllerConfigIt {
    @MockBean
    protected CreateUserAppService createUserAppService;
}
