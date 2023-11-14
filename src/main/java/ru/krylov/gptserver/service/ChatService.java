package ru.krylov.gptserver.service;

import org.springframework.stereotype.Service;
import ru.krylov.gptserver.integration.GptProvider;

@Service
public class ChatService {

    private final GptProvider gptProvider;

    public ChatService(GptProvider gptProvider) {
        this.gptProvider = gptProvider;
    }

    public String getReply(String userMessage) {
        // TODO: Интеграция с GPT для получения ответа на сообщение пользователя
        return "Место для интеграции с GPT.";
    }
}