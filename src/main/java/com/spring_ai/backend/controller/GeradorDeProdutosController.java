package com.spring_ai.backend.controller;

import org.springframework.ai.chat.client.ChatClient;
//import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gerador")
public class GeradorDeProdutosController {
    private final ChatClient chatClient;


//    Builder - builder controe o chatClient, sem ele não dá
    public GeradorDeProdutosController(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }


    @GetMapping
    public String gerarProduto() {
        var pergunta = "Gere 5 produtos ecologicos.";

        return this.chatClient.prompt()
                .user(pergunta)
                .call()
                .content();
    }
}
