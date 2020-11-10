package br.com.hackathon.exceptions;

public class UserNotFoundException extends Exception {
	
	private static final long serialVersionUID = -6228727161318686028L;

	public UserNotFoundException(String msg) {
		super(msg);
	}
	
}
