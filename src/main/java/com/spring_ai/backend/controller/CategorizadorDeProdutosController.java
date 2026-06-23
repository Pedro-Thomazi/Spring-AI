package com.spring_ai.backend.controller;

import com.knuddels.jtokkit.Encodings;
import com.knuddels.jtokkit.api.EncodingType;
import com.knuddels.jtokkit.api.ModelType;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.ChatOptions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorizador")
public class CategorizadorDeProdutosController {
    private final ChatClient chatClient;


//    Builder - builder controe o chatClient, sem ele não dá
    public CategorizadorDeProdutosController(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }

    @GetMapping
    public String categorizar(@RequestParam String produto) {
        var system = """
    Você é um categorizador de produtos e deve responder apenas o nome da categoria do produto informado
        
    Escolha uma categoria dentro da lista abaixo:
    1. Higiene pessoal
    2. Eletrônicos
    3. Esportes
    4. Outros
        
    ###### exemplo de uso:
        
    Pergunta: Bola de futebol
    Resposta: Esportes
    """;

        var opt = ChatOptions.builder()
                .temperature(.85)
                .build();

        try{
            return this.chatClient.prompt()
                    .system(system) // Configs do sistema
                    .user(produto) // Pergunta do usuário
                    .call()
                    .content();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private int contarTokens(String system, String user){
        var registry = Encodings.newDefaultEncodingRegistry();
        var enc = registry.getEncodingForModel(ModelType.GPT_4O_MINI);

        return enc.countTokens(system + user);
    }
}
