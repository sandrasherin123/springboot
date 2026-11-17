package spring.SpringAIWithOllama.controller;


import org.springframework.web.bind.annotation.*;

import spring.SpringAIWithOllama.entity.InterviewQuestion;
import spring.SpringAIWithOllama.service.ChatService;

@RestController
@RequestMapping("/api/ai")
//@CrossOrigin(origins = "*")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/ask")
    public InterviewQuestion ask(@RequestParam String topic) {
        return chatService.askAI(topic);
    }
    @
}
