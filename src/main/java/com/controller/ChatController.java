package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.ChatMessage;

@Controller
public class ChatController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @GetMapping("/chat")
    public String showChatForm(Model model) {
        ChatMessage chatMessage = new ChatMessage(null, null, null, null, null);
        model.addAttribute("chatMessage", chatMessage);
        return "chat";
    }

    @PostMapping("/chat")
    public String sendMessage(@ModelAttribute("chatMessage") ChatMessage chatMessage) {
        messagingTemplate.convertAndSend("/topic/chat", chatMessage);
        return "redirect:/chat";
    }
}

    

