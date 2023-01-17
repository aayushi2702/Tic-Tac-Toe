package com.tictactoe.game.service;

import org.springframework.stereotype.Service;

import com.tictactoe.game.enums.Player;
import com.tictcatoe.game.exceptions.InvalidTurnException;

@Service
public class GameService {

	public String playGame(Player player) {

		String message = null;
		if (player == Player.X) {
			message = "Player X moved first";
		} else if (player == Player.O) {
			throw new InvalidTurnException("Player X should move first");
		}
		return message;
	}
}