package ru.krylov.gptserver.controller;

import org.springframework.web.bind.annotation.*;
import ru.krylov.gptserver.dto.ChatMessageRequest;
import ru.krylov.gptserver.dto.ChatMessageResponse;
import ru.krylov.gptserver.service.ChatService;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/send")
    public ChatMessageResponse sendMessage(@RequestBody ChatMessageRequest messageRequest) {
        String reply = chatService.getReply(messageRequest.getMessage());
        return new ChatMessageResponse(reply);
    }
}