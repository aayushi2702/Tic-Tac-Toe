package com.tictactoe.game.service;

import org.springframework.stereotype.Service;

@Service
public class GameService {

	public String playGame(char player) {

		String message = null;
		if (player == 'X') {
			message = "Player X moved first";
		}
		return message;
	}
}