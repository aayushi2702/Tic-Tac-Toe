package com.tictactoe.game.service;

import org.springframework.stereotype.Service;

import com.tictactoe.game.enums.Player;
import com.tictactoe.game.service.impl.GameBoard;
import com.tictcatoe.game.exceptions.InvalidTurnException;

@Service
public class GameService {

	private final GameBoard gameBoard;

	public GameService(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
	}

	public String playGame(Player player, int row, int column) {

		String message = null;
		if (player == Player.X) {
			message = "Player X moved first";
			gameBoard.setPlayerInPosition(row, column, player);
		} else if (isPlayerO(player)) {
			throw new InvalidTurnException("Player X should move first");
		}
		return message;
	}

	private boolean isPlayerO(Player player) {
		return player == Player.O;
	}
}