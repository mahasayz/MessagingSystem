package com.epam.interviews;

/**
 * The abstract class {@code Message} is a common superclass
 * of all classes that actually implement the messages. 
 * <p>
 * This has been added to provide a way to implement different types of
 * message, say it be text or byte messages. 
 *
 * @author Mahbub
 *
 */

abstract public class Message {
	
	/**
	 * Sets the message body for the message
	 * @param message
	 */
	public abstract void setMessage (Object message);
	
	/**
	 * Returns the message body of the message
	 * @return
	 */
	public abstract Object getMessage();
	
}
