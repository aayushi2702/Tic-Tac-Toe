package com.tictactoe.game.response;

import com.tictactoe.game.enums.Player;

public class GameResponse {

	private String status;
	private Player nextPlayer;
	private Player currentPlayer;

	public GameResponse(String status, Player nextPlayer, Player currentPlayer) {
		this.status = status;
		this.nextPlayer = nextPlayer;
		this.currentPlayer = currentPlayer;
	}

	public String getStatus() {
		return status;
	}

	public Player getNextPlayer() {
		return nextPlayer;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}
}