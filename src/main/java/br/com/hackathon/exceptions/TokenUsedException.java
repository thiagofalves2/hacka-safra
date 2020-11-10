package br.com.hackathon.exceptions;

public class TokenUsedException extends Exception {
	
	private static final long serialVersionUID = -6228727161318686028L;

	public TokenUsedException(String msg) {
		super(msg);
	}
	
}
