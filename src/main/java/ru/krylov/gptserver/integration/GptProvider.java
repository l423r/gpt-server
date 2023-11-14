package ru.krylov.gptserver.integration;

import org.springframework.stereotype.Component;

@Component
public class GptProvider {

    public String getGptResponse(String input) {
        // TODO: Реализовать интеграцию с моделью GPT и вернуть ответ
        return "Ответ от модели GPT на '" + input + "'";
    }
}