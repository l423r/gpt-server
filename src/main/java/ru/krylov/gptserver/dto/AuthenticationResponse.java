package ru.krylov.gptserver.dto;

import lombok.Value;

@Value
public class AuthenticationResponse {
    String jwtToken;
}