package ru.krylov.gptserver.dto;

public class ChatMessageResponse {
    private String message;

    public ChatMessageResponse(String message) {
        this.message = message;
    }

    // Getter и возможно setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}