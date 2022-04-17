package com.example.command.user.adapter.in.api;

import com.example.command.user.CreateUserUseCase;
import com.example.command.user.CreateUserUseCase.CreateUserCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping(path = UserController.PATH)
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserController implements UserControllerOpenApi{

    public static final String PATH = "/users";

    private final CreateUserUseCase createUser;

    @Override
    @PostMapping
    public ResponseEntity<String> create(@Valid @RequestBody CreateUserCommand command){
        var id = createUser.handle(command);

        var uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();

        return ResponseEntity.created(uri).build();
    }
}
