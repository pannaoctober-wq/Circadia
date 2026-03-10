package com.chatbot;

import org.springframework.web.bind.annotation.*;

@RestController
public class ChatController {

    private final ClaudeService claudeService;

    public ChatController(ClaudeService claudeService){
        this.claudeService = claudeService;
    }

    @PostMapping("/chat")
    public String chat(@RequestBody MessageRequest request){

        return claudeService.askClaude(request.message);

    }

}

class MessageRequest{
    public String message;
}
