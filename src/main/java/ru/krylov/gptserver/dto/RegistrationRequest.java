package ru.krylov.gptserver.dto;

import lombok.Data;

@Data
public class RegistrationRequest {
    private String username;
    private String password;
}