package ru.krylov.gptserver.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<String> handleServiceException(ServiceException exception) {
        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(exception.getMessage());
    }

    @ExceptionHandler(InvalidJwtAuthenticationException.class)
    public ResponseEntity<String> handleInvalidJwtAuthenticationException(InvalidJwtAuthenticationException exception) {
        return ResponseEntity
            .status(HttpStatus.UNAUTHORIZED)
            .body(exception.getMessage());
    }

    // Здесь может быть добавлено более детальное управление другими исключениями
}