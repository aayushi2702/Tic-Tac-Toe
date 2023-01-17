package com.tictactoe.game.response;

public class ErrorResponse {

	private String warning;

	public ErrorResponse(String warning) {
		this.warning = warning;
	}

	public String getWarning() {
		return warning;
	}
}