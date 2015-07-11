package com.epam.interviews;

public interface Messenger {
	
	public void send(Message message);
	
	public Message receive();
	
}
