package com.epam.interviews;

/**
 * The abstract class {@code Messenger} is a common superclass of all classes
 * that actually implement the different types of messaging systems that we
 * could have, say one with BlockingQueue implementation or the other with
 * re-entrant locks.
 * 
 * @author Mahbub
 *
 */
public interface Messenger {

	/**
	 * Send the message to be stored in a data type of choice, be it a queue
	 * or a buffer of some sort. The message shall remain until it has been consumed
	 * at the other end.
	 * 
	 * @param message
	 */
	public void send(Message message);

	/**
	 * Receive the message from the buffer or queue and thereby process it.
	 * @return
	 */
	public Message receive();

}
