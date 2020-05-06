package com.github.antoniolike.thefantasy.model.occupation;

public class Message {

	private String message;
	private EPosition position;
	
	public Message(String message, EPosition position) {
		this.message = message;
		this.position = position;
	}

	public String getMessage() {
		return message;
	}
	
	public EPosition getPosition() {
		return position;
	}
	
}
