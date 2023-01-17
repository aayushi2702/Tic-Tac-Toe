package com.tictcatoe.game.exceptions;

public class PositionOccupiedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PositionOccupiedException(String message) {
		super(message);
	}
}