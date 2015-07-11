package com.epam.interviews;

import java.util.concurrent.BlockingQueue;

public class BlockingQueueMessenger implements Messenger {

	BlockingQueue<Message> queue = null;
	
	public BlockingQueueMessenger(BlockingQueue<Message> queue) {
		this.queue = queue;
	}
	
	@Override
	public void send (Message message) {
		try {
			queue.put(message);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public Message receive() {
		Message message = null;
		try {
			message = queue.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return message;
	}
	
}
