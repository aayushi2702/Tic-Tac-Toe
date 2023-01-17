package com.tictactoe.game.service;

import org.springframework.stereotype.Service;

import com.tictcatoe.game.exceptions.InvalidTurnException;

@Service
public class GameService {

	public String playGame(char player) {

		String message = null;
		if (player == 'X') {
			message = "Player X moved first";
		} else if (player == 'O') {
			throw new InvalidTurnException("Player X should move first");
		}
		return message;
	}
}