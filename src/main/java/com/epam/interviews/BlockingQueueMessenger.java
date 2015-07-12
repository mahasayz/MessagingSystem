package com.epam.interviews;

import java.util.concurrent.BlockingQueue;

/**
 * The BlockingQueue type messaging system where a <b>consumer/receiver</b> is blocked upon
 * calling in from an empty queue. Similarly, in case of a full buffer/queue
 * the <b>producer/sender</b> is blocked until a messaged is consumed at the other end.
 * 
 * @author Mahbub
 *
 */
public class BlockingQueueMessenger implements Messenger {

	BlockingQueue<Message> queue = null;
	
	public BlockingQueueMessenger(BlockingQueue<Message> queue) {
		this.queue = queue;
	}
	
	/**
	 * Send a message to the blocking queue.
	 */
	@Override
	public void send (Message message) {
		try {
			queue.put(message);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Retrieve a message from the blocking queue.
	 */
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
