package com.tictactoe.game.service;

import org.springframework.stereotype.Service;

import com.tictactoe.game.enums.Player;
import com.tictactoe.game.enums.Position;
import com.tictactoe.game.response.GameResponse;
import com.tictactoe.game.service.impl.GameBoard;
import com.tictcatoe.game.exceptions.InvalidPositionException;
import com.tictcatoe.game.exceptions.InvalidTurnException;
import com.tictcatoe.game.exceptions.PositionOccupiedException;

@Service
public class GameService {

	private static final int ZERO = 0;
	private final GameBoard gameBoard;
	private char previousPlayer;

	public GameService(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
	}

	public GameResponse playGame(Player player, int position) {

		validateCurrentTurn(player, position);
		savePlayerOnBoard(player, position);
		if (isWinnerAvailable()) {
			return new GameResponse(String.format("Player %s won the game", player), "GAME_OVER");
		} else if (gameBoard.isBoardFull()) {
			return new GameResponse("Game is a Tie", "GAME_OVER");
		}
		return new GameResponse("GAME_IN_PROGRESS", getNextPlayer(player), player);
	}

	private boolean isPlayerO(Player player) {
		return player == Player.O;
	}

	private Player getNextPlayer(Player player) {
		return player == Player.X ? Player.O : Player.X;
	}

	private boolean isFirstTurn() {
		return gameBoard.getCountOfPositionsOccupied() == ZERO;
	}

	private boolean isSamePlayerPlayingConsecutiveTurns(Player player) {
		return previousPlayer == player.getValue();
	}

	private void validateCurrentTurn(Player player, int position) {

		if (Position.getRowColumnValueOfPosition(position) == Position.DEFAULT) {
			throw new InvalidPositionException("Input position is invalid. Please provide position in range of 1-9");
		} else if (isFirstTurn() && isPlayerO(player)) {
			throw new InvalidTurnException("Player X should move first");
		} else if (isSamePlayerPlayingConsecutiveTurns(player)) {
			throw new InvalidTurnException(String.format("Player %s's turn now", getNextPlayer(player)));
		} else if (gameBoard.getPlayerInPosition(Position.getRowColumnValueOfPosition(position)) != ZERO) {
			throw new PositionOccupiedException(String.format("Position %s is already occupied", position));
		}
	}

	private void savePlayerOnBoard(Player player, int position) {
		gameBoard.setPlayerInPosition(Position.getRowColumnValueOfPosition(position), player);
		previousPlayer = player.getValue();
	}

	private boolean isWinnerAvailable() {
		return gameBoard.isAnyOneOfThreeRowsOccupiedBySamePlayer()
				|| gameBoard.isAnyOfThreeColumnsOccupiedBySamePlayer()
				|| gameBoard.isAnyOfTwoDiagonalOccupiedBySamePlayer();
	}
}