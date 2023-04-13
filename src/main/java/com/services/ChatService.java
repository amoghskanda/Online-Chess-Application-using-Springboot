package com.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.ChatMessage;

@Service
public class ChatService {
    
    private List<ChatMessage> chatMessages = new ArrayList<>();
    
    public void addMessage(ChatMessage message) {
        chatMessages.add(message);
    }
    
    public List<ChatMessage> getAllMessages() {
        return chatMessages;
    }
    
    public void clearAllMessages() {
        chatMessages.clear();
    }
}
    

