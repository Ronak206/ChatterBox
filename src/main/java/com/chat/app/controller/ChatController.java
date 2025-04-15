package com.chat.app.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.chat.app.model.ChatMessage;

@Controller
public class ChatController {
	
	// /app/sendMessage
	@MessageMapping("/sendMessage")
	@SendTo("/topic/message")
	public ChatMessage sendMessage(ChatMessage message) {
		return message;
	}
	
	@GetMapping("chat")
	public String chat() {
		// Renders chat.html via Thymeleaf
		return "chat"; // for Thymeleaf template 
	}
	
}
