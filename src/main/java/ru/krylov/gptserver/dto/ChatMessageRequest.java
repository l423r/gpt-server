package ru.krylov.gptserver.dto;

public class ChatMessageRequest {
    private String message;

    // Getter и setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}