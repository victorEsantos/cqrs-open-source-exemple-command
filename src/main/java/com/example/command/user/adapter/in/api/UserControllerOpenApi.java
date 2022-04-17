package com.example.command.user.adapter.in.api;

import com.example.command.user.CreateUserUseCase.CreateUserCommand;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface UserControllerOpenApi {

    @Operation(description = "Create new user", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "202", description = "User created successfully"),
            @ApiResponse(responseCode = "400", description = "Can't create, due to invalid status")
    })
    ResponseEntity<String> create(@Valid @RequestBody CreateUserCommand command);
}
