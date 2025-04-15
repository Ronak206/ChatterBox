package com.chat.app.model;

import java.awt.JobAttributes.MultipleDocumentHandlingType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class ChatMessage {
	
	public Long id;
	private String sender;
	private String content;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ChatMessage(Long id, String sender, String content) {
		super();
		this.id = id;
		this.sender = sender;
		this.content = content;
	}
	public ChatMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ChatMessage [id=" + id + ", sender=" + sender + ", content=" + content + "]";
	}
	
	
	
}
