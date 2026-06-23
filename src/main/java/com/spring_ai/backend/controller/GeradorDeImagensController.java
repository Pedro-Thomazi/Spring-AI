package com.spring_ai.backend.controller;

import org.springframework.ai.image.ImageModel;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.openai.OpenAiImageOptions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagem")
public class GeradorDeImagensController {

    private final ImageModel imageModel;

    public GeradorDeImagensController(ImageModel imageModel) {
        this.imageModel = imageModel;
    }

    @GetMapping
    public String gerarImagem(@RequestParam String prompt) {

        var options = OpenAiImageOptions.builder()
                .width(1024)
                .height(1024)
                .build();

        var imagePrompt = new ImagePrompt(prompt, options);
        var res = imageModel.call(imagePrompt);
        return res.getResult().getOutput().getB64Json();
    }
}