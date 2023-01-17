package com.tictactoe.game.response;

import com.tictactoe.game.enums.Player;

import lombok.Getter;

@Getter
public class GameResponse {

	private String status;
	private Player nextPlayer;
	private Player currentPlayer;
	private String result;

	public GameResponse(String result, String status) {
		this.result = result;
		this.status = status;
	}

	public GameResponse(String status, Player nextPlayer, Player currentPlayer) {
		this.status = status;
		this.nextPlayer = nextPlayer;
		this.currentPlayer = currentPlayer;
	}
}