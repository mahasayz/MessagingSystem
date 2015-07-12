package com.epam.interviews;

/**
 * Default implementation of the Message type. We are considering the default messages
 * are of type text.
 * @author Mahbub
 *
 */
public class TextMessage extends Message {

	/**
	 * The actual message body
	 */
	private String message = null;
	
	public TextMessage(String message) {
		this.message = message;
	}
	/**
	 * Returns the text message
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

	/**
	 * Sets the text message
	 */
	@Override
	public void setMessage(Object message) {
		// TODO Auto-generated method stub
		this.message = (String) message;
	}
	
	public String toString() {
		return this.message;
	}
	
}
