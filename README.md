# Spring AI - Integração com APIs de Inteligência Artificial Generativa

## Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de explorar o módulo Spring AI para integração com APIs de inteligência artificial generativa utilizando Spring Boot.

Ao longo do desenvolvimento, aprendi como integrar aplicações Java com provedores de IA generativa, principalmente para geração de texto, além de exemplos envolvendo geração de imagens.

---

# O que foi aprendido

* Geração de texto
* Geração de imagens
* Recursos multimodais como vídeos e áudios
* Exploração da documentação oficial do módulo

---

## Criação do Projeto

O projeto foi criado utilizando o Spring Initializr e importado para a IDE.

---

## Integração com a OpenAI utilizando Spring AI

Foi implementada uma classe responsável pela geração de nomes de produtos, permitindo compreender na prática como realizar chamadas para a API da OpenAI utilizando Spring.

Também foi estudado o fluxo de requisição utilizando:

```java
chatClient.prompt()
```

Com encadeamento dos métodos:

* `user()`
* `call()`
* `content()`

Esse fluxo mostrou como o Spring simplifica a integração com APIs de inteligência artificial generativa.

---

## Contagem de Tokens

Também aprendi a realizar contagem de tokens utilizando a biblioteca externa JTokkit.

---

## Configurações e Ajustes de IA

Foram realizados estudos sobre:

* Configuração de temperatura no Playground da OpenAI
* Simulações para diferentes cenários
* Ajuste de parâmetros para casos de uso específicos

---

## Geração de Imagens

Foi implementada integração para geração de imagens utilizando as classes de `ImageModel`.

Além disso, foi estudado o suporte multimodal oferecido pelo Spring AI, incluindo:

* Imagens
* Vídeos
* Áudios

---

## Personalizações e Segurança

* Personalização de propriedades do Spring
* Alteração de padrões do framework
* Boas práticas de segurança

Uma das principais práticas abordadas foi armazenar a chave da API em variáveis de ambiente.

---

## Tratamento de Erros

* Tratamento de erros
* Personalização de retentativas
* Cenários onde a API esteja fora do ar

---

# Conclusão

Ao longo do curso, foram explorados diversos recursos do Spring AI e sua integração com APIs de inteligência artificial generativa.

O foco principal foi compreender como utilizar a API do Spring para implementar funcionalidades baseadas em IA generativa em aplicações Java, permitindo automatizar processos e criar soluções mais eficientes para desenvolvedores e usuários.
