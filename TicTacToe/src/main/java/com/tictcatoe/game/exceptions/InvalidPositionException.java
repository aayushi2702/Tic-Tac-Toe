package com.tictcatoe.game.exceptions;

public class InvalidPositionException extends RuntimeException {

	public InvalidPositionException(String message) {
		super(message);
	}
}