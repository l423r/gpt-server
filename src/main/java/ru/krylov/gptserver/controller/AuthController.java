package ru.krylov.gptserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.krylov.gptserver.dto.AuthenticationRequest;
import ru.krylov.gptserver.dto.AuthenticationResponse;
import ru.krylov.gptserver.dto.RegistrationRequest;
import ru.krylov.gptserver.model.User;
import ru.krylov.gptserver.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegistrationRequest registrationRequest) {
        // Имплементация регистрации пользователя
        final var registered = authService.register(registrationRequest);
        return ResponseEntity.ok(registered);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody AuthenticationRequest authenticationRequest) {
        // Имплементация аутентификации пользователя и генерации JWT
        String token = authService.login(authenticationRequest);
        return ResponseEntity.ok(new AuthenticationResponse(token));
    }
}